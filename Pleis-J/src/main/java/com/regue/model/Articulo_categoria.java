package com.regue.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class Articulo_categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@NotBlank
	private String nombre;
	
	private Boolean baja;
	
	public Articulo_categoria() {
		
	}

	public Articulo_categoria(Integer id, @NotBlank String nombre, Boolean baja) {
		this.id = id;
		this.nombre = nombre;
		this.baja = baja;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getBaja() {
		return baja;
	}

	public void setBaja(Boolean baja) {
		this.baja = baja;
	}
	
}
