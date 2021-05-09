package br.com.atua.atua.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.atua.atua.model.Fenix;

@Repository
public interface FenixRepositoryp extends JpaRepository<Fenix, Long>{
	
	
}
