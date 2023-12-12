 package modelo;

public class Usuario {
    
    private int id;
    private String nombre, apellidoP, appelidoM, rut, email;
    private String usuario, contraseña;

    public Usuario() {
    }
    public Usuario(String usuario){
        this.usuario =usuario;
    
    }
    public Usuario( String nombre, String apellidoP, String appelidoM, String rut, String email,String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.appelidoM = appelidoM;
        this.rut = rut;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.email = email;
    }
    
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getAppelidoM() {
        return appelidoM;
    }

    public void setAppelidoM(String appelidoM) {
        this.appelidoM = appelidoM;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", appelidoM=" + appelidoM + ", rut=" + rut + ", email=" + email + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }


}
