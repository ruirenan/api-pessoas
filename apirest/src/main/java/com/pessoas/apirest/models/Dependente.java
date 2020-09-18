package com.pessoas.apirest.models;

public class Dependente {
	private String nomeCompleto;
	private String tipo;

	public Dependente(String nomeCompleto, String tipo) {
		this.nomeCompleto = nomeCompleto;
		this.tipo = tipo;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
