package com.qgdaluta.inteface_check_in.controller;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GeralController {
    
    @GetMapping("/test")
    @Operation(summary = "Endpoint de teste simples", description = "Este endpoint retorna uma mensagem basica para testes de requisicao e respostas", tags = {"Requisicoes de Teste", "Requisicões do Tipo Get"})
    @ApiResponse(description = "requisicao feita com sucesso", responseCode = "200")
    public String rotaTeste() {
        return "Hello Word !!!";
    }
    
}
