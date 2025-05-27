package com.qgdaluta.inteface_check_in.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qgdaluta.inteface_check_in.models.HistoricoSaude;

@Repository
public interface HistoricoSaudeRepository extends JpaRepository<HistoricoSaude, Long> {
    Optional<HistoricoSaude> findByAlunoId(Long alunoId);
}

