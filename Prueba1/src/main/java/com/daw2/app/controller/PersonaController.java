package com.daw2.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.daw2.app.beans.Pais;
import com.daw2.app.beans.Persona;

@Controller
public class PersonaController {
	@RequestMapping(value = "/persona", method = RequestMethod.GET)
	public String personaGet(){
		return "persona/crearGet";
	}
	@RequestMapping(value = "/persona", method = RequestMethod.POST)
	public String personaPost(ModelMap model,
			@RequestParam("nombrePersona") String nombrePersona,
			@RequestParam("apellidosPersona") String apellidosPersona,
			@RequestParam("paisPersona") String paisPersona,
			@RequestParam("continente") String continente){
		
			Persona persona=new Persona(nombrePersona,apellidosPersona);
			Pais pais=new Pais(paisPersona,continente);
			persona.setPais(pais);
			model.addAttribute("persona",persona);
		return "persona/crearPost";
	}
}//class
