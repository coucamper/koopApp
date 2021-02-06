package com.hdc.caritaskoopera3.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="personas")
public class PersonaVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpersona;
	
	@Column(unique=true)
	private String nombrecompleto;
	@Column(unique=true)
	private String nif;
	@Column(unique=true)
	private String tel;
	@Column(unique=true)	
	private String email;
	private String direccion;
}

