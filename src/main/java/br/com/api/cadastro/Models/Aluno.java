package br.com.api.cadastro.Models;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }
}
