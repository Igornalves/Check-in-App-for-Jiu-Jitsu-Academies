package com.qgdaluta.inteface_check_in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Servico de Check-in para Academia de Jiu-Jitsu", version = "1.0", description = "projeto consiste em criar um servico back-end para controle de alunos particante da academia como um todo e separar por categorias e idades, controlando horarios e outro, para que assim tenha-se uma ordem sobre todas as parte da academia"))
public class IntefaceCheckInApplication {
	public static void main(String[] args) {
		SpringApplication.run(IntefaceCheckInApplication.class, args);
	}
}
