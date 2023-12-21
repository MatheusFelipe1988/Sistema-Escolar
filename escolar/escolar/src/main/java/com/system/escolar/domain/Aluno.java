package com.system.escolar.domain;

import com.system.escolar.DTO.AlunoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "aluno")
@Entity(name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String matricula;
    private String nome;
    private String sobreNome;
    private String cpf;
    private BigDecimal boletim;
    @Enumerated(EnumType.STRING)
    private EscolaType escolaType;

    public Aluno(AlunoDTO data) {
        this.nome = data.nome();
        this.sobreNome = data.sobreNome();
        this.cpf = data.cpf();
        this.boletim = data.boletim();
        this.matricula = data.matricula();
        this.escolaType = data.escolaType();

    }
}
