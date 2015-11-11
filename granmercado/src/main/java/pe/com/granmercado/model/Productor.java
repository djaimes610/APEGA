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
@Table(name = "`APE_MA_PRODUCTOR`", schema = "`APEGA`")
public class Productor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="APE_SEQ_PRODUCTOR")
	@Column(name = "`id_productor`", nullable = false)
	private int idProductor;

	@ManyToOne
	@JoinColumn(name = "`id_persona`")
	private int idPersona;

	@Column(name = "`descripcion_productor`", nullable = false)
	private String descripcionProductor;

	@Column(name = "`descripcion_organizacion`", nullable = false)
	private String descripcionOrganizacion;

	@Column(name = "`imagen_productor`", nullable = false)
	private String imagenProductor;
	
	@Column(name = "`estado`", nullable = false)
	private String estado;	

	@Column(name = "`descripcion_procedencia`", nullable = false)
	private String descripcionProcedencia;

	@Column(name = "`fecha_creacion`", nullable = false)
	private Date fechaCreacion;

	@Column(name = "`usuario_creacion`", nullable = false)
	private String usuarioCreacion;

	@Column(name = "`fecha_modificacion`", nullable = false)
	private Date fechaModificacion;

	@Column(name = "`usuario_modificacion`", nullable = false)
	private String usuarioModificacion;




}