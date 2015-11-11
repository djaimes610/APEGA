package pe.com.granmercado.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "`APE_MA_CATEGORIA`", schema = "`APEGA`")
public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="APE_SEQ_CATEGORIA")
	@Column(name = "`COD_CATEGORIA`", nullable = false)
	private int codCategoria;

	@Column(name = "`NOM_CATEGORIA`", nullable = false)
	private String nomCategoria;

	@Column(name = "`ESTADO`", nullable = false)
	private int estado;
	
	@Column(name = "`DESCRIPCION_CATEGORIA`", nullable = false)
	private String descripcionCategoria;	
	
	@Column(name = "`IMAGEN_CATEGORIA`", nullable = false)
	private String imagenCategoria;
	
	@Column(name = "`PDF_CATEGORIA`", nullable = false)
	private String pdfCategoria;	
	
	@Column(name = "`USUARIO_CREACION`", nullable = false)
	private String usuarioCreacion;	

	@Column(name = "`FECHA_CREACION`", nullable = false)
	private Date fechaCreacion;

	@Column(name = "`USUARIO_MODIFICACION`", nullable = false)
	private String usuarioModificacion;

	@Column(name = "`FECHA_MODIFICACION`", nullable = false)
	private Date fechaModificacion;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "`APE_AS_CAT_ESTAC`", joinColumns = {
			@JoinColumn(name = "`id_categoria`") }, inverseJoinColumns = { @JoinColumn(name = "`id_estacionalidad`") })
	private Set<Estacionalidad> meses = new HashSet<Estacionalidad>();
	
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}

	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}

	public String getImagenCategoria() {
		return imagenCategoria;
	}

	public void setImagenCategoria(String imagenCategoria) {
		this.imagenCategoria = imagenCategoria;
	}

	public String getPdfCategoria() {
		return pdfCategoria;
	}

	public void setPdfCategoria(String pdfCategoria) {
		this.pdfCategoria = pdfCategoria;
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

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


}