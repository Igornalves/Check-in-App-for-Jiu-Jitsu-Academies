package com.qgdaluta.inteface_check_in.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qgdaluta.inteface_check_in.models.Objetivo;
import com.qgdaluta.inteface_check_in.services.ObjetivoService;


@RestController
@RequestMapping("/objetivos")
public class ObjetivoController {

    private final ObjetivoService service;

    public ObjetivoController(ObjetivoService service) {
        this.service = service;
    }

    @GetMapping("/aluno/{alunoId}")
    public ResponseEntity<Objetivo> buscarPorAluno(@PathVariable Long alunoId) {
        return service.buscarPorAluno(alunoId)
                     .map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Objetivo salvar(@RequestBody Objetivo objetivo) {
        return service.salvar(objetivo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

