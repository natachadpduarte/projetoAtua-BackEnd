package br.com.atua.atua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import br.com.atua.atua.model.vfenix;
import br.com.atua.atua.repositorio.FenixRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class vfenixController {

	@Autowired
	private FenixRepository repository;
	
	@GetMapping
	public ResponseEntity<List<vfenix>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nome/{nomecliente}")
	public ResponseEntity<List<vfenix>> getByName(@PathVariable String nomecliente){
		return ResponseEntity.ok(repository.findAllByNomeclienteContainingIgnoreCase(nomecliente));
	}
	
	@GetMapping("/numerocontrato/{numerocontrato}")
	public ResponseEntity<List<vfenix>> getByContrato(@PathVariable long numerocontrato){
		return ResponseEntity.ok(repository.findAllByNumerocontratoContaining(numerocontrato));
	}
	
	@GetMapping("/cpf/{cpf}")
	public ResponseEntity<List<vfenix>> getByCpf(@PathVariable String cpf){
		return ResponseEntity.ok(repository.findAllByCpfContaining(cpf));
	}
	
	@GetMapping("/cnpj/{cnpj}")
	public ResponseEntity<List<vfenix>> getByCnpj(@PathVariable String cnpj){
		return ResponseEntity.ok(repository.findAllByCnpjContaining(cnpj));
	}
	

}
