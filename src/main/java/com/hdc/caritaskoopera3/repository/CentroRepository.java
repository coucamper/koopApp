package com.hdc.caritaskoopera3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hdc.caritaskoopera3.modelos.CentroVO;

@Repository
public interface CentroRepository extends CrudRepository<CentroVO, Integer> {

}
