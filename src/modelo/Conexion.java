
package modelo;
import java.sql.*;

public class Conexion {    
    Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/software";
    private static final String USER = "root";
    private static final String PASSWORD ="admin";
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (Exception e){
            System.out.println("error en conectar");
           System.out.println("Ocurrio un error:" +e.getMessage()); 
        }
        return con;
    } //fin metodo 
    
    
    
    
} //fin class conexion
