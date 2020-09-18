package com.pessoas.apirest.models;

public class Telefone {

	private String codigo;
	private String ddd;
	private String numero;
	private String tipo;

	public Telefone(String codigo, String ddd, String numero, String tipo) {

		this.codigo = codigo;
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
