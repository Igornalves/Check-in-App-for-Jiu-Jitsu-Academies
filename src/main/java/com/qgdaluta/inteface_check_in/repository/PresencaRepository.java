package com.qgdaluta.inteface_check_in.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qgdaluta.inteface_check_in.models.Presenca;

@Repository
public interface PresencaRepository extends JpaRepository<Presenca, Long> {
    List<Presenca> findByAlunoId(Long alunoId);
}

