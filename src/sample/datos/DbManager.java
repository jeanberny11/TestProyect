package sample.datos;

import java.sql.*;

public class DbManager {
    private final String url;
    private final String usuario;
    private final String clave;

    public DbManager(String url,String usuario,String clave){
        this.url=url;
        this.usuario=usuario;
        this.clave=clave;
    }


    public Connection conexion() throws SQLException {
        try {
            return DriverManager.getConnection(url, usuario, clave);
        }catch (SQLException ex){
            throw new SQLException(ex);
        }
    }
}
