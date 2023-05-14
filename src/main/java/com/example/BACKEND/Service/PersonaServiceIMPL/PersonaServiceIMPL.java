package com.example.BACKEND.Service.PersonaServiceIMPL;

import com.example.BACKEND.Entity.Persona;
import com.example.BACKEND.Repository.PersonaRepo;
import com.example.BACKEND.Service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceIMPL implements PersonaService {

    @Autowired
    private PersonaRepo repo;
    
    @Override
    public List<Persona> consultarPersona() {
        return (List<Persona>) this.repo.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return this.repo.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return this.repo.save(persona);
    }

    @Override
    public Persona buscarPersona(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarPersona(int id) {
        this.repo.deleteById(id);
    }
    
}
