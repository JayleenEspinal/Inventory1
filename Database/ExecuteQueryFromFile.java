import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteQueryFromFile {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Inventory";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "4747";

    public static void main(String[] args) {
        try {
            // Read the SQL query from the file
            String filePath = "queries.sql";
            String sqlQuery = readQueryFromFile(filePath);

            // Establish a connection
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                // Execute the query
                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                    // Set parameters
                    preparedStatement.setInt(1, 1); // Replace 1 with the actual ItemGroupID you want to query

                    // Execute the query
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        // Process the result set
                        while (resultSet.next()) {
                            int itemID = resultSet.getInt("ItemID");
                            String itemName = resultSet.getString("ItemName");
                            double inventoryBalance = resultSet.getDouble("InventoryBalance");

                            // Do something with the retrieved data
                            System.out.println("ItemID: " + itemID + ", ItemName: " + itemName + ", InventoryBalance: " + inventoryBalance);
                        }
                    }
                }
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static String readQueryFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readString(path);
    }
}

