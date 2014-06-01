package br.com.game.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.game.bean.GameBean;

@Repository
public class GameDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void adiciona(GameBean game){
		em.persist(game);
	}
	
	public List<GameBean> lista(){
		return em.createQuery("select g from GameBean g").getResultList();
	}
	
	@Transactional
	public void altera(GameBean game){
		em.merge(game);
	}
	
	@Transactional
	public GameBean buscaPorId(Integer game_id){
		return em.find(GameBean.class, game_id);
	}
	
	@Transactional
	public void remove(GameBean game){
		GameBean gameARemover = buscaPorId(game.getGame_id());
		em.remove(gameARemover);
	}
}
