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

import com.qgdaluta.inteface_check_in.models.Graduacao;
import com.qgdaluta.inteface_check_in.services.GraduacaoService;

@RestController
@RequestMapping("/graduacoes")
public class GraduacaoController {

    private final GraduacaoService service;

    public GraduacaoController(GraduacaoService service) {
        this.service = service;
    }

    @GetMapping("/aluno/{alunoId}")
    public List<Graduacao> listarPorAluno(@PathVariable Long alunoId) {
        return service.listarPorAluno(alunoId);
    }

    @PostMapping
    public Graduacao salvar(@RequestBody Graduacao graduacao) {
        return service.salvar(graduacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

