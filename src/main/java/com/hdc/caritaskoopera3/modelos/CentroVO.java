package com.hdc.caritaskoopera3.modelos;

import java.time.LocalDate;

import javax.persistence.Column;
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
@Table(name="centros")
public class CentroVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcentro;
	@Column(unique = true)
	private String denom;
	private String direccen;
	@Column(unique = true)
	private String tel;
	private String emailcentro;
	private double metros;
	private LocalDate fechaapertura;
	
	@ManyToOne
	@JoinColumn(name="idempleado")
	EmpleadoVO empleados;
	

	

}
