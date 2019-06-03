package sample.models;

public class Usuario {
    private int usuarioid;
    private String usuario;
    private String clave;
    private String nombre;

    public Usuario(){}

    public Usuario(int usuarioid, String usuario, String clave, String nombre) {
        this.usuarioid = usuarioid;
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
    }

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
