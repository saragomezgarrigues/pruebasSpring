package com.daw2.app.beans;

import org.springframework.stereotype.Component;

//Anotacion para hacer que sea una pojo
@Component
public class Pais {

	private String nombre,continente;
	
	public Pais() {
		
	}

	public Pais(String nombre, String continente) {
		this.nombre = nombre;
		this.continente = continente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}
	
	
}
