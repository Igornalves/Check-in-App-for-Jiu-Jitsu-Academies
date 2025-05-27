package com.qgdaluta.inteface_check_in.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qgdaluta.inteface_check_in.models.Objetivo;

@Repository
public interface ObjetivoRepository extends JpaRepository<Objetivo, Long> {
    Optional<Objetivo> findByAlunoId(Long alunoId);
}

