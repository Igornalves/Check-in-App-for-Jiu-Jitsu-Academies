package com.qgdaluta.inteface_check_in.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qgdaluta.inteface_check_in.models.RotinaTreino;

@Repository
public interface RotinaTreinoRepository extends JpaRepository<RotinaTreino, Long> { 
    Optional<RotinaTreino> findByAluno_Id(Long alunoId);
}
