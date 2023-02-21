package it.gaetanoquarto.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.gaetanoquarto.app.entities.Persona;

@Configuration
public class Beans {
	
	@Bean
	@Scope("prototype")
	public Persona persona(String nome, String cognome, int eta) {
		return Persona.builder()
				.nome(nome)
				.cognome(cognome)
				.eta(eta)
				.build();
	}

}
