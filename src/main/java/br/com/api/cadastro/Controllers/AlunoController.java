package br.com.api.cadastro.Controllers;

import br.com.api.cadastro.Models.Aluno;
import br.com.api.cadastro.Services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("aluno")
public class AlunoController{

    @Autowired
    private AlunoService alunoService;

    @GetMapping("list")
    public ResponseEntity<Set<Aluno>> listarAlunos() {
        return alunoService.listar();
    }

    @GetMapping("{id}")
    public ResponseEntity<Aluno> listarProfessor(@PathVariable Long id) {
        return alunoService.findById(id);
    }
}
