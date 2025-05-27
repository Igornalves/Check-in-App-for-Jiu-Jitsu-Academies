package com.qgdaluta.inteface_check_in.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qgdaluta.inteface_check_in.models.Anotacao;
import com.qgdaluta.inteface_check_in.repository.AnotacaoRepository;

@Service
public class AnotacaoService {

    private final AnotacaoRepository repository;

    public AnotacaoService(AnotacaoRepository repository) {
        this.repository = repository;
    }

    public List<Anotacao> listarPorAluno(Long alunoId) {
        return repository.findByAlunoId(alunoId);
    }

    public Anotacao salvar(Anotacao anotacao) {
        return repository.save(anotacao);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

