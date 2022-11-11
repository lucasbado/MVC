package br.com.reclameali.mvc.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import br.com.reclameali.mvc.model.Usuario;
import br.com.reclameali.mvc.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {this.repository = repository;}

    public Usuario registrar(Usuario usuario) {
        return repository.save(usuario);
    }

    public void deletar(Long id){
        Usuario usuario = repository.findById(id).orElseThrow(()->new EntityNotFoundException("id não localizado"));
        repository.delete(usuario);
    }

    public Usuario procurar(Long id){
        return repository.findById(id).orElseThrow(()->new EntityNotFoundException("id não localizado"));
    }

    public List<Usuario> procurarTodos(){
        return repository.findAll();
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado){
        Usuario usuario = this.procurar(id);
        usuarioAtualizado.setId(usuario.getId());
        return repository.save(usuarioAtualizado);
    }

    public Usuario procurarPorEmail(String email){
        return repository.findByEmail(email).orElseThrow(() -> new EntityNotFoundException("User Not Found!"));
    }



}
