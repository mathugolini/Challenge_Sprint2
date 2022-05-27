package br.com.fiap.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Produto")
public class Produto {
	@Id
	@GeneratedValue
	private Integer idProduto;
	@Column(name="nome_produto", nullable=false)
	private String nomeProduto;
	@Column(name="validade_produto", nullable=true)
	private String validadeProduto;
	@Column(name="temperatura_recomendada", nullable=true)
	private String temperaturaRecomendada;
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;
	
	public Integer getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getValidadeProduto() {
		return validadeProduto;
	}
	
	public void setValidadeProduto(String validadeProduto) {
		this.validadeProduto = validadeProduto;
	}
	
	public String getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}
	
	public void setTemperaturaRecomendada(String temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
