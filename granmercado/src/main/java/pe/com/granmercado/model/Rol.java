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
@Table(name = "`APE_MA_ROL`", schema = "`APEGA`")
public class Rol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @Column(name="`ID_ROL`", unique=true, nullable=false)
    private int idRol;
     
    @Column(name="`DESCRIPCION_ROL`", nullable=false)
    private String descripcionRol;
    
    @Column(name = "`FECHA_CREACION`", nullable = false)
    private String fechaCreacion;
    
    @Column(name = "`USUARIO_CREACION`", nullable = false)
    private String usuarioCreacion;
    
    @Column(name = "`FECHA_MODIFICACION`", nullable = false)
    private String fechaModificacion;
    
    @Column(name = "`USUARIO_MODIFICACION`", nullable = false)
    private String usuarioModificacion;

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getDescripcionRol() {
		return descripcionRol;
	}

	public void setDescripcionRol(String descripcionRol) {
		this.descripcionRol = descripcionRol;
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

}