package com.hdc.caritaskoopera3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hdc.caritaskoopera3.modelos.ProductoVO;
import com.hdc.caritaskoopera3.modelos.VentaVO;

@Repository
public interface ProductoRepository extends CrudRepository <ProductoVO, Integer> {

	@Query("select v from VentaVO v where v.idventa.productos.idproducto =:idproducto")
	List<VentaVO> FindByIdproducto(int idproducto);

}
