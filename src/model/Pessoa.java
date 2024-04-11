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
		this.nome = nome;
		
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
		
	}
	
	public void setDataNascimento (LocalDate dataNascimento) {
		 // Verifica se a data de nascimento não está no futuro
		if (dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de nascimento não pode ser no futuro.");
        }
        // Calcula a idade para verificar se não ultrapassa os 150 anos
        Period idade = Period.between(dataNascimento, LocalDate.now());
        if (idade.getYears() > 150) {
            throw new IllegalArgumentException("A pessoa não pode ter mais de 150 anos.");
        }
			this.dataNascimento = dataNascimento;
		
	}
	
	public String getProfissao() {
		return profissao;
		
	}
	
	public void setProfissao (String profissao) {
		this.profissao = profissao;
		
	}
	
	public Period getIdade() {
		LocalDate dataHoje = LocalDate.now();
		Period idade = Period.between(dataNascimento, dataHoje);
		return idade;
		
	}
	
	
}