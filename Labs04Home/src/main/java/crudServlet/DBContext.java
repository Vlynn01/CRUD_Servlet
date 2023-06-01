package crudServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    public static Connection getConnection() throws Exception {
        String urlMySQL = "jdbc:mysql://localhost/MVCDemo";//port=3306
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");// nap driver
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
        }
        try {
            con = DriverManager.getConnection(urlMySQL, "root", "123456");//ket noi
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return con;
    }
}
