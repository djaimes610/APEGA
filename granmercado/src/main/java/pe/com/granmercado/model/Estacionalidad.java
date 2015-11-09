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

	@Column(name = "`ID_PRODUCTO`", nullable = false)
	private String idProducto;

	public int getIdEstacionalidad() {
		return idEstacionalidad;
	}

	public void setIdEstacionalidad(int idEstacionalidad) {
		this.idEstacionalidad = idEstacionalidad;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

}