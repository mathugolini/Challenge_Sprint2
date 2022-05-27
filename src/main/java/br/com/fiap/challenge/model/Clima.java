package br.com.fiap.challenge.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Clima")
public class Clima {
	@Id
	@GeneratedValue
	private Integer idClima;
	@Column(name="nome_clima", nullable=false)
	private String nomeClima;
	@OneToMany
	private List<Regiao> regioes;
	
	public Integer getIdClima() {
		return idClima;
	}
	
	public void setIdClima(Integer idClima) {
		this.idClima = idClima;
	}
	
	public String getNomeClima() {
		return nomeClima;
	}
	
	public void setNomeClima(String nomeClima) {
		this.nomeClima = nomeClima;
	}

	public List<Regiao> getRegioes() {
		return regioes;
	}

	public void setRegioes(List<Regiao> regioes) {
		this.regioes = regioes;
	}
	
	
}
