package com.kerimovikh.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getMyConnection() {
        return PostgresConnectionUtils.getPostgresConnection();
    }

    public static void main(String[] args) {
        System.out.println("Get connection...");

        Connection connection = ConnectionUtils.getMyConnection();

        System.out.println("Get connection " + connection);
        System.out.println("Done!");
    }
}
