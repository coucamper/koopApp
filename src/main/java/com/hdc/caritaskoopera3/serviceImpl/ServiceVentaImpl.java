package com.hdc.caritaskoopera3.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdc.caritaskoopera3.modelos.ProductoVO;
import com.hdc.caritaskoopera3.modelos.VentaVO;
import com.hdc.caritaskoopera3.repository.VentaRepository;
import com.hdc.caritaskoopera3.services.ServiceVenta;

@Service
public class ServiceVentaImpl implements VentaRepository, ServiceVenta {

	@Autowired
	VentaRepository vr;

	@Override
	public <S extends VentaVO> S save(S entity) {
		return vr.save(entity);
	}

	@Override
	public <S extends VentaVO> Iterable<S> saveAll(Iterable<S> entities) {
		return vr.saveAll(entities);
	}

	@Override
	public Optional<VentaVO> findById(Integer id) {
		return vr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return vr.existsById(id);
	}

	@Override
	public Iterable<VentaVO> findAll() {
		return vr.findAll();
	}

	@Override
	public Iterable<VentaVO> findAllById(Iterable<Integer> ids) {
		return vr.findAllById(ids);
	}

	@Override
	public long count() {
		return vr.count();
	}

	@Override
	public void deleteById(Integer id) {
		vr.deleteById(id);
	}

	@Override
	public void delete(VentaVO entity) {
		vr.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends VentaVO> entities) {
		vr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		vr.deleteAll();
	}

	public List<ProductoVO> findByIdProducto(int idproducto) {
		return vr.findByIdProducto(idproducto);
	}
	

	
}
