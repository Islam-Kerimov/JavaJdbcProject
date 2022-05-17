package com.kerimovikh.jdbc.basic;

import com.kerimovikh.jdbc.ConnectionUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDataExample {

    private static final String SQL = "SELECT emp_id, emp_no, emp_name FROM employee";

    public static void main(String[] args) {
        try (Connection connection = ConnectionUtils.getMyConnection();
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                int empId = resultSet.getInt(1);
                String empNo = resultSet.getString(2);
                String empName = resultSet.getString(3);
                System.out.println("---------------");
                System.out.println("empId: " + empId);
                System.out.println("empNo: " + empNo);
                System.out.println("empName: " + empName);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
