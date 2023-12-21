package com.system.escolar.controller;

import com.system.escolar.DTO.AlunoDTO;
import com.system.escolar.domain.Aluno;
import com.system.escolar.repositorio.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boletim")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    public ResponseEntity<Aluno> createAluno(@RequestBody AlunoDTO alunoDTO){
        Aluno novoAluno =  ;
    }

}
