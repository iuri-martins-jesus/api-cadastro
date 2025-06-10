package br.com.api.cadastro.Repositories;

import br.com.api.cadastro.Models.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AlunoRep extends CrudRepository<Aluno, Long> {
    Set<Aluno> findAll();

    Aluno findByNome(String nome);
}
