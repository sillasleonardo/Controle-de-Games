package br.com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.game.bean.MidiaBean;
import br.com.game.dao.MidiaDao;

@Controller
public class MidiaController {
	
	@Autowired
	private MidiaDao dao;
	
	@RequestMapping("novaMidia")
	public String formMidia(){
		return "midia/formMidia";
	}
	
	@RequestMapping("adicionaMidia")
	public String adiciona(MidiaBean midia){
		dao.adiciona(midia);
		return "redirect:listaMidia";
	}
	
	@RequestMapping("listaMidia")
	public String lista(Model model){
		model.addAttribute("midia", dao.lista());
		return "midia/listaMidia";
	}
	
	@RequestMapping("mostraMidia")
	public String mostra(Integer mid_id, Model model){
		model.addAttribute("midia", dao.buscaPorId(mid_id));
		return "midia/mostraMidia";
	}
	
	@RequestMapping("alteraMidia")
	public String altera(MidiaBean midia){
		dao.altera(midia);
		return "redirect:listaMidia";
	}
	
	@RequestMapping("removeMidia")
	public String remove(MidiaBean midia){
		dao.remove(midia);
		return "redirect:listaMidia";
	}

}
