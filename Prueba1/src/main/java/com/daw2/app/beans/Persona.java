package com.daw2.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persona {
	private String nombrePersona,apellidosPersona;
	@Autowired
	private Pais pais;
	
	public Persona() {
		
	}
	public Persona(String nombrePersona, String apellidosPersona) {
		
		this.nombrePersona = nombrePersona;
		this.apellidosPersona = apellidosPersona;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getApellidosPersona() {
		return apellidosPersona;
	}
	public void setApellidosPersona(String apellidosPersona) {
		this.apellidosPersona = apellidosPersona;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}//class
