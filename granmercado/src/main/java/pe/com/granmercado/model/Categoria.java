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
@Table(name = "`APE_MA_CATEGORIA`", schema = "`APEGA`")
public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`COD_CATEGORIA`", nullable = false)
	private int codCategoria;

	@Column(name = "`NOM_CATEGORIA`", nullable = false)
	private String nomCategoria;

	@Column(name = "`USUARIO_CREACION`", nullable = false)
	private String usuarioCreacion;

	@Column(name = "`FECHA_CREACION`", nullable = false)
	private Date fechaCreacion;

	@Column(name = "`USUARIO_MODIFICACION`", nullable = false)
	private String usuarioModificacion;

	@Column(name = "`FECHA_MODIFICACION`", nullable = false)
	private int fechaModificacion;

	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getNomCategoria() {
		return nomCategoria;
	}

	public void setNomCategoria(String nomCategoria) {
		this.nomCategoria = nomCategoria;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public int getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(int fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}