package it.gaetanoquarto.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.gaetanoquarto.app.config.Beans;
import it.gaetanoquarto.app.entities.Persona;
import it.gaetanoquarto.app.services.PersonaService;


@SpringBootApplication
public class Week7Day2BeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week7Day2BeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		popolaDb();
		
	}
	
	@Autowired
	private PersonaService ps;
	
	public void popolaDb() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		
		Persona p1 = (Persona)ctx.getBean("persona", "Gaetano", "Quarto", 25);
		Persona p2 = (Persona)ctx.getBean("persona", "Flavio", "Cirillo", 19);
		Persona p3 = (Persona)ctx.getBean("persona", "Luca", "Lattanzi", 35);
		Persona p4 = (Persona)ctx.getBean("persona", "Alessia", "Lacitignola", 24);
		Persona p5 = (Persona)ctx.getBean("persona", "Giovanni", "Prapapappo", 19);
		
		ps.save(p1);
		ps.save(p2);
		ps.save(p3);
		ps.save(p4);
		ps.save(p5);

	}

}
