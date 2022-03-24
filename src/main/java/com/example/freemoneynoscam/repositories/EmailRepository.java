package com.example.freemoneynoscam.repositories;
import java.sql.*;


public class EmailRepository {
    static Connection con;
    static Statement stmt;
    static ResultSet rs;

    public static void connectToDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/free_money";
            con = DriverManager.getConnection(url, "root", "MySQL!123");

            System.out.println("Ok, we have a connection.");

        } catch (SQLException e) {
            System.out.println("Cannot connect to database");
            e.printStackTrace();
        }
    }

    public static String fetchSingleEmail() throws SQLException {
            String printedEmail = "";
            stmt = con.createStatement();

            String getValues = "SELECT * from user_emails";

            rs = stmt.executeQuery(getValues);

            while(rs.next())
            {
                String email= rs.getString("email");

                System.out.println("\tEmail = " + email);
            }
            return printedEmail;
        }
    }




