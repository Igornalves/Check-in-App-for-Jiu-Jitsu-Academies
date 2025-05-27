package com.qgdaluta.inteface_check_in.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qgdaluta.inteface_check_in.models.Usuario;
import com.qgdaluta.inteface_check_in.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

