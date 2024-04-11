package view;

import model.ContaBancaria;

public class ContaBancariaPrincipal {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		c1.nome = "João da Silva";
		c1.numeroConta = 12345;
		
		// Realizar depósito
		c1.realizarDeposito(100.00);
		System.out.println("Saldo após depósito: R$" + c1.saldo);
		
		// Realizar saque
		c1.realizarSaque(50.00);
		//System.out.println("Saldo após saque: R$" + c1.saldo);
        
     // Tentar realizar saque em que valor maior que o saldo
        c1.realizarSaque(1000.00);
     // System.out.println("Saldo após tentativa de saque: R$" + c1.saldo);

	}

}
