package com.hdc.caritaskoopera3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hdc.caritaskoopera3.modelos.ProductoVO;
import com.hdc.caritaskoopera3.modelos.VentaVO;

@Repository
public interface VentaRepository extends CrudRepository <VentaVO, Integer>{

	@Query("select pv from VentaVO pv where pv.productos.idproducto=:idproducto")
	List<ProductoVO> findByIdProducto(int idproducto);
}
