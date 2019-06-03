package sample.repository;

import sample.datos.DbManager;
import sample.exceptions.Usuarioexception;
import sample.models.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioRepository {
    final DbManager database;
    public UsuarioRepository(){
        database=new DbManager("jdbc:postgresql://localhost:5432/test_db","postgres","letmein");
    }

    public void createUsuario(Usuario usuario) throws Usuarioexception {
        try{
            Connection con=database.conexion();
            Statement stm=con.createStatement();
            String sql= "insert into usuario (usuarioid,usuario,clave,nombre) values ("+Integer.toString(usuario.getUsuarioid())+",'"+usuario.getUsuario()+"','"+usuario.getClave()+"','"+usuario.getNombre()+"')";
            stm.executeUpdate(sql);
            con.close();
        }catch (SQLException ex){
            throw new Usuarioexception(ex.toString(),ex,1123);
        }
    }
}
