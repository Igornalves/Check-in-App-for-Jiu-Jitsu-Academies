package com.qgdaluta.inteface_check_in.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qgdaluta.inteface_check_in.models.Responsavel;
import com.qgdaluta.inteface_check_in.repository.ResponsavelRepository;

@Service
public class ResponsavelService {

    private final ResponsavelRepository repository;

    public ResponsavelService(ResponsavelRepository repository) {
        this.repository = repository;
    }

    public Optional<Responsavel> buscarPorAluno(Long alunoId) {
        return repository.findByAlunoId(alunoId);
    }

    public Responsavel salvar(Responsavel responsavel) {
        return repository.save(responsavel);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

