package br.com.atua.atua.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.atua.atua.repositorio.FenixRepository;
import br.com.atua.atua.model.Fenix;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FenixController {

	@Autowired
	private FenixRepository repository;
	
	
	@GetMapping("/nome/{nomecliente}")
	public ResponseEntity<List<Fenix>> getByName(@PathVariable String nomecliente){
		return ResponseEntity.ok(repository.findAllByNomeclienteContainingIgnoreCase(nomecliente));
	}
	
	@GetMapping("/numerocontrato/{numerocontrato}")
	public ResponseEntity<List<Fenix>> getByContrato(@PathVariable long numerocontrato){
		return ResponseEntity.ok(repository.findAllByNumerocontratoContaining(numerocontrato));
	}
	
	@GetMapping("/cpf/{cpf}")
	public ResponseEntity<List<Fenix>> getByCpf(@PathVariable String cpf){
		return ResponseEntity.ok(repository.findAllByCpfContaining(cpf));
	}
	
	@GetMapping("/cnpj/{cnpj}")
	public ResponseEntity<List<Fenix>> getByCnpj(@PathVariable String cnpj){
		return ResponseEntity.ok(repository.findAllByCnpjContaining(cnpj));
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Fenix> post (@RequestBody Fenix fenix){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(fenix));
	}
	
}
