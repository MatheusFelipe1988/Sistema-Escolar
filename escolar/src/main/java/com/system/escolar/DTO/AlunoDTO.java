package com.system.escolar.DTO;

import com.system.escolar.domain.Aluno;
import com.system.escolar.domain.EscolaType;

import java.math.BigDecimal;

public record AlunoDTO (String nome, String sobreNome, String matricula, String cpf, BigDecimal boletim, EscolaType escolaType){


}
