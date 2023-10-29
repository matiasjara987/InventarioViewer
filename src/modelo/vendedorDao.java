package modelo;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class vendedorDao {
    PreparedStatement ps;
    ResultSet rs;
    Usuario u = new Usuario();
    Conexion con  = new Conexion();
    Connection acceso;
    
    public Usuario ValidarVendedor(String Usuario, String pass){
        String sql = "SELECT * FROM usuario where userr = ? AND pass = ?";
        
        try{
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()) {
            u.setId(rs.getInt(1));
            u.setNombre(rs.getString(2));
            u.setApellidoP(rs.getString(3));
            u.setRut(rs.getString(4));
            
            }
        }catch(Exception e){}
        return u;
    }
    
}
