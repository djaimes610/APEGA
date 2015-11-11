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
	@Column(name = "`id_estacionalidad`", nullable = false)
	private int idEstacionalidad;

	@Column(name = "`mes_estacionalidad`", nullable = false)
	private int mesEstacionalidad;

	public int getIdEstacionalidad() {
		return idEstacionalidad;
	}

	public void setIdEstacionalidad(int idEstacionalidad) {
		this.idEstacionalidad = idEstacionalidad;
	}

	public int getMesEstacionalidad() {
		return mesEstacionalidad;
	}

	public void setMesEstacionalidad(int mesEstacionalidad) {
		this.mesEstacionalidad = mesEstacionalidad;
	}

}