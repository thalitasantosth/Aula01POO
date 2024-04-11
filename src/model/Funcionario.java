package model;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String cargo;
	private double salario_min = 1412.00;
	
	public Funcionario () {
		nome = null;
		salario = 0.00;
		cargo = null;		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome (String nome) {
		this.nome = nome;
		
	}
	
	public double getSalario() {
		return salario;
		
	}
	
	public void setSalario(double salario) {
	    if (salario < salario_min) {
	        this.salario = salario_min;
	    } else {
	        this.salario = salario;
	    }
	}
	
		
	public String getCargo() {
		return cargo;
	
	}
		
	public void setCargo (String cargo) {
		this.cargo = cargo;
			
	}
	
	public double getSalarioLiquido(double descontos, double beneficios) {
		double salarioL = salario - (descontos + beneficios);
		return salarioL;
		
	}

}
