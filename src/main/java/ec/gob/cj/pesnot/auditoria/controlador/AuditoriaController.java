package ec.gob.cj.pesnot.auditoria.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.cj.pesnot.auditoria.modelo.Auditoria;
import ec.gob.cj.pesnot.auditoria.repositorio.AuditoriaRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/v1/auditorias")
public class AuditoriaController {
	
	@Autowired
	private AuditoriaRepository auditoriaRepository;
	
	public AuditoriaController(AuditoriaRepository aR) {
		this.auditoriaRepository = aR;
	}
	
	//Obtiene una lista de todos los registros de Auditoria
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Auditoria> allAuditorias(){
		return auditoriaRepository.findAll();
	}
}
