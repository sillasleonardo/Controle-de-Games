package br.com.game.bean;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="game")
public class GameBean {
	
	@Id @GeneratedValue
	private Integer game_id;
	private String game_nome;
	@Temporal(TemporalType.DATE)
	private Calendar game_data;
	private String game_descricao;
	private byte[] game_capa;
	@ManyToOne
	private GeneroBean gen;
	@ManyToOne
	private MidiaBean mid;
	@ManyToOne
	private PlataformaBean pla;
	
	public GameBean(){
		
	}
	
	public Integer getGame_id() {
		return game_id;
	}
	public void setGame_id(Integer game_id) {
		this.game_id = game_id;
	}
	public String getGame_nome() {
		return game_nome;
	}
	public void setGame_nome(String game_nome) {
		this.game_nome = game_nome;
	}
	public Calendar getGame_data() {
		return game_data;
	}
	public void setGame_data(Calendar game_data) {
		this.game_data = game_data;
	}
	public String getGame_descricao() {
		return game_descricao;
	}
	public void setGame_descricao(String game_descricao) {
		this.game_descricao = game_descricao;
	}
	public byte[] getGame_capa() {
		return game_capa;
	}
	public void setGame_capa(byte[] game_capa) {
		this.game_capa = game_capa;
	}
	public GeneroBean getGen() {
		return gen;
	}
	public void setGen(GeneroBean gen) {
		this.gen = gen;
	}
	public MidiaBean getMid() {
		return mid;
	}
	public void setMid(MidiaBean mid) {
		this.mid = mid;
	}
	public PlataformaBean getPla() {
		return pla;
	}
	public void setPla(PlataformaBean pla) {
		this.pla = pla;
	}
	
}
