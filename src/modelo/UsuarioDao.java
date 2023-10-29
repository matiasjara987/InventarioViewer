package modelo;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {

    Statement stmt;
    PreparedStatement ps;
    ResultSet rs;
    Usuario u = new Usuario();
    Conexion con = new Conexion();
    Connection acceso;

    public Usuario ValidarVendedor(String Usuario, String pass) {
        String sql = "SELECT * FROM usuario where userr = ? AND pass = ?";

        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setId(rs.getInt(1));
                u.setNombre(rs.getString(2));
                u.setApellidoP(rs.getString(3));
                u.setRut(rs.getString(4));

            }
        } catch (Exception e) {
        }
        return u;
    }

    public Boolean AddUser(Usuario usuario) {
        try {
            stmt = acceso.createStatement();
            String query = "INSERT INTO usuario (nombre, apellidoM, apellidoP, rut, email, usuario, contraseña)"
                    + "VALUES('" + usuario.getNombre() + "','" + usuario.getAppelidoM() + "','" + usuario.getApellidoP()
                    + "','" + usuario.getRut() + "','" + usuario.getEmail() + "','" + usuario.getUsuario() + "','" + usuario.getContraseña() + "')";
            stmt.execute(query);
            return true;
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
        return false;
    }

    public Usuario GetUsuario(String Usuario) {
        Usuario user = null;
        try {
            stmt = acceso.createStatement();
            String query = "SELECT * FROM usuario WHERE usuario = '" + Usuario + "'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                user = new Usuario();
                user.setId(rs.getInt("id"));
                user.setNombre(rs.getString("nombre"));
                user.setAppelidoM(rs.getString("apellidoM"));
                user.setApellidoP(rs.getString("apellidoP"));
                user.setRut(rs.getString("rut"));
                user.setEmail(rs.getString("email"));
                user.setUsuario(rs.getString("usuario"));
                user.setContraseña(rs.getString("contraseña"));
                
                return user;
            }
        } catch (SQLException e) {

        }

        return user;
    }

}
