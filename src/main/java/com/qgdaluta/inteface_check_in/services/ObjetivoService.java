package com.qgdaluta.inteface_check_in.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qgdaluta.inteface_check_in.models.Objetivo;
import com.qgdaluta.inteface_check_in.repository.ObjetivoRepository;

@Service
public class ObjetivoService {

    private final ObjetivoRepository repository;

    public ObjetivoService(ObjetivoRepository repository) {
        this.repository = repository;
    }

    public Optional<Objetivo> buscarPorAluno(Long alunoId) {
        return repository.findByAlunoId(alunoId);
    }

    public Objetivo salvar(Objetivo objetivo) {
        return repository.save(objetivo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

