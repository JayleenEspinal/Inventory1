package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility {

    private static final String JDBC_URL = "jdbc:mysql://team11.cvofld7lkhqv.us-east-2.rds.amazonaws.com:3306/team11";
    private static final String USERNAME = "admin";

    private static final String PASSWORD = "Brownie1!";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception according to your needs
            }
        }
    }
}
