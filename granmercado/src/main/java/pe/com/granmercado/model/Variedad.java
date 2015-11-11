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
@Table(name = "`APE_MA_VARIEDAD`", schema = "`APEGA`")
public class Variedad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="APE_SEQ_VARIEDAD")
	@Column(name = "`COD_VARIEDAD`", nullable = false)
	private int codVariedad;

	@Column(name = "`NOM_VARIEDAD`", nullable = false)
	private String nomVariedad;

	@Column(name = "`DESC_VARIEDAD`", nullable = false)
	private String descVariedad;

	@Column(name = "`ESTADO`", nullable = false)
	private int estado;
	
	@ManyToOne
	@JoinColumn(name = "`COD_PRODUCTO`")
	private Producto producto;

	public int getCodVariedad() {
		return codVariedad;
	}

	public void setCodVariedad(int codVariedad) {
		this.codVariedad = codVariedad;
	}

	public String getNomVariedad() {
		return nomVariedad;
	}

	public void setNomVariedad(String nomVariedad) {
		this.nomVariedad = nomVariedad;
	}

	public String getDescVariedad() {
		return descVariedad;
	}

	public void setDescVariedad(String descVariedad) {
		this.descVariedad = descVariedad;
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


}