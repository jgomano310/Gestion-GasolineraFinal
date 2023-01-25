package dto;

import java.util.Calendar;

import dao.RepostajeFactura;
import dao.RepostajeGasolinera;
import dao.RepostajeNormal;

public class AdaoServicioIMPL implements AdaoServicio {

	@Override
	public RepostajeNormal RepostajeNormalDTOaDAO(RepostajeNormalDTO repostajeNormalDTO) {
		// TODO Auto-generated method stub
		RepostajeNormal repostajeNormal = new RepostajeNormal();
		
		if(repostajeNormalDTO!=null) {
			
			repostajeNormal.setImporte(repostajeNormalDTO.getImporte());
			repostajeNormal.setMd_date(repostajeNormalDTO.getMd_date());
			repostajeNormal.setMd_uuid(repostajeNormalDTO.getMd_uuid());
			
			
		}
		
		
		return repostajeNormal;
	}

	@Override
	public RepostajeFactura RepostajeFacturaDTOaDAO(RepostajeFacturaDTO repostajeFacturaDTO) {
		// TODO Auto-generated method stub
		RepostajeFactura repostajeFactura = new RepostajeFactura();
		
		if(repostajeFacturaDTO!=null) {
			
		
			repostajeFactura.setImporte(repostajeFacturaDTO.getImporte());
			repostajeFactura.setMd_date(repostajeFacturaDTO.getMd_date());
			repostajeFactura.setMd_uuid(repostajeFacturaDTO.getMd_uuid());
			repostajeFactura.setDni(repostajeFacturaDTO.getDni());
			repostajeFactura.setMatricula(repostajeFacturaDTO.getMatricula());
			
			
			
		}
		return repostajeFactura;
	}
	

	@Override
	public RepostajeGasolinera RepostajeGasolineraDTOaDAO(RepostajeGasolineraDTO repostajeGasolineraDTO) {
		// TODO Auto-generated method stub
		RepostajeGasolinera repostajeGasolinera = new RepostajeGasolinera();
		
		repostajeGasolinera.setMd_uuid(repostajeGasolineraDTO.getMd_uuid());
		repostajeGasolinera.setLitros(repostajeGasolineraDTO.getLitros());
		repostajeGasolinera.setCombustible(repostajeGasolineraDTO.getCombustible());
		repostajeGasolinera.setImporte_total(repostajeGasolineraDTO.getImporte_total());
	
		
	
		return repostajeGasolinera;
	}

}
