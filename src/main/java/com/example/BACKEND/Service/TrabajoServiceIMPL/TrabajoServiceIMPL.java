package com.example.BACKEND.Service.TrabajoServiceIMPL;

import com.example.BACKEND.Entity.Trabajo;
import com.example.BACKEND.Repository.TrabajoRepo;
import com.example.BACKEND.Service.TrabajoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoServiceIMPL implements TrabajoService {

    @Autowired
    private TrabajoRepo trabajorepo;
    @Override
    public List<Trabajo> consultarTrabajo() {
        return (List<Trabajo>) this.trabajorepo.findAll();
    }

    @Override
    public Trabajo crearTrabajo(Trabajo trabajo) {
        return this.trabajorepo.save(trabajo);
    }

    @Override
    public Trabajo modificarTrabajo(Trabajo trabajo) {
        return this.trabajorepo.save(trabajo);
    }

    @Override
    public void eliminarTrabajo(int id) {
        this.trabajorepo.deleteById(id);
    }

    
    
}
