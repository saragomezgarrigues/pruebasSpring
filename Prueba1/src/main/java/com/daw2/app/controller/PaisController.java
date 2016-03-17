package com.daw2.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.daw2.app.beans.Pais;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PaisController {
	private static final Logger logger = LoggerFactory.getLogger(PaisController.class);
	@RequestMapping(value = "/pais", method = RequestMethod.GET)
	public String paisGet(){
		return "pais/crearGet";
	}//paisGet

	@RequestMapping(value = "/pais", method = RequestMethod.POST)
	public String paisPost(Model modelo,
			@RequestParam("nombrePais")String nombre,
			@RequestParam("continente")String contiente){
		logger.info("Pais controller: Está pasando por el lado POST de crearPais");
		Pais pais=new Pais(nombre,contiente);
		modelo.addAttribute("pais",pais);
		return "pais/crearPost";
	}//paisPost
}//class
