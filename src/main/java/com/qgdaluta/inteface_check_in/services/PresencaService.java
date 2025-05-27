package com.qgdaluta.inteface_check_in.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qgdaluta.inteface_check_in.models.Presenca;
import com.qgdaluta.inteface_check_in.repository.PresencaRepository;

@Service
public class PresencaService {

    private final PresencaRepository repository;

    public PresencaService(PresencaRepository repository) {
        this.repository = repository;
    }

    public List<Presenca> listarPorAluno(Long alunoId) {
        return repository.findByAlunoId(alunoId);
    }

    public Presenca salvar(Presenca presenca) {
        return repository.save(presenca);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

