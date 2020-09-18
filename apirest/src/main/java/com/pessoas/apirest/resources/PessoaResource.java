package com.pessoas.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoas.apirest.models.Pessoa;
import com.pessoas.apirest.models.PessoaFisica;
import com.pessoas.apirest.models.PessoaJuridica;
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
	
	@PostMapping("/pessoasFisicas")
	public Pessoa salvaPessoaFisica(@RequestBody PessoaFisica pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@PostMapping("/pessoasJuridicas")
	public Pessoa salvaPessoaJuridica(@RequestBody PessoaJuridica pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@PutMapping("/pessoasFisicas")
	public PessoaFisica atualizaPessoaFisica(@RequestBody PessoaFisica pessoa) {
		pessoaRepository.update(pessoa);
		return pessoa;
	}
	
	@PutMapping("/pessoasJuridicas")
	public PessoaJuridica atualizaPessoaJuridica(@RequestBody PessoaJuridica pessoa) {
		pessoaRepository.update(pessoa);
		return pessoa;
	}	
	
	@DeleteMapping("/pessoas/{id}")
	public void deletarPessoa(@PathVariable("id") Integer id) {
		pessoaRepository.delete(id);
	
	}
	
}

