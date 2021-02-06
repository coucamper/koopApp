package com.hdc.caritaskoopera3.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="productos")
public class ProductoVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;
	
	private String codebar;
	
	private double preciofull;
	
	private String descripcion;
	

	

}
