package com.daw2.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.daw2.app.beans.Dueno;
import com.daw2.app.beans.Mascota;

@Controller
public class PersonaController {

	@RequestMapping(value = "/duenoMascota", method = RequestMethod.GET)
	public String duenoGet(){
		return "dueno/crear";
	}
	@RequestMapping(value = "/duenoMascota" ,method = RequestMethod.POST)
	public String duenoPost(ModelMap model,
			@RequestParam("nombreDueno") String nombreDueno,
			@RequestParam("apellidoDueno") String apellidoDueno,
			@RequestParam("telefonoDueno") String telefonoDueno,
			@RequestParam("emailDueno") String emailDueno,
			@RequestParam("nombreMascota") String nombreMascota,
			@RequestParam("tipoMascota") String tipoMascota,
			@RequestParam("generoMascota") String generoMascota){
		
		Dueno dueno=new Dueno(nombreDueno,apellidoDueno,telefonoDueno,emailDueno);
		Mascota mascota=new Mascota(nombreMascota,tipoMascota,generoMascota);
		dueno.setMascota(mascota);
		model.addAttribute("dueno",dueno);
		return "dueno/crearPost";
	}
}//class
