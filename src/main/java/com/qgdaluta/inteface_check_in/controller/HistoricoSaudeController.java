package com.qgdaluta.inteface_check_in.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qgdaluta.inteface_check_in.models.HistoricoSaude;
import com.qgdaluta.inteface_check_in.services.HistoricoSaudeService;


@RestController
@RequestMapping("/historicos-saude")
public class HistoricoSaudeController {

    private final HistoricoSaudeService service;

    public HistoricoSaudeController(HistoricoSaudeService service) {
        this.service = service;
    }

    @GetMapping("/aluno/{alunoId}")
    public ResponseEntity<HistoricoSaude> buscarPorAluno(@PathVariable Long alunoId) {
        return service.buscarPorAluno(alunoId)
                     .map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public HistoricoSaude salvar(@RequestBody HistoricoSaude historico) {
        return service.salvar(historico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

