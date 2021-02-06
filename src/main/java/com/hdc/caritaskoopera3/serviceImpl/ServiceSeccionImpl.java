package com.hdc.caritaskoopera3.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdc.caritaskoopera3.modelos.SeccionVO;
import com.hdc.caritaskoopera3.repository.SeccionRepository;
import com.hdc.caritaskoopera3.services.ServiceSeccion;

@Service
public class ServiceSeccionImpl implements SeccionRepository, ServiceSeccion {
	
	@Autowired
	SeccionRepository secrep;

	@Override
	public <S extends SeccionVO> S save(S entity) {
		return secrep.save(entity);
	}

	@Override
	public <S extends SeccionVO> Iterable<S> saveAll(Iterable<S> entities) {
		return secrep.saveAll(entities);
	}

	@Override
	public Optional<SeccionVO> findById(Integer id) {
		return secrep.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return secrep.existsById(id);
	}

	@Override
	public Iterable<SeccionVO> findAll() {
		return secrep.findAll();
	}

	@Override
	public Iterable<SeccionVO> findAllById(Iterable<Integer> ids) {
		return secrep.findAllById(ids);
	}

	@Override
	public long count() {
		return secrep.count();
	}

	@Override
	public void deleteById(Integer id) {
		secrep.deleteById(id);
	}

	@Override
	public void delete(SeccionVO entity) {
		secrep.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends SeccionVO> entities) {
		secrep.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		secrep.deleteAll();
	}
	
	
}
