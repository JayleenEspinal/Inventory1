package services;

import java.sql.Connection;
import models.Users;

public interface UserServices {
    Users getUserInfo(Connection c, String username);
}
