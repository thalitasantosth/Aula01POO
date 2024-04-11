package model;

public class Produto {
	
	private String nome;
	private float preco;
	private int qtdEstoque;
	
	public Produto () {
		nome = null;
		preco = 0.0f;
		qtdEstoque = 0;
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome (String nome) {
		this.nome = nome;
		
	}
	
	public float getPreco() {
		return preco;
		
	}
	
	public void setPreco (float preco) {
		if (preco < 0.0f) {
			this.preco = 0.0f;
		} else {
			this.preco = preco;
		}
		
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
		
	}
	
	public void setQtdEstoque (int qtdEstoque) {
		if (qtdEstoque < 0) {
			this.qtdEstoque = 0;
		} else {
			this.qtdEstoque = qtdEstoque;
		}
		
	}
	
	public boolean verificaProdutoDisponivel (String nome) {
		return this.nome.equals(nome) && qtdEstoque > 0;
	}
	
	public float totalValorEstoque () {
		return preco * qtdEstoque;
	}

}
