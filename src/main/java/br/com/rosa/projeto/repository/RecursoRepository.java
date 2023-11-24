package br.com.rosa.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rosa.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long> {

}
