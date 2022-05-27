package br.com.fiap.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Relevo")
public class Relevo {
	@Id
	@GeneratedValue
	private Integer idRelevo;
	@Column(name="tipoRelevo", nullable=false)
	private String tipoRelevo;
	
	public Integer getIdRelevo() {
		return idRelevo;
	}
	
	public void setIdRelevo(Integer idRelevo) {
		this.idRelevo = idRelevo;
	}

	public String getTipoRelevo() {
		return tipoRelevo;
	}

	public void setTipoRelevo(String tipoRelevo) {
		this.tipoRelevo = tipoRelevo;
	}
	


}
