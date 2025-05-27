package com.qgdaluta.inteface_check_in.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qgdaluta.inteface_check_in.models.Anotacao;

@Repository
public interface AnotacaoRepository extends JpaRepository<Anotacao, Long> {
    List<Anotacao> findByAlunoId(Long alunoId);
}

