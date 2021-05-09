package br.com.atua.atua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.atua.atua.model.Fenix;
import br.com.atua.atua.repositorio.FenixRepositoryp;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FenixController {

	@Autowired
	private FenixRepositoryp repositorio;
	
	@PostMapping("/cadastrarFenix")
	public ResponseEntity<Fenix> post (@RequestBody Fenix fenix){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repositorio.save(fenix));
	}
	
	@PutMapping("/atualizarFenix")
	public ResponseEntity<Fenix> put (@RequestBody Fenix fenix) {
		return ResponseEntity.ok(repositorio.save(fenix));
	}
	
	@DeleteMapping("/deletarFenix/{id}")
	public void delete(@PathVariable long id) {
		repositorio.deleteById(id);
	}
	
}
