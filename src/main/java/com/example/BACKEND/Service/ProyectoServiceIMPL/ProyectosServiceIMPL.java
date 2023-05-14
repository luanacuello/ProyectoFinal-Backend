package com.example.BACKEND.Service.ProyectoServiceIMPL;

import com.example.BACKEND.Entity.Proyectos;
import com.example.BACKEND.Repository.ProyectosRepo;
import com.example.BACKEND.Service.ProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosServiceIMPL implements ProyectosService {

    @Autowired
    private ProyectosRepo proyectosrepo;
    @Override
    public List<Proyectos> consultarProyectos() {
        return (List<Proyectos>) this.proyectosrepo.findAll();
    }

    @Override
    public Proyectos crearProyectos(Proyectos estudio) {
        return this.proyectosrepo.save(estudio);
    }

    @Override
    public Proyectos modificarProyectos(Proyectos estudio) {
        return this.proyectosrepo.save(estudio);
    }

    @Override
    public void eliminarProyectos(int id) {
        this.proyectosrepo.deleteById(id);
    }

    
    
}
