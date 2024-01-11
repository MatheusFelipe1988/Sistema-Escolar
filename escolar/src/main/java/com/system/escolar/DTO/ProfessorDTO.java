package com.system.escolar.DTO;

import com.system.escolar.domain.Aluno;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProfessorDTO {
    private Long id;
    private String nome;
    private String sobreNome;
    private String cpf;
    private Aluno notaAluno;
    private BigDecimal notaProva;
}
