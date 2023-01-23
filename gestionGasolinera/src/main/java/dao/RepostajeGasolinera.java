package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dlk_repostaje_gasolinera", schema="bd_gestor_gasolinera")
public class RepostajeGasolinera {
	
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="md_uuid")
	private String md_uuid;
	
	@Column(name="litros")
	private double litros;
	
	@Column(name="tipo_combustible")
	private String combustible;
	
	@Column(name="importe_total")
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

	public RepostajeGasolinera(int id, String md_uuid, double litros, String combustible, double importe_total) {
		super();
		this.id = id;
		this.md_uuid = md_uuid;
		this.litros = litros;
		this.combustible = combustible;
		this.importe_total = importe_total;
	}
	
	
}
