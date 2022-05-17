package com.kerimovikh.jdbc.prepareStatement;

import com.kerimovikh.jdbc.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareStatementExample {

    private static final String SQL = "SELECT emp_id, emp_no, emp_name, dept_id FROM employee WHERE emp_name LIKE ? AND dept_id = ?";

    public static void main(String[] args) {
        try (Connection connection = ConnectionUtils.getMyConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setString(1, "%S");
            preparedStatement.setInt(2, 20);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(" ---- ");
                System.out.println("empId : " + resultSet.getInt("emp_Id"));
                System.out.println("empNo : " + resultSet.getString(2));
                System.out.println("empName : " + resultSet.getString("emp_Name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
