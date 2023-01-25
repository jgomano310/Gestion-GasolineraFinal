package dto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class RepostajeFacturaDTO {

	
	
	private int id;
	
	private String md_uuid;
	
	private Calendar md_date;
	
	private double importe;
	
	
	private String dni;
	
	private String matricula;

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "RepostajeFacturaDTO [id=" + id + ", md_uuid=" + md_uuid + ", md_date=" + md_date + ", importe="
				+ importe + ", dni=" + dni + ", matricula=" + matricula + "]";
	}

	public RepostajeFacturaDTO( String md_uuid, Calendar md_date, double importe, String dni, String matricula) {
		super();
		
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.importe = importe;
		this.dni = dni;
		this.matricula = matricula;
	}
	
	
	
	
}
