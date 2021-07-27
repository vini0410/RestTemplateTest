package com.teste.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.Rest.model.Pessoa;

@Repository
public interface Repositorio extends JpaRepository<Pessoa, Long>{

}
