package com.kerimovikh.transaction;

import com.kerimovikh.jdbc.ConnectionUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionExample {

    public static void main(String[] args) {
        try (Connection connection = ConnectionUtils.getMyConnection()) {

            connection.setAutoCommit(false);
            try {
                connection.commit();
            } catch (Exception e) {
                connection.rollback();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
