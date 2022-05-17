package com.kerimovikh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnectionUtils {

    public static Connection getPostgresConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "kerimovikh95";

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(url, user, password);

        return connection;
    }
}
