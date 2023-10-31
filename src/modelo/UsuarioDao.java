package modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import static modelo.Conexion.Conectar;

public class UsuarioDao {

    ResultSet rs;
    Usuario u = new Usuario();

    public Usuario ValidarVendedor(String Usuario, String pass) {
        String sql = "SELECT * FROM usuario where userr = ? AND pass = ?";
PreparedStatement ps;
        try {
            Connection acceso = Conectar();
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

    public boolean AddUser(Usuario usuario) {
        PreparedStatement ps;
        Connection con = Conectar();
        String sql = "INSERT INTO usuario(nombre, apellidoM, apellidoP, rut, email, usuario, contraseña)"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
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
        }
        finally{
        try{
        con.close();
        } catch(Exception e){
            System.out.println("Error al conectar");
        }
        }
                 return false;
    }

}
