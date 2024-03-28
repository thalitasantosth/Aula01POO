package model;

public class ContaBancaria {
	
	public int numeroConta;
	public String nome;
	public double saldo;
	
	public ContaBancaria () {
		numeroConta = 0;
		nome = null;
		saldo = 0.00;
			
	}
	
	public double realizarDeposito(double valor) {
		return valor;
		
	}
	
	public double realizarSaque(double valor) {
		return valor;

	}

}
