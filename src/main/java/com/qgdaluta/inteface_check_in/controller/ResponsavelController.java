package com.qgdaluta.inteface_check_in.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qgdaluta.inteface_check_in.models.Responsavel;
import com.qgdaluta.inteface_check_in.services.ResponsavelService;

@RestController
@RequestMapping("/responsaveis")
public class ResponsavelController {

    private final ResponsavelService service;

    public ResponsavelController(ResponsavelService service) {
        this.service = service;
    }

    @GetMapping("/aluno/{alunoId}")
    public ResponseEntity<Responsavel> buscarPorAluno(@PathVariable Long alunoId) {
        return service.buscarPorAluno(alunoId)
                     .map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Responsavel salvar(@RequestBody Responsavel responsavel) {
        return service.salvar(responsavel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

