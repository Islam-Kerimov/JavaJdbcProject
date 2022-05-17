package com.kerimovikh.jdbc.basic;

import com.kerimovikh.jdbc.ConnectionUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataExample {

    private static final String SQL_INSERT = "INSERT INTO salary_grade (grade, high_salary, low_salary) VALUES (2, 20000, 10000)";

    public static void main(String[] args) {
        try (Connection connection = ConnectionUtils.getMyConnection();
             Statement statement = connection.createStatement()) {

            int rowCount = statement.executeUpdate(SQL_INSERT);
            System.out.println("Row Count affected = " + rowCount);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
