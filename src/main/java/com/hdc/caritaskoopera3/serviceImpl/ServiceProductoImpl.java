package com.hdc.caritaskoopera3.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdc.caritaskoopera3.modelos.ProductoVO;
import com.hdc.caritaskoopera3.modelos.VentaVO;
import com.hdc.caritaskoopera3.repository.ProductoRepository;
import com.hdc.caritaskoopera3.services.ServiceProducto;

@Service
public class ServiceProductoImpl implements ProductoRepository, ServiceProducto {

	@Autowired
	ProductoRepository prodr;

	@Override
	public <S extends ProductoVO> S save(S entity) {
		return prodr.save(entity);
	}

	@Override
	public <S extends ProductoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return prodr.saveAll(entities);
	}

	@Override
	public Optional<ProductoVO> findById(Integer id) {
		return prodr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return prodr.existsById(id);
	}

	@Override
	public Iterable<ProductoVO> findAll() {
		return prodr.findAll();
	}

	@Override
	public Iterable<ProductoVO> findAllById(Iterable<Integer> ids) {
		return prodr.findAllById(ids);
	}

	@Override
	public long count() {
		return prodr.count();
	}

	@Override
	public void deleteById(Integer id) {
		prodr.deleteById(id);
	}

	@Override
	public void delete(ProductoVO entity) {
		prodr.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends ProductoVO> entities) {
		prodr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		prodr.deleteAll();
	}

	public List<VentaVO> FindByIdproducto(int idproducto) {
		return prodr.FindByIdproducto(idproducto);
	}
	
	
}
