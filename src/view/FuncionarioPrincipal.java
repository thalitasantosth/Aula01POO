package view;

import model.Funcionario;

public class FuncionarioPrincipal {

	public static void main(String[] args) {
		
		double descontos = 100.0; // Exemplo de desconto
        double beneficios = 50.0; // Exemplo de benefício
        
        // Salário abaixo do mínimo
		Funcionario f1 = new Funcionario();
        f1.setNome("João");
        f1.setSalario(1000.00); 
        f1.setCargo("Analista de Suporte");
        
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Salário bruto: R$" + f1.getSalario());
        System.out.println("Salário liquido: R$" + f1.getSalarioLiquido(descontos, beneficios));
        System.out.println();
        
        // Salário acima do mínimo
        Funcionario f2 = new Funcionario();
        f2.setNome("Maria");
        f2.setSalario(2050.00); 
        f2.setCargo("Desenvolvedor Java");
        
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Cargo: " + f2.getCargo());
        System.out.println("Salário bruto: R$" + f2.getSalario());
        System.out.println("Salário liquido: R$" + f2.getSalarioLiquido(descontos, beneficios));
        System.out.println();
        
        // Salário igual ao mínimo
        Funcionario f3 = new Funcionario();
        f3.setNome("Carlos");
        f3.setSalario(1412.00);
        f3.setCargo("Estagiário");
        
        System.out.println("Nome: " + f3.getNome());
        System.out.println("Cargo: " + f3.getCargo());
        System.out.println("Salário bruto: R$" + f3.getSalario());
        System.out.println("Salário liquido: R$" + f3.getSalarioLiquido(descontos, beneficios));

	}

}
