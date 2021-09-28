package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//diz que a classe e um controlador, mon amour.
//Annotation for mapping web requests onto methods in request-handling classes with flexible method signatures.
//annotation enables cross-origin resource sharing only for this specific method.
//enables automatic dependency injection.

@RestController
@RequestMapping("/postagens ")
@CrossOrigin("*")

public class PostagemController {
 
	@Autowired
    private PostagemRepository repository;
    
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	

}
