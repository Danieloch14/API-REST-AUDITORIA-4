package ec.gob.cj.pesnot.auditoria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.gob.cj.pesnot.auditoria.modelo.Auditoria;


public interface AuditoriaRepository extends JpaRepository<Auditoria, Long>{

}
