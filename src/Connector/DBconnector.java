package Connector;

import java.sql.*;

public class DBconnector {
    public static String dburl = "jdbc:mysql://localhost:3306/";// add the database name before using
    public static String dbuser = "root";
    public static String dbpass = "";
    public static String driver = "com.mysql.jdbc.Driver";
    //
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName(driver);

        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);
        if (con != null)
            System.out.println("connected");
        else
            System.out.println("not connected");
    }
}
//we can also make this a getConnection() method instead of main.
