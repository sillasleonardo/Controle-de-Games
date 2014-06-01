package br.com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.game.bean.GameBean;
import br.com.game.dao.GameDao;
import br.com.game.dao.GeneroDao;
import br.com.game.dao.MidiaDao;
import br.com.game.dao.PlataformaDao;

@Controller
public class GameController {
	
	@Autowired
	private GameDao dao;
	@Autowired
	private GeneroDao genDao;
	@Autowired
	private PlataformaDao plaDao;
	@Autowired
	private MidiaDao midDao;
	
	@RequestMapping("novoGame")
	public String formGame(Model model){
	       model.addAttribute("genero", genDao.lista());
	       model.addAttribute("plataforma", plaDao.lista());
	       model.addAttribute("midia", midDao.lista());
	       return "game/formGame";
	   }
	
	@RequestMapping("adicionaGame")
	public String adiciona(GameBean game){
		game.setGen(genDao.buscaPorId(game.getGen().getGen_id()));
		game.setMid(midDao.buscaPorId(game.getMid().getMid_id()));
		game.setPla(plaDao.buscaPorId(game.getPla().getPla_id()));
		
		dao.adiciona(game);
		return "game/listaGame";
	}
	
	@RequestMapping("listaGame")
	public String lista(Model model){
		model.addAttribute("game", dao.lista());
		return "game/listaGame";
	}
	
	@RequestMapping("mostraGame")
	public String mostra(Integer game_id, Model model){
		model.addAttribute("game", dao.buscaPorId(game_id));
		return "game/mostraGame";
	}
	
	@RequestMapping("alteraGame")
	public String altera(GameBean game){
		dao.altera(game);
		return "redirect:listaGame";
	}
	
	@RequestMapping("removeGame")
	public String remove(GameBean game){
		dao.remove(game);
		return "redirect:listaGame";
	}
}
