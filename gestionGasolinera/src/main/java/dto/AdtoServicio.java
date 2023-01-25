package dto;

import java.util.Calendar;

public interface AdtoServicio {

	public RepostajeFacturaDTO ARepostajeFacturaDTO(String md_uuid, Calendar md_date, double importe, String dni, String matricula);
	
	public RepostajeNormalDTO ARepostajeNormalDTO(String md_uuid, Calendar md_date, double importe);
	
	public RepostajeGasolineraDTO ARepostajeGasolineraDTO( String md_uuid, double litros, String combustible, double importe_total);
}
