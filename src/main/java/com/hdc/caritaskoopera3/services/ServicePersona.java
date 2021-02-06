package com.hdc.caritaskoopera3.services;

import java.util.Optional;

import com.hdc.caritaskoopera3.modelos.PersonaVO;

public interface ServicePersona {

	<S extends PersonaVO> S save(S entity);

	<S extends PersonaVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<PersonaVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<PersonaVO> findAll();

	Iterable<PersonaVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(PersonaVO entity);

	void deleteAll(Iterable<? extends PersonaVO> entities);

	void deleteAll();

}