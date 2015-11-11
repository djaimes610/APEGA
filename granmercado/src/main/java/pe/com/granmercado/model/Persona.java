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
@Table(name = "`APE_MA_PRODUCTO`", schema = "`APEGA`")
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="APE_SEQ_PERSONA")
	@Column(name = "`id_persona`", nullable = false)
	private int idPersona;

	@Column(name = "`nombres`", nullable = false)
	private String nombres;

	@Column(name = "`contacto_persona`", nullable = false)
	private String contactoPersona;

	@Column(name = "`telefono_persona`", nullable = false)
	private String telefonoPersona;
	
	@Column(name = "`correo_persona`", nullable = false)
	private String correoPersona;	
	
	@Column(name = "`estado`", nullable = false)
	private int estado;	

	@Column(name = "`fecha_creacion`", nullable = false)
	private Date fechaCreacion;

	@Column(name = "`usuario_creacion`", nullable = false)
	private String usuarioCreacion;

	@Column(name = "`fecha_modificacion`", nullable = false)
	private Date fechaModificacion;

	@Column(name = "`usuario_modificacion`", nullable = false)
	private String usuarioModificacion;




}