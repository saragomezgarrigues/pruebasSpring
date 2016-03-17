package com.daw2.app.beans;

import org.springframework.stereotype.Component;

@Component
public class Mascota {
	private String nombreMascota,tipoMascota,generoMascota;
	
	public Mascota() {
		// TODO Auto-generated constructor stub
	}

	public Mascota(String nombreMascota, String tipoMascota, String generoMascota) {
		this.nombreMascota = nombreMascota;
		this.tipoMascota = tipoMascota;
		this.generoMascota = generoMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public String getGeneroMascota() {
		return generoMascota;
	}

	public void setGeneroMascota(String generoMascota) {
		this.generoMascota = generoMascota;
	}
	
	
}
