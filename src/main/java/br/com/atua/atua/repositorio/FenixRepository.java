package br.com.atua.atua.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.atua.atua.model.Fenix;

@Repository
public interface FenixRepository extends JpaRepository<Fenix, Long>{
	
	public List<Fenix> findAllByNomeclienteContainingIgnoreCase (String nomecliente);
	
	public List<Fenix> findAllByNumerocontratoContaining(long numerocontrato);
	
	public List<Fenix> findAllByCpfContaining(String cpf);
	
	public List<Fenix> findAllByCnpjContaining(String cnpj);
	
	
}
