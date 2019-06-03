package sample.repository;

import sample.datos.DbManager;
import sample.models.Clientes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientesRepository {
    final DbManager database;
    
    public ClientesRepository(){
        database=new DbManager("jdbc:postgresql://localhost:5432/test_db","postgres","letmein");
    }

    public void crearclientes(Clientes clientes) throws Exception {
        try{
            Connection con=database.conexion();
            Statement stm=con.createStatement();
            String sql= "INSERT INTO clientes (nombre,direccion,telefono,cedula,activo) values ('"+clientes.getNombre()+"','"+clientes.getDireccion()+"','"+clientes.getTelefono()+"','"+clientes.getCedula()+"',"+clientes.isActivo()+")";
            stm.executeUpdate(sql);
            con.close();
        }catch (SQLException ex){
            throw new Exception(ex);
        }
    }
}
