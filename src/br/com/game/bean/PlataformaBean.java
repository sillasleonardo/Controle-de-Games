package br.com.game.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Plataforma")
public class PlataformaBean {
	
	@Id @GeneratedValue
	private Integer pla_id;
	private String pla_nome;
	private String pla_descricao;
	
	public Integer getPla_id() {
		return pla_id;
	}
	public void setPla_id(Integer pla_id) {
		this.pla_id = pla_id;
	}
	public String getPla_nome() {
		return pla_nome;
	}
	public void setPla_nome(String pla_nome) {
		this.pla_nome = pla_nome;
	}
	public String getPla_descricao() {
		return pla_descricao;
	}
	public void setPla_descricao(String pla_descricao) {
		this.pla_descricao = pla_descricao;
	}
	
}
