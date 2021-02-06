package com.hdc.caritaskoopera3.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdc.caritaskoopera3.modelos.CentroVO;
import com.hdc.caritaskoopera3.repository.CentroRepository;
import com.hdc.caritaskoopera3.services.ServiceCentro;

@Service
public class ServiceCentroImpl implements CentroRepository, ServiceCentro {

	@Autowired	
	CentroRepository cr;

	@Override
	public <S extends CentroVO> S save(S entity) {
		return cr.save(entity);
	}

	@Override
	public <S extends CentroVO> Iterable<S> saveAll(Iterable<S> entities) {
		return cr.saveAll(entities);
	}

	@Override
	public Optional<CentroVO> findById(Integer id) {
		return cr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return cr.existsById(id);
	}

	@Override
	public Iterable<CentroVO> findAll() {
		return cr.findAll();
	}

	@Override
	public Iterable<CentroVO> findAllById(Iterable<Integer> ids) {
		return cr.findAllById(ids);
	}

	@Override
	public long count() {
		return cr.count();
	}

	@Override
	public void deleteById(Integer id) {
		cr.deleteById(id);
	}

	@Override
	public void delete(CentroVO entity) {
		cr.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends CentroVO> entities) {
		cr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		cr.deleteAll();
	}
	
	

}
