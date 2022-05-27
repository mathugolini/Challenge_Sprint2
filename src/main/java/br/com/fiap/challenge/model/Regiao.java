package br.com.fiap.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Regiao")
public class Regiao {
	@Id
	@GeneratedValue
	private Integer idRegiao;
	@Column(name="nome_estado", nullable=false)
	private String nomeEstado;
	@Column(name="nome_pais", nullable=false)
	private String nomePais;
	@ManyToOne
	@JoinColumn(name="clima_id")
	private Clima clima;
	
	public Integer getIdRegiao() {
		return idRegiao;
	}
	
	public void setIdRegiao(Integer idRegiao) {
		this.idRegiao = idRegiao;
	}
	
	public String getNomeEstado() {
		return nomeEstado;
	}
	
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	
	public String getNomePais() {
		return nomePais;
	}
	
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	
	public Clima getClima() {
		return clima;
	}
	
	public void setClima(Clima clima) {
		this.clima = clima;
	}
	
}
