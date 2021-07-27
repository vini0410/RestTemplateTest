package com.teste.RestContinue.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.teste.RestContinue.pessoa.Pessoa;

@RestController
public class Controller {

	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> obterPessoa(@PathVariable(name = "id") String id) {

		RestTemplate rest = new RestTemplate();

		String uri = "http://localhost:8090/rest/pessoas/{id}";

		Map<String, String> params = new HashMap<String, String>();
		params.put("id", id);

		Pessoa pessoa = rest.getForObject(uri, Pessoa.class, params);

		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
	}

	@GetMapping("/todas-as-pessoas")
	public ResponseEntity<List> obterPessoas() {
		RestTemplate rest = new RestTemplate();
		
		
		String uri = "http://localhost:8090/rest/pessoas";
		
		List lista = rest.getForObject(uri, List.class);
		
		return new ResponseEntity<List>(lista, HttpStatus.OK);
		
	}
}
