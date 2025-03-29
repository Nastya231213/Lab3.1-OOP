package com.touragency;

import com.touragency.dao.DatabaseConnector;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class DatabaseConnectorTest {

    @Test
    void testDatabaseConnection() {
        try (Connection connection = DatabaseConnector.getConnection()) {
            assertNotNull(connection, "The database connection should not be null");
            System.out.println("Database connection test successful (parameters from database.properties)!");
        } catch (SQLException e) {
            System.err.println("Error during connection test: " + e.getMessage());
            fail("Database connection test failed with error: " + e.getMessage());
        }
    }
}
