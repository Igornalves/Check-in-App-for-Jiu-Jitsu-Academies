package com.qgdaluta.inteface_check_in.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Graduacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String faixa; // Ex: "Branca", "Amarela", etc.
    private LocalDate dataGraduacao;

    @ManyToOne
    private Aluno aluno;
}

