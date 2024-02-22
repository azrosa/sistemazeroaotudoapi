package br.com.alan.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alan.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long>{

}
