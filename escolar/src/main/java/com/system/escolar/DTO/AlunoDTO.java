package com.system.escolar.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoDTO {
    private Long id;
    private String nome;
    private String sobreNome;
    private String cpf;
    private double boletim;
}
