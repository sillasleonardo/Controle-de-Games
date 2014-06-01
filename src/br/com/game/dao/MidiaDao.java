package br.com.game.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.game.bean.MidiaBean;

@Repository
public class MidiaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void adiciona(MidiaBean midia){
		em.persist(midia);
	}
	
	public List<MidiaBean> lista(){
		return em.createQuery("select m from MidiaBean m").getResultList();
	}
	
	@Transactional
	public void altera(MidiaBean midia){
		em.merge(midia);
	}
	
	@Transactional
	public MidiaBean buscaPorId(Integer mid_id){
		return em.find(MidiaBean.class, mid_id);
	}
	
	@Transactional
	public void remove(MidiaBean midia){
		MidiaBean midiaARemover = buscaPorId(midia.getMid_id());
		em.remove(midiaARemover);
	}
}
