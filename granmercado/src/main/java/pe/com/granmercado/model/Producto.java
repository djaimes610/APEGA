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
@Table(name = "`APE_MA_PRODUCTO`", schema = "`APEGA`")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`COD_PRODUCTO`", nullable = false)
	private int codProducto;

	@Column(name = "`DESC_PRODUCTO`", nullable = false)
	private String descProducto;

	@Column(name = "`NOM_PRODUCTO`", nullable = false)
	private String nomProducto;

	@Column(name = "`CALIDAD_PRODUCTO`", nullable = false)
	private String calidadProducto;

	@Column(name = "`IMAGEN_PRODUCTO`", nullable = false)
	private String imagenProducto;

	@ManyToOne
	@JoinColumn(name = "`COD_CATEGORIA`")
	private Categoria categoria;

	@Column(name = "`MONTO_CANTIDAD`", nullable = false)
	private int montoCantidad;

	@Column(name = "`UNMED_PRODUCTO`", nullable = false)
	private String unmedProducto;

	@Column(name = "`MEMO_PRODUCTO`", nullable = false)
	private String memoProducto;

	@Column(name = "`MONTO_MONEDA`", nullable = false)
	private String montoMoneda;

	@Column(name = "`OBSERVACIONES`", nullable = false)
	private String observaciones;

	@Column(name = "`ESTADO`", nullable = false)
	private String estado;

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public String getDescProducto() {
		return descProducto;
	}

	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public String getCalidadProducto() {
		return calidadProducto;
	}

	public void setCalidadProducto(String calidadProducto) {
		this.calidadProducto = calidadProducto;
	}

	public String getImagenProducto() {
		return imagenProducto;
	}

	public void setImagenProducto(String imagenProducto) {
		this.imagenProducto = imagenProducto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getMontoCantidad() {
		return montoCantidad;
	}

	public void setMontoCantidad(int montoCantidad) {
		this.montoCantidad = montoCantidad;
	}

	public String getUnmedProducto() {
		return unmedProducto;
	}

	public void setUnmedProducto(String unmedProducto) {
		this.unmedProducto = unmedProducto;
	}

	public String getMemoProducto() {
		return memoProducto;
	}

	public void setMemoProducto(String memoProducto) {
		this.memoProducto = memoProducto;
	}

	public String getMontoMoneda() {
		return montoMoneda;
	}

	public void setMontoMoneda(String montoMoneda) {
		this.montoMoneda = montoMoneda;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}