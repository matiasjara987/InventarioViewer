
package modelo;

public class Facturas {
    int id;
    String fecha;
    int idusuario;
    double monto;

    public Facturas() {
    }

    public Facturas(int id, String fecha, int idusuario, double monto) {
        this.id = id;
        this.fecha = fecha;
        this.idusuario = idusuario;
        this.monto = monto;
    }

    public Facturas(int id, String fecha, double monto) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
    
}
