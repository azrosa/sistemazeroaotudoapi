package br.com.rosa.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rosa.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	
}
