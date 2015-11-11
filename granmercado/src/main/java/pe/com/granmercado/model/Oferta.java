package pe.com.granmercado.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "`APE_TR_OFERTA`", schema = "`APEGA`")
public class Oferta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="APE_SEQ_OFERTA")
	@Column(name = "`id_oferta`", nullable = false)
	private int idOferta;

	@Column(name = "`volumen_oferta`", nullable = false)
	private Double volumenOferta;

	@Column(name = "`medida_cantidad`", nullable = false)
	private String medidaCantidad;

	@Column(name = "`presentacion_producto`", nullable = false)
	private String presentacionProducto;

	@Column(name = "`monto_cantidad`", nullable = false)
	private double montoCantidad;

	@Column(name = "`monto_moneda`", nullable = false)
	private String montoMoneda;

	@Column(name = "`estado`", nullable = false)
	private int estado;

	@ManyToOne
	@JoinColumn(name = "`cod_producto`")
	private Producto producto;

	@Column(name = "`cod_ubigeo`", nullable = false)
	private String codigoUbigeo;

	@Column(name = "`fecha_creacion`", nullable = false)
	private String fechaCreacion;

	@Column(name = "`usuario_creacion`", nullable = false)
	private String usuarioCreacion;

	@Column(name = "`fecha_modifcacion`", nullable = false)
	private String fechaModificacion;

	@Column(name = "`usuario_modificacion`", nullable = false)
	private String usuarioModificacion;

	public int getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	public Double getVolumenOferta() {
		return volumenOferta;
	}

	public void setVolumenOferta(Double volumenOferta) {
		this.volumenOferta = volumenOferta;
	}

	public String getMedidaCantidad() {
		return medidaCantidad;
	}

	public void setMedidaCantidad(String medidaCantidad) {
		this.medidaCantidad = medidaCantidad;
	}

	public String getPresentacionProducto() {
		return presentacionProducto;
	}

	public void setPresentacionProducto(String presentacionProducto) {
		this.presentacionProducto = presentacionProducto;
	}

	public double getMontoCantidad() {
		return montoCantidad;
	}

	public void setMontoCantidad(double montoCantidad) {
		this.montoCantidad = montoCantidad;
	}

	public String getMontoMoneda() {
		return montoMoneda;
	}

	public void setMontoMoneda(String montoMoneda) {
		this.montoMoneda = montoMoneda;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getCodigoUbigeo() {
		return codigoUbigeo;
	}

	public void setCodigoUbigeo(String codigoUbigeo) {
		this.codigoUbigeo = codigoUbigeo;
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