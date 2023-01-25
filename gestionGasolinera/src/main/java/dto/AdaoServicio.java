package dto;

import dao.RepostajeFactura;
import dao.RepostajeGasolinera;
import dao.RepostajeNormal;

public interface AdaoServicio {

public RepostajeNormal RepostajeNormalDTOaDAO(RepostajeNormalDTO repostajeNormalDTO);
	
	public RepostajeFactura RepostajeFacturaDTOaDAO(RepostajeFacturaDTO repostajeFacturaDTO);
	
	public RepostajeGasolinera RepostajeGasolineraDTOaDAO(RepostajeGasolineraDTO repostajeGasolineraDTO);
}
