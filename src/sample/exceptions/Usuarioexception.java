package sample.exceptions;

public class Usuarioexception extends Exception {
    private String mensaje;
    private int codigo;
    public Usuarioexception(String message, Throwable cause,int codigo) {
        super(message, cause);
        this.mensaje=message;
        this.codigo=codigo;
    }

    public void printerror(){
        System.out.println("Ha ocurrido un error guardando el usuario \n"+mensaje+"\n"+"Codigo: "+Integer.toString(codigo));
    }
}
