package it.gaetanoquarto.app.controllers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.gaetanoquarto.app.config.Beans;
import it.gaetanoquarto.app.entities.Persona;
import it.gaetanoquarto.app.services.PersonaService;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	private PersonaService ps;
	
	@GetMapping("data1")
	@ResponseBody
	public String data1() {
		return "questa è la pagina data1";
	}
	
	@GetMapping("data2")
	@ResponseBody
	public ResponseEntity<List<Persona>> data2() {
		List<Persona> persone = ps.getAll();
		
		return new ResponseEntity<>(persone, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "data3", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Persona> data3() {
		List<Persona> persone = ps.getAll();
		
		return persone;
	}

}
