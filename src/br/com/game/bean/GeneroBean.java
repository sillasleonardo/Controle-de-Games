package br.com.game.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class GeneroBean {
	
	@Id @GeneratedValue
	private Integer gen_id;
	private String gen_nome;
	private String gen_descricao;
	
	public Integer getGen_id() {
		return gen_id;
	}
	public void setGen_id(Integer gen_id) {
		this.gen_id = gen_id;
	}
	public String getGen_nome() {
		return gen_nome;
	}
	public void setGen_nome(String gen_nome) {
		this.gen_nome = gen_nome;
	}
	public String getGen_descricao() {
		return gen_descricao;
	}
	public void setGen_descricao(String gen_descricao) {
		this.gen_descricao = gen_descricao;
	}

}
