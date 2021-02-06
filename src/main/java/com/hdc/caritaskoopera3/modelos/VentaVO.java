package com.hdc.caritaskoopera3.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ventas")
public class VentaVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idventa;
	

	private int cantidad;


	@ManyToOne
	@JoinColumn(name="idproducto")
	ProductoVO productos;

}
