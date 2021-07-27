package com.teste.Rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "enderecos")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String cep;
	@Column
	private String bairro;
	@Column
	private String rua;
	@Column
	private Long numero;
	
}
