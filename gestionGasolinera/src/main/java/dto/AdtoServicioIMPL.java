package dto;

import java.util.Calendar;

public class AdtoServicioIMPL implements AdtoServicio {

	@Override
	public RepostajeFacturaDTO ARepostajeFacturaDTO(String md_uuid, Calendar md_date, double importe, String dni,
			String matricula) {
		RepostajeFacturaDTO repostajeFacturaDTO = new RepostajeFacturaDTO(md_uuid, md_date, importe, dni, matricula);
		return repostajeFacturaDTO;
	}

	@Override
	public RepostajeNormalDTO ARepostajeNormalDTO(String md_uuid, Calendar md_date, double importe) {
		
		RepostajeNormalDTO repostajeNormalDTO = new RepostajeNormalDTO( md_uuid,  md_date,  importe);
		return repostajeNormalDTO;
	}

	@Override
	public RepostajeGasolineraDTO ARepostajeGasolineraDTO(String md_uuid, double litros, String combustible,
			double importe_total) {
		
		RepostajeGasolineraDTO repostajeGasolineraDTO= new  RepostajeGasolineraDTO(md_uuid, litros, combustible, importe_total);
		// TODO Auto-generated method stub
		return repostajeGasolineraDTO;
	}

}
