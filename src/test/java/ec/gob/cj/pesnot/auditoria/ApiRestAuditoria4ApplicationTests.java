package ec.gob.cj.pesnot.auditoria;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;

import ec.gob.cj.pesnot.auditoria.controlador.AuditoriaController;
import ec.gob.cj.pesnot.auditoria.modelo.Auditoria;
import ec.gob.cj.pesnot.auditoria.repositorio.AuditoriaRepository;




@SpringBootTest
class ApiRestAuditoria4ApplicationTests {

	//Main Test
	@Mock
	private SpringApplicationBuilder springApplicationBuilder;
		
	@Test
	public void main() {
		ApiRestAuditoria4Application.main(new String[] {});
	}
		
		
	@Test
	public void testIt() {
	
		ApiRestAuditoria4Application apiRestAuditoriaApplication = new ApiRestAuditoria4Application();
		when(springApplicationBuilder.sources(ApiRestAuditoria4Application.class)).thenReturn(springApplicationBuilder);
		
		SpringApplicationBuilder result = apiRestAuditoriaApplication.configure(springApplicationBuilder);
		verify(springApplicationBuilder).sources(ApiRestAuditoria4Application.class);
		assertEquals(springApplicationBuilder,result);
		  }
	
	
	//TEST AUDITORIA
	@Autowired
	private final AuditoriaRepository repo = Mockito.mock(AuditoriaRepository.class);
		
	@Autowired
	private AuditoriaController cont;
		
	@Autowired
	private AuditoriaRepository contN;
		
	@BeforeEach
	public void setUp() {
		tablaController = new AuditoriaController(repository);
	}

		    

	@Test
	@DisplayName("Debe pasar cuando se obtenga una lista de auditorias que no sea nulo")
	void listarAuditarias() {
		List<Auditoria> listaAuditaria = cont.allAuditorias();
		assertNotNull(listaAuditaria);
	}
		    
		    

	AuditoriaController prueba;

	@Mock
	private AuditoriaRepository repository;
			 	
	@Mock
	private AuditoriaController tablaController;
	
	@Test
	public void testAllTablas() {
		Date fecha = new Date(0);
		this.setUp();
		
		Auditoria tablaAuditoria = new Auditoria();
		Auditoria tablaAuditoria1 = new Auditoria(null, null, null, null, null, null, fecha, null);
		
		//Pruebas Auditorias 
		//GET
		tablaAuditoria1.getIdAuditoria();
		tablaAuditoria1.getNombreTablaAuditoria();
		tablaAuditoria1.getFechaAuditoria();
		tablaAuditoria1.getRolUsuarioAuditoria();
		tablaAuditoria1.getUsuarioAuditoria();
		tablaAuditoria1.getValoresActualesAuditoria();
		tablaAuditoria1.getValoresAnterioresAuditoria();
		tablaAuditoria1.getAccionAuditoria();
		
		//SET
		tablaAuditoria1.setIdAuditoria(null);;
		tablaAuditoria1.setNombreTablaAuditoria(null);
		tablaAuditoria1.setFechaAuditoria(null);
		tablaAuditoria1.setRolUsuarioAuditoria(null);
		tablaAuditoria1.setUsuarioAuditoria(null);
		tablaAuditoria1.setValoresActualesAuditoria(null);
		tablaAuditoria1.setValoresAnterioresAuditoria(null);
		tablaAuditoria1.setAccionAuditoria(null);
		
		
	}
					
		    
}
