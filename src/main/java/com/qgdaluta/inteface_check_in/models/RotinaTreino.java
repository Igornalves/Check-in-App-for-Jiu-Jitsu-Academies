package com.qgdaluta.inteface_check_in.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class RotinaTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean treinaSegunda;
    private boolean treinaTerca;
    private boolean treinaQuarta;
    private boolean treinaQuinta;
    private boolean treinaSexta;

    private String turno; // manhã, tarde, noite

    @OneToOne
    private Aluno aluno;
}
