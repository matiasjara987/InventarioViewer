package modelo;

public class vendedor {
    
    private int id;
    private String nombre, apellido, rut, Usuario, pass;

    public vendedor() {
    }

    public vendedor(int id, String nombre, String apellido, String rut, String Usuario, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.Usuario = Usuario;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
