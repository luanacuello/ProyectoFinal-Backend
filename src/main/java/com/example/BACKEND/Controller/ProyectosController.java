package com.example.BACKEND.Controller;

import com.example.BACKEND.Entity.Proyectos;
import com.example.BACKEND.Service.ProyectoServiceIMPL.ProyectosServiceIMPL;
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
@RequestMapping("BACKEND/Proyectos")
public class ProyectosController {
    
    @Autowired
    private ProyectosServiceIMPL impl;
    
    @GetMapping
    @RequestMapping(value = "ListarProyectos",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarProyectos(){
        List<Proyectos> listaProyectos=this.impl.consultarProyectos();
        return ResponseEntity.ok(listaProyectos);
    }
    
    @PutMapping
    @RequestMapping(value = "CrearProyectos",method = RequestMethod.PUT)
    public ResponseEntity<?> CrearProyectos(@RequestBody Proyectos proyectos){
        Proyectos ProyectosCreado=this.impl.crearProyectos(proyectos);
        return ResponseEntity.status(HttpStatus.OK).body(ProyectosCreado);
    }
    
    
    @PostMapping
    @RequestMapping(value = "ModificarProyectos",method = RequestMethod.POST)
    public ResponseEntity<?> ModificarProyectos(@RequestBody Proyectos proyectos){
        Proyectos ProyectosModificado=this.impl.modificarProyectos(proyectos);
        return ResponseEntity.status(HttpStatus.OK).body(ProyectosModificado);
    }
    
    @DeleteMapping
    @RequestMapping(value = "EliminarProyectos/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarProyectos(@PathVariable int id){
        this.impl.eliminarProyectos(id);
        return ResponseEntity.ok().build();
    }
}
