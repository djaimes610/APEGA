package pe.com.granmercado.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "`APE_MA_OPCION`", schema = "`APEGA`")
public class Opcion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "`ID_OPCION`", unique = true, nullable = false)
	private int idOpcion;

	@Column(name = "`NOMBRE_PAGINA`", nullable = false)
	private String nombrePagina;

	@Column(name = "`RUTA_PAGINA`", nullable = false)
	private String rutaPagina;

	@Column(name = "`ESTADO`", nullable = false)
	private String estado;

	@Column(name = "`FECHA_CREACION`", nullable = false)
	private String fechaCreacion;

	@Column(name = "`USUARIO_CREACION`", nullable = false)
	private String usuarioCreacion;

	@Column(name = "`FECHA_MODIFICACION`", nullable = false)
	private String fechaModificacion;

	@Column(name = "`USUARIO_MODIFICACION`", nullable = false)
	private String usuarioModificacion;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "`APE_AS_OPCION_ROL`", joinColumns = { @JoinColumn(name = "`ID_OPCION`") }, inverseJoinColumns = {
			@JoinColumn(name = "`ID_ROL`") })
	private Set<Rol> roles = new HashSet<Rol>();

	public int getIdOpcion() {
		return idOpcion;
	}

	public void setIdOpcion(int idOpcion) {
		this.idOpcion = idOpcion;
	}

	public String getNombrePagina() {
		return nombrePagina;
	}

	public void setNombrePagina(String nombrePagina) {
		this.nombrePagina = nombrePagina;
	}

	public String getRutaPagina() {
		return rutaPagina;
	}

	public void setRutaPagina(String rutaPagina) {
		this.rutaPagina = rutaPagina;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

}