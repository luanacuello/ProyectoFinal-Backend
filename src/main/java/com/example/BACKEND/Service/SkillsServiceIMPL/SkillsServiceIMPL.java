package com.example.BACKEND.Service.SkillsServiceIMPL;

import com.example.BACKEND.Entity.Skills;
import com.example.BACKEND.Repository.SkillRepo;
import com.example.BACKEND.Service.SkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsServiceIMPL implements SkillsService {

    @Autowired
    private SkillRepo skillrepo;
    @Override
    public List<Skills> consultarSkills() {
        return (List<Skills>) this.skillrepo.findAll();
    }

    @Override
    public Skills crearSkills(Skills skills) {
        return this.skillrepo.save(skills);
    }

    @Override
    public Skills modificarSkills(Skills skills) {
        return this.skillrepo.save(skills);
    }

    @Override
    public void eliminarSkills(int id) {
        this.skillrepo.deleteById(id);
    }
}
