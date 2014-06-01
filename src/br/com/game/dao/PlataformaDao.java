package br.com.game.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.game.bean.PlataformaBean;

@Repository
public class PlataformaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void adiciona(PlataformaBean plataforma){
		em.persist(plataforma);
	}
	
	public List<PlataformaBean> lista(){
		return em.createQuery("select p from PlataformaBean p").getResultList();
	}
	
	@Transactional
	public void altera(PlataformaBean plataforma){
		em.merge(plataforma);
	}
	
	@Transactional
	public PlataformaBean buscaPorId(Integer pla_id){
		return em.find(PlataformaBean.class, pla_id);
	}
	
	@Transactional
	public void remove(PlataformaBean plataforma){
		PlataformaBean plataformaARemover = buscaPorId(plataforma.getPla_id());
		em.remove(plataformaARemover);
	}

}
