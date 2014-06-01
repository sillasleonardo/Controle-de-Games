package br.com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.game.bean.PlataformaBean;
import br.com.game.dao.PlataformaDao;

@Controller
public class PlataformaController {
	@Autowired
	private PlataformaDao dao;
	
	@RequestMapping("novaPlataforma")
	public String formPla(){
		return "plataforma/formPlataforma";
	}
	
	@RequestMapping("adicionaPlataforma")
	public String adiciona(PlataformaBean plataforma){
		dao.adiciona(plataforma);
		return "plataforma/listaPlataforma";
	}
	
	@RequestMapping("listaPlataforma")
	public String listaPlataforma(Model model){
		model.addAttribute("plataforma", dao.lista());
		return "plataforma/listaPlataforma";
	}
	
	@RequestMapping("mostraPlataforma")
	public String mostraPlataforma(Integer pla_id, Model model){
		model.addAttribute("plataforma", dao.buscaPorId(pla_id));
		return "plataforma/mostraPlataforma";
	}
	
	@RequestMapping("alteraPlataforma")
	public String alteraPlataforma(PlataformaBean plataforma){
		dao.altera(plataforma);
		return "redirect:listaPlataforma";
	}
	
	@RequestMapping("removePlataforma")
	public String removePlataforma(PlataformaBean plataforma){
		dao.remove(plataforma);
		return "redirect:listaPlataforma";
	}
	
}
