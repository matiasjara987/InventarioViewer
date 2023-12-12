package modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public List<Producto> listar() {

        List<Producto> productos = new ArrayList<>();
        String sql = "select * from producto";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdproducto(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setId_clasificacion(rs.getInt(4));
                p.setStock(rs.getInt(5));

                productos.add(p);
            }
        } catch (Exception e) {
            System.out.println("error en listar");
            System.out.println("Ocurrio un error:" + e.getMessage());
        }
        return productos;

    }

    public int add(Producto producto) {
        int r = 0;
        String sql = "insert into producto(idproducto, nombre, precio, id_clasificacion, stock ) values (?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getIdproducto());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getId_clasificacion());
            ps.setInt(5, producto.getStock());
            r = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("error de add");
            System.out.println("Ocurrio un error:" + e.getMessage());
        }
        return r;
    }

    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update producto set nombre = ?, precio = ?, id_clasificacion = ?, stock = ? where idproducto = ? ";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0] );
            ps.setObject(2,o[1] );
            ps.setObject(3,o[2] );
            ps.setObject(4,o[3] );
            ps.setObject(5,o[4] );
            r = ps.executeUpdate();
            

        } catch (Exception e) {
            System.out.println("Error de update");
            System.out.println("Ocurrio un error:" + e.getMessage());
          
        }
       return r;
    }

    public void eliminar(int id) {
        String sql = "delete from producto where idproducto = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            

        } catch (Exception e) {
            System.out.println("error en eliminar");
            System.out.println("Ocurrio un error:" + e.getMessage());
            
        }

    }
    
    //BUSCAR PRODUCTO O EL CODIGO DEL PRODUCTO
    public Producto listarid (int id){
       Producto p = new Producto();
       String sql = "select * from producto where idproducto = ?";
       try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
           while (rs.next()) {

               p.setIdproducto(rs.getInt(1));
               p.setNombre(rs.getString(2));
               p.setPrecio(rs.getDouble(3));
               p.setId_clasificacion(rs.getInt(4));
               p.setStock(rs.getInt(5));
           }


        } catch (Exception e) {
            System.out.println("error en listarid");
            System.out.println("Ocurrio un error:" + e.getMessage());
            
        }
       return p;
    }
    public int ActualizarStock(int stock, int ipr){
   int r = 0;
        String sql = "UPDATE producto set stock = ? where idproducto = ? ";
    try{
    con = cn.Conectar();
    ps = con.prepareStatement(sql);
    ps.setInt(1, stock);
    ps.setInt(2, ipr);
    r = ps.executeUpdate();
        System.out.println("Valor cmabio" + r);
    
    }catch(Exception e){
        System.out.println("error de update = " + e);
    }
    return r;
    }

} //finclass productoDAO
