package dto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class RepostajeNormalDTO {

	

	
	private int id;

	private String md_uuid;
	
	private Calendar md_date;
	
	private double importe;
	
	

	


	@Override
	public String toString() {
		return "RepostajeNormal [id=" + id + ", md_uuid=" + md_uuid + ", md_date=" + md_date + ", importe=" + importe
				+ "]";
	}

	public RepostajeNormalDTO() {
		super();
	}

	public RepostajeNormalDTO( String md_uuid, Calendar md_date, double importe) {
		super();
		
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.importe = importe;
	}

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

	public Calendar getMd_date() {
		return md_date;
	}

	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	
	

	




}
