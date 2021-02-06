package com.hdc.caritaskoopera3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hdc.caritaskoopera3.modelos.EmpleadoVO;
import com.hdc.caritaskoopera3.modelos.PersonaVO;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaVO, Integer>{
	
	@Query("select p from EmpleadoVO p where p.idempleado.personas.idpersona =:idpersona")
	List<EmpleadoVO> FindByIdproducto(int idpersona);


}