package modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
public class UsuarioDao {

    PreparedStatement ps;
     Connection con;
    Conexion cn = new Conexion();
    ResultSet rs;
    Usuario u = new Usuario();

    public Usuario ValidarVendedor(String Usuario, String Password) {
       
        try {
            String sql = "SELECT * FROM usuario where usuario = ? AND contraseña = ?";
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Password);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setId(rs.getInt("idusuario"));
                u.setNombre(rs.getString("nombre"));
                u.setAppelidoM(rs.getString("apellidoM"));
                u.setApellidoP(rs.getString("apellidoP"));
                u.setRut(rs.getString("rut"));
                u.setEmail(rs.getString("email"));
                u.setUsuario(rs.getString("usuario"));
                u.setContraseña(rs.getString("contraseña"));
             System.out.println("udao = " + u); 
            }
           
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }

    public boolean AddUser(Usuario usuario) {

        String sql = "INSERT INTO usuario(nombre, apellidoM, apellidoP, rut, email, usuario, contraseña) VALUES(?, ?,?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getAppelidoM());
            ps.setString(3, usuario.getApellidoP());
            ps.setString(4, usuario.getRut());
            ps.setString(5, usuario.getEmail());
            ps.setString(6, usuario.getUsuario());
            ps.setString(7, usuario.getContraseña());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al conectar");
            }
        }
        return false;
    }

    /*public boolean ObtenerUsuario(Usuario usuario) {
        try {
            Usuario user = new Usuario();

            String sql = "SELECT * FROM usuario WHERE usuario = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsuario());
            rs = ps.executeQuery();
            if (rs.next()) {
                user.setId(rs.getInt("idusuario"));
                user.setNombre(rs.getString("nombre"));
                user.setAppelidoM(rs.getString("apellidoM"));
                user.setApellidoP(rs.getString("apellidoP"));
                user.setRut(rs.getString("rut"));
                user.setEmail(rs.getString("email"));
                user.setUsuario(rs.getString("usuario"));
                user.setContraseña(rs.getString("contraseña"));

            }
            System.out.println("userdao = " + user);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {

            } catch (Exception e) {

            }

        }
    } */
}
