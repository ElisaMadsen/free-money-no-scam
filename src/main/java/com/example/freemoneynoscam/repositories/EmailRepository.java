package com.example.freemoneynoscam.repositories;
import java.sql.*;


public class EmailRepository {
    static Connection con;
    static Statement stmt;
    static ResultSet rs;

    public static void connectToDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/free_money";
            con = DriverManager.getConnection(url, "root", "password");

            System.out.println("Ok, we have a connection.");

        } catch (SQLException e) {
            System.out.println("Cannot connect to database");
            e.printStackTrace();
        }
    }
/*
    public static String fetchSingleEmail() throws SQLException {

        Statement stmt = con.createStatement();
        String sqlGetLastId = "SELECT MAX(iduser_emails) FROM user_email;";
        rs = stmt.executeQuery(sqlGetLastId);

        String sqlString = "SELECT * FROM user_email WHERE iduser_emails=" + ";";
        rs = stmt.executeQuery(sqlString);
        return "";

    }

 */
}


    /*
    public static void fetchEmail(){

        try{

        stmt = con.createStatement();

        String getValues = "SELECT * FROM user_emails WHERE iduser_emails";

    } catch (SQLException e){
            e.printStackTrace();
        }

        }

     */


