package br.com.fiap.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ModeloCaminhao")
public class ModeloCaminhao {
	@Id
	@GeneratedValue
	private Integer idModeloCaminhao;
	@Column(name="nome_modelo_caminhao", nullable=false)
	private String nomeModeloCaminhao;
	
	public Integer getIdModeloCaminhao() {
		return idModeloCaminhao;
	}
	
	public void setIdModeloCaminhao(Integer idModeloCaminhao) {
		this.idModeloCaminhao = idModeloCaminhao;
	}

	public String getNomeModeloCaminhao() {
		return nomeModeloCaminhao;
	}

	public void setNomeModeloCaminhao(String nomeModeloCaminhao) {
		this.nomeModeloCaminhao = nomeModeloCaminhao;
	}
}
