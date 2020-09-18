package com.pessoas.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoas.apirest.models.Pessoa;
import com.pessoas.apirest.repository.PessoaRepository;

@RestController
@RequestMapping(value="/api")

public class PessoaResource {
	
	@Autowired
	PessoaRepository pessoaRepository;

	@GetMapping("/pessoas")
	public List<Pessoa> listaPessoas(){
		return pessoaRepository.getAll();
	}
	@GetMapping("/pessoas/{id}")
	public Pessoa listaUmaPessoa(@PathVariable("id") Integer id){
		return pessoaRepository.getById(id);
	}
}
