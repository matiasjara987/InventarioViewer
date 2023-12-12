package modelo;

import java.sql.*;
import java.sql.DriverManager;

public class conexion {

    Connection con;
    String url = "jdbc:mysql://localhost:3306/software?useSSL=false&useTimezone=true&serverTimezone=UTC";
    String user = "root";
    String Pass = "admin";

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, Pass);


        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace(System.out); 
        }
        return con;

    }
}
