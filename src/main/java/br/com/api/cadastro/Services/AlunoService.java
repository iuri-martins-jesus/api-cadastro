package br.com.api.cadastro.Services;

import br.com.api.cadastro.Models.Aluno;
import org.springframework.http.ResponseEntity;

import java.util.Set;

public interface AlunoService {
    ResponseEntity<Set<Aluno>> listar();
    ResponseEntity<Aluno> findById(long id);
}
