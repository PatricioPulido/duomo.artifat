package cl.proyecto.duomo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.proyecto.duomo.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
