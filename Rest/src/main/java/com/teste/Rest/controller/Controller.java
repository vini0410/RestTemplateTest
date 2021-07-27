package com.teste.Rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.teste.Rest.model.Pessoa;
import com.teste.Rest.service.Servico;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/rest/pessoas")
@RequiredArgsConstructor
public class Controller {

	private final Servico service;

	@GetMapping
	public List<Pessoa> listar() {
		return service.list();
	}

	@GetMapping("/{id}")
	public Pessoa procurar(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}

	@GetMapping("/name/{name}")
	public List<Pessoa> procurarNome(@PathVariable String name) throws Exception {
		return service.findByName(name);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pessoa criar(@RequestBody Pessoa p) {
		return service.create(p);
	}

	@PutMapping("/{id}")
	public Pessoa modificar(@PathVariable Long id, @RequestBody Pessoa p) throws Exception {
		return service.modify(id, p);
	}

	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Long id) throws Exception {
		return service.delete(id);
	}

}
