package com.example.BACKEND.Service;

import com.example.BACKEND.Entity.Trabajo;
import java.util.List;


public interface TrabajoService {
    public List<Trabajo> consultarTrabajo();
    
    public Trabajo crearTrabajo(Trabajo trabajo);
    
    public Trabajo modificarTrabajo(Trabajo trabajo);
    
    public void eliminarTrabajo(int id);
}
