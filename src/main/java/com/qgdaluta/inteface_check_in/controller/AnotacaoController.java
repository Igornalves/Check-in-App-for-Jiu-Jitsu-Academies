package com.qgdaluta.inteface_check_in.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qgdaluta.inteface_check_in.models.Anotacao;
import com.qgdaluta.inteface_check_in.services.AnotacaoService;

@RestController
@RequestMapping("/anotacoes")
public class AnotacaoController {

    private final AnotacaoService service;

    public AnotacaoController(AnotacaoService service) {
        this.service = service;
    }

    @GetMapping("/aluno/{alunoId}")
    public List<Anotacao> listarPorAluno(@PathVariable Long alunoId) {
        return service.listarPorAluno(alunoId);
    }

    @PostMapping
    public Anotacao salvar(@RequestBody Anotacao anotacao) {
        return service.salvar(anotacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

