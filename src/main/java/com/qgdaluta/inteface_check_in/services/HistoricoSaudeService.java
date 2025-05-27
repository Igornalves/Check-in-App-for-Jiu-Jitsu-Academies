package com.qgdaluta.inteface_check_in.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qgdaluta.inteface_check_in.models.HistoricoSaude;
import com.qgdaluta.inteface_check_in.repository.HistoricoSaudeRepository;

@Service
public class HistoricoSaudeService {

    private final HistoricoSaudeRepository repository;

    public HistoricoSaudeService(HistoricoSaudeRepository repository) {
        this.repository = repository;
    }

    public Optional<HistoricoSaude> buscarPorAluno(Long alunoId) {
        return repository.findByAlunoId(alunoId);
    }

    public HistoricoSaude salvar(HistoricoSaude historico) {
        return repository.save(historico);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

