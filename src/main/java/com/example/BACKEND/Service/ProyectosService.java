package com.example.BACKEND.Service;

import com.example.BACKEND.Entity.Proyectos;
import java.util.List;


public interface ProyectosService {
    public List<Proyectos> consultarProyectos();
    
    public Proyectos crearProyectos(Proyectos proyectos);
    
    public Proyectos modificarProyectos(Proyectos proyectos);
    
    public void eliminarProyectos(int id);
}
