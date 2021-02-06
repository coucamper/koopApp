package com.hdc.caritaskoopera3.services;

import java.util.Optional;

import com.hdc.caritaskoopera3.modelos.SeccionVO;

public interface ServiceSeccion {

	<S extends SeccionVO> S save(S entity);

	<S extends SeccionVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<SeccionVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<SeccionVO> findAll();

	Iterable<SeccionVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(SeccionVO entity);

	void deleteAll(Iterable<? extends SeccionVO> entities);

	void deleteAll();

}