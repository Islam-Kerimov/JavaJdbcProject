package com.kerimovikh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private static Connection getMyConnection() throws SQLException, ClassNotFoundException {
        return PostgresConnectionUtils.getPostgresConnection();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Get connection...");

        Connection connection = ConnectionUtils.getMyConnection();

        System.out.println("Get connection " + connection);
        System.out.println("Done!");
    }
}
