package br.com.fiap.challenge.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categoria")
public class Categoria {
	@Id
	@GeneratedValue
	private Integer idCategoria;
	@Column(name="nome_categoria", nullable=false)
	private String nomeCategoria;
	@OneToMany
	private List<Produto> produtos;
	
	public Integer getIdCategoria() {
		return idCategoria;
	}
	
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
