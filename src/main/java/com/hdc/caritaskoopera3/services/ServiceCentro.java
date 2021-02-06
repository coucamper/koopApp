package com.hdc.caritaskoopera3.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hdc.caritaskoopera3.modelos.CentroVO;

@Service
public interface ServiceCentro {

	<S extends CentroVO> S save(S entity);

	<S extends CentroVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<CentroVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<CentroVO> findAll();

	Iterable<CentroVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(CentroVO entity);

	void deleteAll(Iterable<? extends CentroVO> entities);

	void deleteAll();

}