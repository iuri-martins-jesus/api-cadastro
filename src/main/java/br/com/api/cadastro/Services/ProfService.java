package br.com.api.cadastro.Services;

import org.springframework.http.ResponseEntity;

import br.com.api.cadastro.Models.Professor;

import java.util.Set;

public interface ProfService {
    ResponseEntity<Set<Professor>> listar();
    ResponseEntity<Professor> findById(long id);
}
