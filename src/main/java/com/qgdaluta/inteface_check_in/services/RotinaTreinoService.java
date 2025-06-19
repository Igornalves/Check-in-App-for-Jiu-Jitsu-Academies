package com.qgdaluta.inteface_check_in.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qgdaluta.inteface_check_in.models.RotinaTreino;
import com.qgdaluta.inteface_check_in.repository.RotinaTreinoRepository;

@Service
public class RotinaTreinoService {

    private final RotinaTreinoRepository repository;

    public RotinaTreinoService(RotinaTreinoRepository repository) {
        this.repository = repository;
    }

    public Optional<RotinaTreino> buscarPorAluno(Long alunoId) {
        return repository.findByAluno_Id(alunoId);
    }

    public RotinaTreino salvar(RotinaTreino rotina) {
        return repository.save(rotina);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

