package com.hdc.caritaskoopera3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hdc.caritaskoopera3.modelos.SeccionVO;

@Repository
public interface SeccionRepository extends CrudRepository<SeccionVO, Integer> {

}
