package br.com.game.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="midia")
public class MidiaBean {
	
	@Id @GeneratedValue
	private Integer mid_id;
	private String mid_nome;
	
	public Integer getMid_id() {
		return mid_id;
	}
	public void setMid_id(Integer mid_id) {
		this.mid_id = mid_id;
	}
	public String getMid_nome() {
		return mid_nome;
	}
	public void setMid_nome(String mid_nome) {
		this.mid_nome = mid_nome;
	}
	
	

}
