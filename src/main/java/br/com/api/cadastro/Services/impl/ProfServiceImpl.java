package br.com.api.cadastro.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.cadastro.Models.Professor;
import br.com.api.cadastro.Repositories.ProfRep;
import br.com.api.cadastro.Services.ProfService;

import java.util.Set;

@Service("ProfService")
public class ProfServiceImpl implements ProfService {

    @Autowired
    private ProfRep profRep;

    @Override
    public ResponseEntity<Set<Professor>> listar() {
        try {
            Set<Professor> professores = profRep.findAll();

            return ResponseEntity.ok(professores);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResponseEntity<Professor> findById(long id) {
        try {
            Professor professores = profRep.findById(id).orElseThrow(() -> new RuntimeException("Professor não encontrado"));

            return ResponseEntity.ok(professores);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
