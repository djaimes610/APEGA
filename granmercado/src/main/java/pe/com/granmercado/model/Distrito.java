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
@Table(name = "`APE_MA_MES`", schema = "`APEGA`")
public class Distrito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`COD_DISTRITO`", nullable = false)
	private int codigoDistrito;

	@Column(name = "`DESC_DISTRITO`", nullable = false)
	private String descripcionDistrito;

	@ManyToOne
	@JoinColumn(name = "`COD_PROVINCIA`")
	private Provincia codigoProvincia;

	public int getCodigoDistrito() {
		return codigoDistrito;
	}

	public void setCodigoDistrito(int codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	public String getDescripcionDistrito() {
		return descripcionDistrito;
	}

	public void setDescripcionDistrito(String descripcionDistrito) {
		this.descripcionDistrito = descripcionDistrito;
	}

	public Provincia getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(Provincia codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

}