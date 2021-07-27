package com.teste.Rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.teste.Rest.model.Pessoa;
import com.teste.Rest.repository.Repositorio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Servico {

	private final Repositorio repository;

	public List<Pessoa> list() {
		return repository.findAll();
	}

	public Pessoa create(Pessoa p) {
		return repository.save(p);
	}

	public Pessoa findById(Long id) throws Exception {
		return repository.findById(id).orElseThrow(() -> new Exception("Pessoa nao encontrada"));
	}

	public List<Pessoa> findByName(String nome) {

		List<Pessoa> lista = repository.findAll();
		List<Pessoa> encontrado = new ArrayList<Pessoa>();

		for (Pessoa pessoa : lista) {
			if (pessoa.getNome().equals(nome)) {
				encontrado.add(pessoa);
			}
		}
		return encontrado;
	}

	public String delete(Long id) throws Exception {
		Pessoa p = findById(id);
		repository.delete(p);
		return ("Pessoa deletada");
	}

	public Pessoa modify (Long id, Pessoa p) throws Exception {
		Pessoa person = findById(id);
		person.setNome(p.getNome());
		person.setEndereco(p.getEndereco());
		return repository.save(person);
	}
}
