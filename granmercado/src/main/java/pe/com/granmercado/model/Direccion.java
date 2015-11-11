package pe.com.granmercado.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "`APE_MA_DIRECCION`", schema = "`APEGA`")
public class Direccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="APE_SEQ_DIRECCION")
	@Column(name = "`id_direccion`", nullable = false)
	private int idDireccion;

	@Column(name = "`direccion_1`", nullable = false)
	private String direccionPrimera;

	@Column(name = "`direccion_2`", nullable = false)
	private String direccionSegunda;

	@Column(name = "`cod_ubigeo`", nullable = false)
	private String codigoUbigeo;
	
	@ManyToOne
	@JoinColumn(name = "`id_persona`")
	private Persona persona;	

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDireccionPrimera() {
		return direccionPrimera;
	}

	public void setDireccionPrimera(String direccionPrimera) {
		this.direccionPrimera = direccionPrimera;
	}

	public String getDireccionSegunda() {
		return direccionSegunda;
	}

	public void setDireccionSegunda(String direccionSegunda) {
		this.direccionSegunda = direccionSegunda;
	}

	public String getCodigoUbigeo() {
		return codigoUbigeo;
	}

	public void setCodigoUbigeo(String codigoUbigeo) {
		this.codigoUbigeo = codigoUbigeo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}