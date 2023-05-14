
package com.example.BACKEND.Service;

import com.example.BACKEND.Entity.Persona;
import java.util.List;



public interface PersonaService {
    
    public List<Persona> consultarPersona();
    
    public Persona crearPersona(Persona persona);
    
    public Persona modificarPersona(Persona persona);
    
    public Persona buscarPersona(int id);
    
    public void eliminarPersona(int id); 
    
    
}