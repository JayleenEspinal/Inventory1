package inventorymanagementsystem;

import Database.DatabaseUtility;
import services.UserServicesImplementation;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import models.Users;

public class InventoryManagementSystem {

    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Welcome to the Inventory Management System");

            System.out.println("Enter your username to continue: ");
            String username = scnr.nextLine();

            System.out.println("Enter the corresponding password to continue: ");
            String password = scnr.nextLine();

            try {
                Connection c = DatabaseUtility.getConnection(); // Obtain db connection

                // Create an instance of UserServicesImplementation
                UserServicesImplementation userServiceImpl = new UserServicesImplementation();

                // Use the connection and instance to call getUserInfo
                Users user = userServiceImpl.getUserInfo(c, username);

                if (user != null && user.getPassword().equals(password)) {
                    System.out.println(username + " has successfully authenticated.");
                } else {
                    System.out.println(username + " is not a valid username or password");
                    if (user != null) {
                        user.toString();
                    } else {
                        System.out.println("User object is null");
                    }
                }
                

                DatabaseUtility.closeConnection(c); // Pass the Connection object to closeConnection

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } 
    }
}

