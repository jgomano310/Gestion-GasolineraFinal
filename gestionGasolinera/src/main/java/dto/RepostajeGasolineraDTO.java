package dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RepostajeGasolineraDTO {

private int id;
	
	private String md_uuid;
	
	private double litros;
	
	private String combustible;
	
	private double importe_total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public double getImporte_total() {
		return importe_total;
	}

	public void setImporte_total(double importe_total) {
		this.importe_total = importe_total;
	}

	@Override
	public String toString() {
		return "RepostajeGasolineraDTO [id=" + id + ", md_uuid=" + md_uuid + ", litros=" + litros + ", combustible="
				+ combustible + ", importe_total=" + importe_total + "]";
	}

	public RepostajeGasolineraDTO( String md_uuid, double litros, String combustible, double importe_total) {
		super();
		
		this.md_uuid = md_uuid;
		this.litros = litros;
		this.combustible = combustible;
		this.importe_total = importe_total;
	}
	
	
}
