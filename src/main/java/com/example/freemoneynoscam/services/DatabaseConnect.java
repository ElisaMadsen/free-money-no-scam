package com.example.freemoneynoscam.services;

import java.sql.*;

public class DatabaseConnect {
    static Connection con;
    static Statement stmt;

    public static void connectDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/free_money";
            con = DriverManager.getConnection(url, "root", "");

            System.out.println("Ok, we have a connection.");

        } catch (SQLException e) {
            System.out.println("Cannot connect to database");
            e.printStackTrace();
        }
    }

    public static void insertEmail(String email) {

        try {
            stmt = con.createStatement();
            String sqlString = "INSERT INTO user_emails (`email`)" + " VALUES ('" + email + "');";

            stmt.executeUpdate(sqlString);

            System.out.println(sqlString);

        } catch (SQLException e) {
            System.out.println("fail when inserted");
            e.printStackTrace();
        }
    }
}



