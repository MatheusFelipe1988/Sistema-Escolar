package com.system.escolar.service;

import com.system.escolar.repositorio.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;



}
