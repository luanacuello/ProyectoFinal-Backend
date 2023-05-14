package com.example.BACKEND.Controller;

import com.example.BACKEND.Entity.Skills;
import com.example.BACKEND.Service.SkillsServiceIMPL.SkillsServiceIMPL;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("BACKEND/Skill")
public class SkillsController {
    @Autowired
    private SkillsServiceIMPL impl;
    
    @GetMapping
    @RequestMapping(value = "ListarSkills",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarSkills(){
        List<Skills> listaSkills=this.impl.consultarSkills();
        return ResponseEntity.ok(listaSkills);
    }
    
    @PutMapping
    @RequestMapping(value = "CrearSkills",method = RequestMethod.PUT)
    public ResponseEntity<?> CrearSkills(@RequestBody Skills skills){
        Skills SkillsCreado=this.impl.crearSkills(skills);
        return ResponseEntity.status(HttpStatus.OK).body(SkillsCreado);
    }
    
    @PostMapping
    @RequestMapping(value = "ModificarSkills",method = RequestMethod.POST)
    public ResponseEntity<?> ModificarSkills(@RequestBody Skills skills){
        Skills SkillsModificado=this.impl.modificarSkills(skills);
        return ResponseEntity.status(HttpStatus.OK).body(SkillsModificado);
    }
    
    @DeleteMapping
    @RequestMapping(value = "EliminarSkills/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarSkills(@PathVariable int id){
        this.impl.eliminarSkills(id);
        return ResponseEntity.ok().build();
    }
}
