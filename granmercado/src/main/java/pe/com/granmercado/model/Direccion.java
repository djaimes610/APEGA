package pe.com.granmercado.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`APE_MA_DIRECCION`", schema = "`APEGA`")
public class Direccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`ID_DIRECCION`", nullable = false)
	private int idDireccion;

	@Column(name = "`DIRECCION_1`", nullable = false)
	private String direccionPrimera;

	@Column(name = "`DIRECCION_2`", nullable = false)
	private String direccionSegunda;

	@Column(name = "`COD_UBIGEO`", nullable = false)
	private String codigoUbigeo;

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

}