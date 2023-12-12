package modelo;
import java.sql.*;
import java.util.ArrayList;

public class FacturasDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;

    public String idFactura() {
        String idfactura = "";
        String sql = "select max(idfactura) from factura";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idfactura = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("error en idfacturas");
            System.out.println("Ocurrio un error:" + e.getMessage());
        }//fincatch
        return idfactura;
    }//finmetodo

    public int GuardarF(Facturas f) {
        Facturas facturas = new Facturas();
        String sql = "insert into factura() values (?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, f.getId());
            ps.setString(2, f.getFecha());
            ps.setInt(3, f.getIdusuario());
            ps.setDouble(4, f.getMonto());
            r = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("error de guardar Facturas");
            System.out.println("Ocurrio un error:" + e.getMessage());
        }
        return r;
    }

    public int GuardarDetalle(Detalle d) {
        String sql = "insert into detalle(id_producto, id_factura, cantidad, precio ) values (?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, d.getIdProducto());
            ps.setInt(2, d.getIdFactura());
            ps.setInt(3, d.getCantidad());
            ps.setDouble(4, d.getPreciofac());
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("error de guardar detalle");
            System.out.println("Ocurrio un error:" + e.getMessage());
        }
        return r;
    }
    
    public  ArrayList<Facturas> listar () throws Exception{
    
     ArrayList<Facturas> fact = new ArrayList<Facturas>();
     try{   
     con = cn.Conectar();
     String sql = "SELECT * FROM factura";
     Statement st = con.createStatement();
     rs = st.executeQuery(sql);
     
     
     
     while(rs.next()){
        int idfactura = rs.getInt("idfactura");
        String fecha = rs.getString("fecha");
        double monto = rs.getDouble("monto");
        fact.add(new Facturas(idfactura, fecha, monto));
        
     }
     }catch(Exception e){
         System.out.println("Error al listar" + e.getMessage());
     }
     return fact;
            }
     public int contarVentas(){
     String sql = "select count(*) from factura";
     try{
     con = cn.Conectar();
     ps = con.prepareStatement(sql);
     rs = ps.executeQuery();
        if(rs.next()){
            r = rs.getInt(1);
        }
     }catch(Exception e){
         System.out.println("error contar" + e.getMessage());
     }
     return r;
     }
     
     public Double sumarventas(){
         double r = 0;
         try{
         String sql ="Select SUM(monto) from factura";
         con = cn.Conectar();
         ps = con.prepareStatement(sql);
         rs = ps.executeQuery();
            if(rs.next()){
            r = rs.getDouble(1);
            }
         }catch(Exception e){
             System.out.println("error:" +e.getMessage());
         }
         return r;
     }
     
     public int sumarproductos(){
         con = cn.Conectar();
         try{
         String sql = "select sum(cantidad) from detalle";
         ps = con.prepareStatement(sql);
         rs = ps.executeQuery();
             if (rs.next()) {
                 r = rs.getInt(1);
             }
         }catch(Exception e){
             System.out.println("error:"+ e.getMessage());
         }
                  return r;

         }
           
}//finclass
