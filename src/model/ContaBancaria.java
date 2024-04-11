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
		if (valor > 0) {
            saldo += valor; // Adiciona o valor ao saldo da conta
        }
        return saldo; // Retorna o saldo atualizado
		
	}
	
	public double realizarSaque(double valor) {
		if (valor > 0 && valor <= saldo) {
            saldo -= valor; // Subtrai o valor do saldo da conta
            System.out.println("Saldo após tentativa de saque: R$" + saldo);
        } else {
        	System.out.println("Saldo insuficiente para saque, saldo atual R$" + saldo);
        }
		
        return saldo; // Retorna o saldo atualizado

	}

}
