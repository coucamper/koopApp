package com.hdc.caritaskoopera3.services;

import java.util.List;
import java.util.Optional;

import com.hdc.caritaskoopera3.modelos.ProductoVO;
import com.hdc.caritaskoopera3.modelos.VentaVO;

public interface ServiceVenta {

	<S extends VentaVO> S save(S entity);

	<S extends VentaVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<VentaVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<VentaVO> findAll();

	Iterable<VentaVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(VentaVO entity);

	void deleteAll(Iterable<? extends VentaVO> entities);

	void deleteAll();

	List<ProductoVO> findByIdProducto(int idproducto);
}