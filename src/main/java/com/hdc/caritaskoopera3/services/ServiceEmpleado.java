package com.hdc.caritaskoopera3.services;

import java.util.Optional;

import com.hdc.caritaskoopera3.modelos.EmpleadoVO;

public interface ServiceEmpleado {

	<S extends EmpleadoVO> S save(S entity);

	<S extends EmpleadoVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<EmpleadoVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<EmpleadoVO> findAll();

	Iterable<EmpleadoVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(EmpleadoVO entity);

	void deleteAll(Iterable<? extends EmpleadoVO> entities);

	void deleteAll();

}