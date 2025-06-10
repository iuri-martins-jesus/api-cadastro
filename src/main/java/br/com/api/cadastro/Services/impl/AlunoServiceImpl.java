package br.com.api.cadastro.Services.impl;


import br.com.api.cadastro.Models.Aluno;
import br.com.api.cadastro.Repositories.AlunoRep;
import br.com.api.cadastro.Services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("AlunoService")
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRep alunoRep;

    @Override
    public ResponseEntity<Set<Aluno>> listar() {
        try {
            Set<Aluno> alunos = alunoRep.findAll();

            return ResponseEntity.ok(alunos);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResponseEntity<Aluno> findById(long id) {
        try {
            Aluno aluno = alunoRep.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado!"));

            return ResponseEntity.ok(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
