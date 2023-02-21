package it.gaetanoquarto.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.gaetanoquarto.app.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
