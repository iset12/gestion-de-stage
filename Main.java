package stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Create an instance of your base connection class
        connection connectionManager = new connection();

        // Get a connection from the connection manager
        Connection connection = connectionManager.getConnection();

        if (connection != null) {
            try {
                // Insert data into a table
                String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, "john_doe");
                statement.setString(2, "john@example.com");
                statement.setString(3, "password123");
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new user was inserted successfully!");
                }

                // Close resources
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } 
        } else {
            System.err.println("Failed to establish connection to the database.");
        }
    }
}
