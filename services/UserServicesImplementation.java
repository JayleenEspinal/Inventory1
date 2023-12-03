package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import models.Users;

public class UserServicesImplementation implements UserServices {
    private DataSource ds;

    public List<Users> userList;

    public UserServicesImplementation(DataSource ds) {
        this.ds = ds;
        userList = new ArrayList<>();
    }

    public UserServicesImplementation() {
    }

    @Override
    public Users getUserInfo(Connection connection, String username) {
        Users user = null;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Users WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new Users();
                user.setUserID(rs.getLong("UserID"));
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                user.setUserRole(rs.getString("UserRole"));
                user.setEmailAddress(rs.getString("EmailAddress"));
                user.setPhoneNumber(rs.getString("PhoneNumber"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserServicesImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
}
