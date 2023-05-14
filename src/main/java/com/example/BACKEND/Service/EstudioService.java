package com.example.BACKEND.Service;

import com.example.BACKEND.Entity.Estudio;
import java.util.List;


public interface EstudioService {
   
    public List<Estudio> consultarEstudio();
    
    public Estudio crearEstudio(Estudio estudio);
    
    public Estudio modificarEstudio(Estudio estudio);
    
    public void eliminarEstudio(int id);
}
