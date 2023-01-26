package ec.gob.cj.pesnot.auditoria.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "AuditoriaAdministracionPesnot")
@EntityListeners(AuditingEntityListener.class)
public class Auditoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAuditoria")
	private Long idAuditoria;
	
	@Column(name = "nombreTablaAuditoria")
	private String nombreTablaAuditoria;
	
	@Column(name = "valoresAnterioresAuditoria")
	private String valoresAnterioresAuditoria;
	
	@Column(name = "valoresActualesAuditoria")
	private String valoresActualesAuditoria;
	
	@Column(name = "usuarioAuditoria")
	private String usuarioAuditoria;
	
	@Column(name = "rolUsuarioAuditoria")
	private String rolUsuarioAuditoria;
	
	@Column(name = "fechaAuditoria")
	private Date fechaAuditoria;
	
	@Column(name = "accionAuditoria")
	private String accionAuditoria;
	
	
	public Auditoria(Long idAuditoria, String nombreTablaAuditoria, String valoresAnterioresAuditoria,
			String valoresActualesAuditoria, String usuarioAuditoria, String rolUsuarioAuditoria, Date fechaAuditoria,
			String accionAuditoria) {
		super();
		this.idAuditoria = idAuditoria;
		this.nombreTablaAuditoria = nombreTablaAuditoria;
		this.valoresAnterioresAuditoria = valoresAnterioresAuditoria;
		this.valoresActualesAuditoria = valoresActualesAuditoria;
		this.usuarioAuditoria = usuarioAuditoria;
		this.rolUsuarioAuditoria = rolUsuarioAuditoria;
		this.fechaAuditoria = fechaAuditoria;
		this.accionAuditoria = accionAuditoria;
	}
	
	
	public Auditoria() {
		super();
	}


	public Long getIdAuditoria() {
		return idAuditoria;
	}

	public void setIdAuditoria(Long idAuditoria) {
		this.idAuditoria = idAuditoria;
	}

	public String getNombreTablaAuditoria() {
		return nombreTablaAuditoria;
	}

	public void setNombreTablaAuditoria(String nombreTablaAuditoria) {
		this.nombreTablaAuditoria = nombreTablaAuditoria;
	}

	public String getValoresAnterioresAuditoria() {
		return valoresAnterioresAuditoria;
	}

	public void setValoresAnterioresAuditoria(String valoresAnterioresAuditoria) {
		this.valoresAnterioresAuditoria = valoresAnterioresAuditoria;
	}

	public String getValoresActualesAuditoria() {
		return valoresActualesAuditoria;
	}

	public void setValoresActualesAuditoria(String valoresActualesAuditoria) {
		this.valoresActualesAuditoria = valoresActualesAuditoria;
	}

	public String getUsuarioAuditoria() {
		return usuarioAuditoria;
	}

	public void setUsuarioAuditoria(String usuarioAuditoria) {
		this.usuarioAuditoria = usuarioAuditoria;
	}

	public String getRolUsuarioAuditoria() {
		return rolUsuarioAuditoria;
	}

	public void setRolUsuarioAuditoria(String rolUsuarioAuditoria) {
		this.rolUsuarioAuditoria = rolUsuarioAuditoria;
	}

	public Date getFechaAuditoria() {
		return fechaAuditoria;
	}

	public void setFechaAuditoria(Date fechaAuditoria) {
		this.fechaAuditoria = fechaAuditoria;
	}

	public String getAccionAuditoria() {
		return accionAuditoria;
	}

	public void setAccionAuditoria(String accionAuditoria) {
		this.accionAuditoria = accionAuditoria;
	}
	
	
}
