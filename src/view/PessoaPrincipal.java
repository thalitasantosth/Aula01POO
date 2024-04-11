package view;

import java.time.LocalDate;

import model.Pessoa;

public class PessoaPrincipal {

	public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setDataNascimento(LocalDate.of(1990, 5, 15));
        //A pessoa não pode ter mais de 150 anos.
        //p1.setDataNascimento(LocalDate.of(1870, 5, 15));
        //Data de nascimento não pode ser no futuro.
        //p1.setDataNascimento(LocalDate.of(2028, 5, 15)); 
        p1.setProfissao("Engenheiro");

        System.out.println("Nome da pessoa 1: " + p1.getNome());
        System.out.println("Data de nascimento da pessoa 1: " + p1.getDataNascimento());
        System.out.println("Idade da pessoa 1: " + p1.getIdade().getYears() + " anos");
        System.out.println("Profissão da pessoa 1: " + p1.getProfissao());
        System.out.println();

	}

}
