package dao;

import java.util.List;

public interface InterfazRepostajeGasolinera {

	public void InsertarEnGasolinera(RepostajeGasolinera repostaje);
	
	public List<RepostajeGasolinera> listaRepostajesGasolinera();
	
	public void borrar(List<RepostajeGasolinera> lista);
	
}
