package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class RepostajeGasolineraImpl implements InterfazRepostajeGasolinera {
	
	@PersistenceContext
	EntityManager entity;
	
	@Override
	public void InsertarEnGasolinera(RepostajeGasolinera repostaje) {
		// TODO Auto-generated method stubs
		entity.persist(repostaje);
		
	}

	@Override
	public List<RepostajeGasolinera> listaRepostajesGasolinera() {
		// TODO Auto-generated method stub
		return  entity.createQuery("SELECT repostaje FROM RepostajeGasolinera repostaje").getResultList();
	}

	@Override
	public void borrar(List<RepostajeGasolinera> lista) {
		// TODO Auto-generated method st
		entity.remove(lista.size()-1);
		}
		
		
	}


