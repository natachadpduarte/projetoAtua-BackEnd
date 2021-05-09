package br.com.atua.atua.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.atua.atua.model.vfenix;

@Repository
public interface FenixRepository extends JpaRepository<vfenix, Long>{
	
	
	public List<vfenix> findAllByNomeclienteContainingIgnoreCase (String nomecliente);
	
	public List<vfenix> findAllByNumerocontratoContaining(long numerocontrato);
	
	public List<vfenix> findAllByCpfContaining(String cpf);
	
	public List<vfenix> findAllByCnpjContaining(String cnpj);
	
	
}
