package br.com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.game.bean.GeneroBean;
import br.com.game.dao.GeneroDao;

@Controller
public class GeneroController {
	
	@Autowired
	private GeneroDao dao;
	
	@RequestMapping("novoGenero")
	public String formGenero(){
		return "genero/formGenero";
	}
	
	@RequestMapping("adicionaGenero")
	public String adiciona(GeneroBean genero){
		dao.adiciona(genero);
		return"genero/listaGenero";
	}
	
	@RequestMapping("listaGenero")
	public String listaGenero(Model model){
		model.addAttribute("genero", dao.lista());
		return "genero/listaGenero";
	}
	
	@RequestMapping("mostraGenero")
	public String mostraGenero(Integer gen_id, Model model){
		model.addAttribute("genero", dao.buscaPorId(gen_id));
		return "genero/mostraGenero";
	}
	
	@RequestMapping("alteraGenero")
	public String alteraGenero(GeneroBean genero){
		dao.altera(genero);
		return "redirect:listaGenero";
	}
	
	@RequestMapping("removeGenero")
	public String removeGenero(GeneroBean genero){
		dao.remove(genero);
		return "redirect:listaGenero";
	}
}
