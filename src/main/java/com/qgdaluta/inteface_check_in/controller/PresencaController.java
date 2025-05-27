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

import com.qgdaluta.inteface_check_in.models.Presenca;
import com.qgdaluta.inteface_check_in.services.PresencaService;

@RestController
@RequestMapping("/presencas")
public class PresencaController {

    private final PresencaService service;

    public PresencaController(PresencaService service) {
        this.service = service;
    }

    @GetMapping("/aluno/{alunoId}")
    public List<Presenca> listarPorAluno(@PathVariable Long alunoId) {
        return service.listarPorAluno(alunoId);
    }

    @PostMapping
    public Presenca salvar(@RequestBody Presenca presenca) {
        return service.salvar(presenca);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

