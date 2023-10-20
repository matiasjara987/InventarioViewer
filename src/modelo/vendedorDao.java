package modelo;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class vendedorDao {
    PreparedStatement ps;
    ResultSet rs;
    vendedor v = new vendedor();
    conexion con  = new conexion();
    Connection acceso;
    
    public vendedor ValidarVendedor(String Usuario, String pass){
        String sql = "SELECT * FROM usuario where userr = ? AND pass = ?";
        
        try{
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()) {
            v.setId(rs.getInt(1));
            v.setNombre(rs.getString(2));
            v.setApellido(rs.getString(3));
            v.setRut(rs.getString(4));
            v.setUsuario(rs.getString(5));
            v.setPass(rs.getString(6));
            
            }
        }catch(Exception e){}
        return v;
    }
}
