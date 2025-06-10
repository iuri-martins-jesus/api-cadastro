package br.com.api.cadastro.Models;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Professor extends Pessoa {

    public Professor() {
    }

    public Professor(String nome) {
        super(nome);
    }
}
