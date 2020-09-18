package com.pessoas.apirest.models;

import java.util.List;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(String nome, String nomeFantasia, String cnpj, List<Telefone> telefones, List<Endereco> enderecos) {
		super(nome, telefones, enderecos);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}
	private String nomeFantasia;
	private String cnpj;
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
