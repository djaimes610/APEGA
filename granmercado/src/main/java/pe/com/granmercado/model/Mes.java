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
@Table(name = "`APE_MA_MES`", schema = "`APEGA`")
public class Mes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`ID_MES`", nullable = false)
	private int idMes;

	@Column(name = "`DESCRIPCION_MES`", nullable = false)
	private String descripcionMes;

	public int getIdMes() {
		return idMes;
	}

	public void setIdMes(int idMes) {
		this.idMes = idMes;
	}

	public String getDescripcionMes() {
		return descripcionMes;
	}

	public void setDescripcionMes(String descripcionMes) {
		this.descripcionMes = descripcionMes;
	}

}