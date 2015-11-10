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
@Table(name = "`APE_MA_DEPARTAMENTO`", schema = "`APEGA`")
public class Departamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`ID_DEPARTAMENTO`", nullable = false)
	private int idDepartamento;

	@Column(name = "`DESC_DEPARTAMENTO`", nullable = false)
	private String descripcionDepartamento;

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getDescripcionDepartamento() {
		return descripcionDepartamento;
	}

	public void setDescripcionDepartamento(String descripcionDepartamento) {
		this.descripcionDepartamento = descripcionDepartamento;
	}




}