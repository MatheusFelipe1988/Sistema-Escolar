package com.system.escolar.service;

import com.system.escolar.DTO.AlunoDTO;
import com.system.escolar.domain.Aluno;
import com.system.escolar.domain.EscolaType;
import com.system.escolar.repositorio.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public void validarNota (Aluno notaAluno, BigDecimal notaProva) throws Exception{
        if(notaAluno.getEscolaType() == EscolaType.PROFESSOR){
            throw new Exception("Este aluno não existe");
        }
        if(notaAluno.getBoletim().compareTo(notaProva) < 5){
            throw new Exception("Aluno reprovado");
        }
    }
    public Aluno findAlunoById(Long id) throws Exception{
        return this.alunoRepository.findAlunoById(id).orElseThrow(()-> new Exception("Aluno não cadastrado no sistema"));
    }
    public Aluno createAluno(AlunoDTO data){
        Aluno novoAluno = new Aluno(data);
        this.salvarAluno(novoAluno);
        return novoAluno;
    }
    public List<Aluno> getAllAlunos(){
        return this.alunoRepository.findAll();
    }

    private void salvarAluno(Aluno aluno) {
        this.alunoRepository.save(aluno);
    }

}
