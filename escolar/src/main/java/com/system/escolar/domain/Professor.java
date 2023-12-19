package com.system.escolar.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "professor")
@Entity(name = "professor")
@EqualsAndHashCode(of = "id")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobreNome;
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "notaAluno_id")
    private Aluno notaAluno;
}
