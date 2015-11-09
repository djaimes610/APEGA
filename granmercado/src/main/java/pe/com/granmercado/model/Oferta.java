package pe.com.granmercado.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="`APE_TR_OFERTA`",schema="`APEGA`")
public class Oferta implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID_OFERTA`", nullable = false)
    private int idOferta;
 
    @Column(name = "`VOLUMEN_OFERTA`", nullable = false)
    private Double volumenOferta;
 
    @Column(name = "`MEDIDA_CANTIDAD`", nullable = false)
    private String medidaCantidad;
    
    @Column(name = "`PRESENTACION_PRODUCTO`", nullable = false)
    private String presentacionProducto;
    
    @Column(name = "`MONTO_CANTIDAD`", nullable = false)
    private String montoCantidad;
    
    @Column(name = "`MONTO_MONEDA`", nullable = false)
    private int montoMoneda;
    
    @Column(name = "`ESTADO_OFERTA`", nullable = false)
    private String estadoOFerta;
    
    @Column(name = "`COD_VARIEDAD`", nullable = false)
    private String codigoVariedad;
    
    
    @Column(name = "`COD_PRODUCTO`", nullable = false)
    private int codigoProducto;
    
    @Column(name = "`IMAGEN_OFERTA`", nullable = false)
    private String imagenOferta;
    
    @Column(name = "`COD_UBIGEO`", nullable = false)
    private String codigoUbigeo;

    @Column(name = "`FECHA_CREACION`", nullable = false)
    private String fechaCreacion;
    
    @Column(name = "`USUARIO_CREACION`", nullable = false)
    private String usuarioCreacion;
    
    @Column(name = "`FECHA_MODIFICACION`", nullable = false)
    private String fechaModificacion;
    
    @Column(name = "`USUARIO_MODIFICACION`", nullable = false)
    private String usuarioModificacion;

    @Column(name = "`ID_SOLICITUD`", nullable = false)
    private String idSolicitud;

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

	public String getMontoCantidad() {
		return montoCantidad;
	}

	public void setMontoCantidad(String montoCantidad) {
		this.montoCantidad = montoCantidad;
	}

	public int getMontoMoneda() {
		return montoMoneda;
	}

	public void setMontoMoneda(int montoMoneda) {
		this.montoMoneda = montoMoneda;
	}

	public String getEstadoOFerta() {
		return estadoOFerta;
	}

	public void setEstadoOFerta(String estadoOFerta) {
		this.estadoOFerta = estadoOFerta;
	}

	public String getCodigoVariedad() {
		return codigoVariedad;
	}

	public void setCodigoVariedad(String codigoVariedad) {
		this.codigoVariedad = codigoVariedad;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getImagenOferta() {
		return imagenOferta;
	}

	public void setImagenOferta(String imagenOferta) {
		this.imagenOferta = imagenOferta;
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

	public String getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(String idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

  
  
 
}