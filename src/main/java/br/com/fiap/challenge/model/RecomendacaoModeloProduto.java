package br.com.fiap.challenge.model;

public class RecomendacaoModeloProduto {
	private ModeloCaminhao modeloCaminhao;
	private Produto produto;

	
	public ModeloCaminhao getModeloCaminhao() {
		return modeloCaminhao;
	}
	
	public void setModeloCaminhao(ModeloCaminhao modeloCaminhao) {
		this.modeloCaminhao = modeloCaminhao;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
