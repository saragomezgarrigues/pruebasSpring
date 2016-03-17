package com.daw2.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.daw2.app.beans.Mascota;

@Controller
public class MascotaController {

	@RequestMapping(value = "/mascota", method = RequestMethod.GET)
	public String mascotaGet(){
		return "mascota/crear";
	}
	
	@RequestMapping(value = "/mascota", method = RequestMethod.POST)
	public String mascotaPost(ModelMap model,
			@RequestParam("nombreMascota") String nombreMascota,
			@RequestParam("tipoMascota") String tipoMascota,
			@RequestParam("generoMascota") String generoMascota
			){
			Mascota mascota=new Mascota(nombreMascota,tipoMascota,generoMascota);
			model.addAttribute("mascota",mascota);
		return "mascota/crearPost";
	}
}
