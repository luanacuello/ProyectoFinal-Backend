package com.example.BACKEND.Repository;

import com.example.BACKEND.Entity.Persona;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface PersonaRepo extends CrudRepository<Persona, Integer> {
    
    Optional<Persona> findByUser(String user);
}
