package com.hdc.caritaskoopera3.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdc.caritaskoopera3.modelos.EmpleadoVO;
import com.hdc.caritaskoopera3.modelos.PersonaVO;
import com.hdc.caritaskoopera3.repository.PersonaRepository;
import com.hdc.caritaskoopera3.services.ServicePersona;

@Service
public class ServicePersonaImpl implements PersonaRepository, ServicePersona {

	@Autowired
	PersonaRepository pr;

	@Override
	public <S extends PersonaVO> S save(S entity) {
		return pr.save(entity);
	}

	@Override
	public <S extends PersonaVO> Iterable<S> saveAll(Iterable<S> entities) {
		return pr.saveAll(entities);
	}

	@Override
	public Optional<PersonaVO> findById(Integer id) {
		return pr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return pr.existsById(id);
	}

	@Override
	public Iterable<PersonaVO> findAll() {
		return pr.findAll();
	}

	@Override
	public Iterable<PersonaVO> findAllById(Iterable<Integer> ids) {
		return pr.findAllById(ids);
	}

	@Override
	public long count() {
		return pr.count();
	}

	@Override
	public void deleteById(Integer id) {
		pr.deleteById(id);
	}

	@Override
	public void delete(PersonaVO entity) {
		pr.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends PersonaVO> entities) {
		pr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		pr.deleteAll();
	}

	public List<EmpleadoVO> FindByIdproducto(int idpersona) {
		return pr.FindByIdproducto(idpersona);
	}
	
	
	

}
