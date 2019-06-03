package sample.models;

public class Clientes {
    private int clienteid;
    private String nombre;
    private String direccion;
    private String telefono;
    private String cedula;
    private boolean activo;

    public Clientes(int clienteid, String nombre, String direccion, String telefono, String cedula, boolean activo) {
        this.clienteid = clienteid;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula = cedula;
        this.activo = activo;
    }

    public Clientes(){
        this(0,"","","","",true);
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
