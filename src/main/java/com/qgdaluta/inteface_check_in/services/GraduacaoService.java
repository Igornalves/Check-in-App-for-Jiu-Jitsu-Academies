package com.qgdaluta.inteface_check_in.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qgdaluta.inteface_check_in.models.Graduacao;
import com.qgdaluta.inteface_check_in.repository.GraduacaoRepository;

@Service
public class GraduacaoService {

    private final GraduacaoRepository repository;

    public GraduacaoService(GraduacaoRepository repository) {
        this.repository = repository;
    }

    public List<Graduacao> listarPorAluno(Long alunoId) {
        return repository.findByAlunoId(alunoId);
    }

    public Graduacao salvar(Graduacao graduacao) {
        return repository.save(graduacao);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

