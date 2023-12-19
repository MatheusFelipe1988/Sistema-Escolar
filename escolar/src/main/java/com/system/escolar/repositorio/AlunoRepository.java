package com.system.escolar.repositorio;

import com.system.escolar.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Optional<Aluno> findAlunoByMatricula(String matricula);
    Optional<Aluno> findAlunoById(Long id);
}
