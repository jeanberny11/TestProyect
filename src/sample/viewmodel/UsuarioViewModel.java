package sample.viewmodel;

import sample.exceptions.Usuarioexception;
import sample.models.Usuario;
import sample.repository.UsuarioRepository;

public class UsuarioViewModel {
    UsuarioRepository repository;

    public UsuarioViewModel(){
        repository=new UsuarioRepository();
    }

    public void createusuario(){
        Usuario usuario=new Usuario(1,"su","1234","Test");
        try {
            repository.createUsuario(usuario);
        } catch (Usuarioexception e) {
            e.printerror();
        }
    }
}
