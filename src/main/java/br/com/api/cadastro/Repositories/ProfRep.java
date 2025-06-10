package br.com.api.cadastro.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.cadastro.Models.Professor;

import java.util.Set;

@Repository
public interface ProfRep extends CrudRepository<Professor, Long> {
    Set<Professor> findAll();

    Professor findByNome(String nome);
}
