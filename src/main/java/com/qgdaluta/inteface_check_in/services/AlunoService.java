package com.qgdaluta.inteface_check_in.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qgdaluta.inteface_check_in.models.Aluno;
import com.qgdaluta.inteface_check_in.repository.AlunoRepository;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public List<Aluno> listarPorUsuario(Long usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

