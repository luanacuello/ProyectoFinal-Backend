package com.example.BACKEND.Service.EstudioServiceIMPL;

import com.example.BACKEND.Entity.Estudio;
import com.example.BACKEND.Repository.EstudioRepo;
import com.example.BACKEND.Service.EstudioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioServiceIMPL implements EstudioService{
    
    @Autowired
    private EstudioRepo estudiorepo;
    @Override
    public List<Estudio> consultarEstudio() {
        return (List<Estudio>) this.estudiorepo.findAll();
    }

    @Override
    public Estudio crearEstudio(Estudio estudio) {
        return this.estudiorepo.save(estudio);
    }

    @Override
    public Estudio modificarEstudio(Estudio estudio) {
        return this.estudiorepo.save(estudio);
    }

    @Override
    public void eliminarEstudio(int id) {
        this.estudiorepo.deleteById(id);
    }


    
}
