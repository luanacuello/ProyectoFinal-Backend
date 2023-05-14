package com.example.BACKEND.Service;

import com.example.BACKEND.Entity.Skills;
import java.util.List;


public interface SkillsService {
    
    public List<Skills> consultarSkills();
    
    public Skills crearSkills(Skills skills);
    
    public Skills modificarSkills(Skills skills);
    
    public void eliminarSkills(int id);
}
