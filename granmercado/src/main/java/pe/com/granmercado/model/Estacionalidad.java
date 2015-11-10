package pe.com.granmercado.model;

import java.io.Serializable;
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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "`APE_MA_ESTACIONALIDAD`", schema = "`APEGA`")
public class Estacionalidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`ID_ESTACIONALIDAD`", nullable = false)
	private int idEstacionalidad;

	@ManyToOne
	@JoinColumn(name = "`ID_PRODUCTO`")
	private Producto producto;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "`APE_AS_MES_ESTAC`", joinColumns = {
			@JoinColumn(name = "`ID_ESTACIONALIDAD`") }, inverseJoinColumns = { @JoinColumn(name = "`ID_MES`") })
	private Set<Mes> meses = new HashSet<Mes>();

	public int getIdEstacionalidad() {
		return idEstacionalidad;
	}

	public void setIdEstacionalidad(int idEstacionalidad) {
		this.idEstacionalidad = idEstacionalidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}