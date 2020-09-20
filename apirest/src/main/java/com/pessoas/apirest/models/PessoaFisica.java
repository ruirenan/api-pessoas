package com.pessoas.apirest.models;

import java.util.List;

public class PessoaFisica extends Pessoa{
	
	private String apelido;
	private String cpf;
	private String profissao;
	private Double salario;
	private String dataNascimento;
	private List<Dependente> dependentes;

	
	public PessoaFisica(String nome,String apelido,String cpf,String profissao, Double salario, String dataNascimento, List<Dependente> dependentes, List<Telefone> telefones, List<Endereco> enderecos) {
		super(nome, telefones, enderecos);
		this.nome = nome;
		this.apelido = apelido;
		this.cpf = cpf;
		this.profissao = profissao;
		this.salario =salario;
		this.dataNascimento = dataNascimento;
		this.dependentes = dependentes;
		
	}	

	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}


}
