package br.com.api.cadastro.Controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.api.cadastro.Models.Professor;
import br.com.api.cadastro.Services.ProfService;

import java.util.Set;

@RestController
@RequestMapping("professor")
public class ProfessorController{

    @Autowired
    private ProfService profService;

    @GetMapping("list")
    public ResponseEntity<Set<Professor>> listarProfessor() {
        return profService.listar();
    }

    @GetMapping("{id}")
    public ResponseEntity<Professor> listarProfessor(@PathVariable Long id) {
        return profService.findById(id);
    }
}
