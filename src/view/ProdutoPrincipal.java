package view;

import model.Produto;

public class ProdutoPrincipal {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.setNome("Camiseta");
		p1.setPreco(29.90f);
		p1.setQtdEstoque(10);

        Produto p2 = new Produto();
        p2.setNome("Calça");
        p2.setPreco(59.90f);
        p2.setQtdEstoque(5);
        
        System.out.println("Nome do produto 1: " + p1.getNome());
        System.out.println("Preço do produto 1: R$" + p1.getPreco());
        System.out.println("Quantidade em estoque do produto 1: " + p1.getQtdEstoque());
        System.out.println("Valor total em estoque do produto 1: R$" + p1.totalValorEstoque());
        System.out.println("O produto 1 está disponível? " + p1.verificaProdutoDisponivel("Camiseta"));
        System.out.println();
        
        System.out.println("Nome do produto 2: " + p2.getNome());
        System.out.println("Preço do produto 2: R$" + p2.getPreco());
        System.out.println("Quantidade em estoque do produto 2: " + p2.getQtdEstoque());
        System.out.println("Valor total em estoque do produto 2: R$" + p2.totalValorEstoque());
        System.out.println("O produto 2 está disponível? " + p2.verificaProdutoDisponivel("Calça"));

	}

}
