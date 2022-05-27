package br.com.fiap.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ClimaMes")
public class ClimaMes {
	@Id
	@GeneratedValue
	private Integer idClimaMes;
	@Column(name="mes", nullable=false)
	private String mes;
	@Column(name="ano", nullable=false)
	private Integer ano;
	@Column(name="temperatura_media", nullable=false)
	private String temperaturaMedia;
	@Column(name="umidade", nullable=false)
	private String umidade;
	@Column(name="precipitacao", nullable=false)
	private String precipitacao;
	@Column(name="tempo_predominante", nullable=false)
	private String tempoPredominante;
	
	public Integer getIdClimaMes() {
		return idClimaMes;
	}
	
	public void setIdClimaMes(Integer idClimaMes) {
		this.idClimaMes = idClimaMes;
	}
	
	public String getMes() {
		return mes;
	}
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String getTemperaturaMedia() {
		return temperaturaMedia;
	}
	
	public void setTemperaturaMedia(String temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}
	
	public String getUmidade() {
		return umidade;
	}
	
	public void setUmidade(String umidade) {
		this.umidade = umidade;
	}
	
	public String getPrecipitacao() {
		return precipitacao;
	}
	
	public void setPrecipitacao(String precipitacao) {
		this.precipitacao = precipitacao;
	}
	
	public String getTempoPredominante() {
		return tempoPredominante;
	}
	
	public void setTempoPredominante(String tempoPredominante) {
		this.tempoPredominante = tempoPredominante;
	}
	
}
