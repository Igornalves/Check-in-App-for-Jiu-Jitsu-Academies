package com.qgdaluta.inteface_check_in.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qgdaluta.inteface_check_in.models.Graduacao;

@Repository
public interface GraduacaoRepository extends JpaRepository<Graduacao, Long> {
    List<Graduacao> findByAlunoId(Long alunoId);
}

