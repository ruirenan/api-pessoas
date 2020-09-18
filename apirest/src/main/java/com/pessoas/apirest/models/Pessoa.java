package com.pessoas.apirest.models;

import java.util.List;

public abstract class Pessoa {
	protected String nome;
	protected List<Telefone> telefones;
	protected List<Endereco> enderecos;

	public Pessoa(String nome, List<Telefone> telefones, List<Endereco> enderecos) {
		this.nome = nome;
		this.telefones = telefones;
		this.enderecos = enderecos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
}
