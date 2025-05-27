package com.qgdaluta.inteface_check_in.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class HistoricoSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean possuiProblemaSaude;
    private String descricaoProblema;
    private boolean usaMedicacao;
    private String descricaoMedicacao;

    @OneToOne
    private Aluno aluno;
}
