package com.webapp.dao;

import com.webapp.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    public void getUsers() {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("User ID: " + rs.getInt("ID"));
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("Age: " + rs.getString("Age"));
                System.out.println("Role: " + rs.getString("Role"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        userDAO.getUsers();
    }
}
