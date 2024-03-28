package model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private String profissao;
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome (String nome) {
		
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
		
	}
	
	public void setDataNasciment (LocalDate dataNasciment) {
		
	}
	
	public String getProfissao() {
		return profissao;
		
	}
	
	public void setProfissao (String profissao) {
		
	}
	
	public Period getIdade() {
		LocalDate dataNascimento = getDataNascimento();
		LocalDate dataHoje = LocalDate.now();
		Period idade = Period.between(dataNascimento, dataHoje);
		return idade;
		
	}
	
	
}

//FALTA: Nenhum ser vivente pode ter mais de 150 anos. Implemente métodos para calcular a idade da pessoa.
