
package modelo;


public class Detalle {
    int iddetalle;
    int idProducto;
    int idFactura;
    int cantidad;
    double preciofac;

    public Detalle() {
    }

    public Detalle(int iddetalle, int idProducto, int idFactura, int cantidad, double preciofac) {
        this.iddetalle = iddetalle;
        this.idProducto = idProducto;
        this.idFactura = idFactura;
        this.cantidad = cantidad;
        this.preciofac = preciofac;
    }

    public int getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(int iddetalle) {
        this.iddetalle = iddetalle;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreciofac() {
        return preciofac;
    }

    public void setPreciofac(double preciofac) {
        this.preciofac = preciofac;
    }
    
}
