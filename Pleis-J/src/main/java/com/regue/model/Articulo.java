package com.regue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Articulo {

	@Id
	@Column(name = "id")
	private Integer id;

	private String nombre;

	private Integer id_articulo_categoria;

	private Integer id_articulo_envase;

	private Integer id_articulo_format;
	
	private Boolean baja;
	
	public Articulo() {
		
	}

	public Articulo(Integer id, String nombre, Integer id_articulo_categoria, Integer id_articulo_envase,
			Integer id_articulo_format, Boolean baja) {
		
		this.id = id;
		this.nombre = nombre;
		this.id_articulo_categoria = id_articulo_categoria;
		this.id_articulo_envase = id_articulo_envase;
		this.id_articulo_format = id_articulo_format;
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

	public Integer getId_articulo_categoria() {
		return id_articulo_categoria;
	}

	public void setId_articulo_categoria(Integer id_articulo_categoria) {
		this.id_articulo_categoria = id_articulo_categoria;
	}

	public Integer getId_articulo_envase() {
		return id_articulo_envase;
	}

	public void setId_articulo_envase(Integer id_articulo_envase) {
		this.id_articulo_envase = id_articulo_envase;
	}

	public Integer getId_articulo_format() {
		return id_articulo_format;
	}

	public void setId_articulo_format(Integer id_articulo_format) {
		this.id_articulo_format = id_articulo_format;
	}

	public Boolean getBaja() {
		return baja;
	}

	public void setBaja(Boolean baja) {
		this.baja = baja;
	}
	
	

	
}
