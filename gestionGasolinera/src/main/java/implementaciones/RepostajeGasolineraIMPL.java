package implementaciones;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.RepostajeGasolinera;
import dao.RepostajeGasolineraImpl;

@Service
public class RepostajeGasolineraIMPL {

	@Autowired
	private RepostajeGasolineraImpl r;
	
	@Transactional
	public void Insertar(RepostajeGasolinera repostaje) {
		
		
		r.InsertarEnGasolinera(repostaje);
	}
	@Transactional
	public List<RepostajeGasolinera>  Mostrar() {
		return r.listaRepostajesGasolinera();
		
	}
	@Transactional
	public void borrar(List<RepostajeGasolinera> repostajeBorrar) {
		r.borrar(repostajeBorrar);
	}
}
