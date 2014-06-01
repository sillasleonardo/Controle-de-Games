package br.com.game.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.game.bean.GeneroBean;


@Repository
public class GeneroDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void adiciona(GeneroBean genero){
		em.persist(genero);
	}
	
	public List<GeneroBean> lista(){
		return em.createQuery("select g from GeneroBean g").getResultList();
	}
	
	@Transactional
	public void altera(GeneroBean genero){
		em.merge(genero);
	}
	
	@Transactional
	public GeneroBean buscaPorId(Integer gen_id){
		return em.find(GeneroBean.class, gen_id);
	}
	
	@Transactional
	public void remove(GeneroBean genero){
		GeneroBean generoARemover = buscaPorId(genero.getGen_id());
		em.remove(generoARemover);
	}

}
