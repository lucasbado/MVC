package br.com.reclameali.mvc.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.reclameali.mvc.dto.ProcurarPorEmailDto;
import br.com.reclameali.mvc.dto.UsuarioDto;
import br.com.reclameali.mvc.model.Usuario;

public class UsuarioMapper {

    public static Usuario dtoParaUsuario(UsuarioDto dto){
        return new Usuario(null, dto.getName(), dto.getSurname(), dto.getEmail(), dto.getPassword(),
                dto.getBirth(), null, null, null);
    }

    public static UsuarioDto usuarioParaDto (Usuario usuario){
        return new UsuarioDto(usuario.getName(), usuario.getSurname(), usuario.getEmail(), usuario.getPassword(),
                usuario.getBirth());
    }

    public static ProcurarPorEmailDto usuarioParaUsuarioEmail(Usuario usuario){
        return new ProcurarPorEmailDto(usuario.getId(), usuario.getName(), usuario.getSurname(),
                usuario.getEmail(), usuario.getPassword(), usuario.getBirth(), usuario.getCreate(),
                usuario.getChange(), usuario.getProblemas());
    }

    public static List<UsuarioDto> listaUsuarioParaUsuarioDto (List<Usuario> listUsuario){
        List<UsuarioDto> usuarios = new ArrayList<>();
        listUsuario.forEach(usuario -> usuarios.add(new UsuarioDto(usuario.getName(), usuario.getSurname(),
                usuario.getEmail(), usuario.getPassword(), usuario.getBirth())));
        return usuarios;
    }

}
