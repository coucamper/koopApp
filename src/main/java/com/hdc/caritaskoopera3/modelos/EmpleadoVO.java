package com.hdc.caritaskoopera3.modelos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="empleados")
public class EmpleadoVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idempleado;
	

	private String categoria;

	private String centro;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate fechaantiguedad;
	
	private int numhijos;
	
	private boolean discapacidad;
	
	@OneToOne
	@JoinColumn(name="idpersona")
	PersonaVO personas;
	

}
