package com.qgdaluta.inteface_check_in.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String dataNascimento;
    private String genero;

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    private Objetivo objetivo;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    private HistoricoSaude historicoSaude;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    private RotinaTreino rotinaTreino;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    private Responsavel responsavel;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Presenca> presencas;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Graduacao> graduacoes;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Anotacao> anotacoes;
}

