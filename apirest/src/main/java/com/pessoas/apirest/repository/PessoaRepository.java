package com.pessoas.apirest.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pessoas.apirest.models.Dependente;
import com.pessoas.apirest.models.Endereco;
import com.pessoas.apirest.models.Pessoa;
import com.pessoas.apirest.models.PessoaFisica;
import com.pessoas.apirest.models.PessoaJuridica;
import com.pessoas.apirest.models.Telefone;

@Repository
public class PessoaRepository {
	
	static Integer idCounter = 0;	
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public List<Pessoa> getAll() {
		return pessoas;
	}

	public PessoaRepository() {
		save(new PessoaFisica(
				"Antonio", 
				"Tom", 
				"30558869860", 
				"Engenheiro", 
				5000.00, 
				new Date(), 
				new ArrayList<Dependente>(Arrays.asList(
						new Dependente("Thomas","irmão"), 
						new Dependente("Luciana","mãe")
				)),
				new ArrayList<Telefone>(Arrays.asList(
						new Telefone("55", "011", "55555555", "Residencial"),
						new Telefone("55", "011", "55555533", "Comercial")
				)),
				new ArrayList<Endereco>(Arrays.asList(
						new Endereco("Residencial", "Rua", "Dos Rodrigues", "67", "", "05070000", "Freguesia do Ó", "São Paulo", "SP", "Brasil"),
						new Endereco("Comercial", "Rua", "Dos Rodrigues", "80", "Casa2", "05070000", "Freguesia do Ó", "São Paulo", "SP", "Brasil")
				))
		));				
		save(new PessoaFisica(
				"Paulo", 
				"Ch8", 
				"8500869860", 
				"Professor", 
				6000.00, 
				new Date(), 
				new ArrayList<Dependente>(Arrays.asList(
						new Dependente("Fabio","irmão"), 
						new Dependente("Elza","mãe")
				)),
				new ArrayList<Telefone>(Arrays.asList(
						new Telefone("55", "011", "55555775", "Residencial"),
						new Telefone("55", "011", "45555533", "Comercial")
				)),
				new ArrayList<Endereco>(Arrays.asList(
						new Endereco("Residencial", "Rua", "Raimundo", "80", "", "05070030", "Pirituba", "São Paulo", "SP", "Brasil"),
						new Endereco("Comercial", "Av.", "Jararaca", "800", "A", "04022000", "Ribeirão Nunes", "São Paulo", "SP", "Brasil")
				))
		));				
		save(new PessoaJuridica(
				"Antonio carros ltda", 
				"TonyCar", "0555633200001", 
				new ArrayList<Telefone>(Arrays.asList(
						new Telefone("55", "011", "44444444", "Residencial"),
						new Telefone("55", "011", "66666666", "Comercial")				
				)),
				new ArrayList<Endereco>(Arrays.asList(
						new Endereco("Comercial", "Rua", "Dos Rodrigues", "67", "", "05070000", "Freguesia do Ó", "São Paulo", "SP", "Brasil")								
				))
		));
	}

	public Pessoa save(Pessoa pessoa) {
		if (pessoa.getId()==null) {
			pessoa.setId(idCounter);
			idCounter++;
		}
		pessoas.add(pessoa);
		return pessoa;
	}
	
	public Pessoa getById(Integer id) {
		return pessoas.stream().filter(pessoa -> pessoa.getId().equals(id)).findFirst().get();
	}

	public void delete(Integer id) {
		pessoas.removeIf(pessoa -> pessoa.getId().equals(id));
	}

	public void update(Pessoa pessoa) {
		int couter = 0;
		for(Pessoa pessoa1 : pessoas) {
			if (pessoa1.getId().equals(pessoa.getId())) {
				pessoas.set(couter,  pessoa);
			}
			couter++;
		}
	}
}
