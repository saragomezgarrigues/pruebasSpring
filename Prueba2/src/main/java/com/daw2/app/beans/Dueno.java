package com.daw2.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dueno {
	private String nombreDueno,apellidosDueno,telefonoDueno,emailDueno;
	@Autowired
	private Mascota mascota;
	
	public Dueno() {
		// TODO Auto-generated constructor stub
	}

	public Dueno(String nombreDueno, String apellidosDueno, String telefonoDueno,String emailDueno) {
		this.nombreDueno = nombreDueno;
		this.apellidosDueno = apellidosDueno;
		this.telefonoDueno = telefonoDueno;
		this.emailDueno=emailDueno;
	}

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

	public String getApellidosDueno() {
		return apellidosDueno;
	}

	public void setApellidosDueno(String apellidosDueno) {
		this.apellidosDueno = apellidosDueno;
	}

	public String getTelefonoDueno() {
		return telefonoDueno;
	}

	public void setTelefonoDueno(String telefonoDueno) {
		this.telefonoDueno = telefonoDueno;
	}
	
	public String getEmailDueno() {
		return emailDueno;
	}

	public void setEmailDueno(String emailDueno) {
		this.emailDueno = emailDueno;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
}
