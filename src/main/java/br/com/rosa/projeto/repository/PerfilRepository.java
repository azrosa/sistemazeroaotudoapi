package br.com.rosa.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rosa.projeto.entity.PerfilEntity;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {

}
