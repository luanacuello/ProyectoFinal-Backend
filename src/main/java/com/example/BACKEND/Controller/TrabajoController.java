package com.example.BACKEND.Controller;

import com.example.BACKEND.Entity.Trabajo;
import com.example.BACKEND.Service.TrabajoServiceIMPL.TrabajoServiceIMPL;
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
@RequestMapping("BACKEND/trabajo")
public class TrabajoController {
    
    @Autowired
    private TrabajoServiceIMPL impl;
    
    @GetMapping
    @RequestMapping(value = "ListarTrabajo",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarTrabajo(){
        List<Trabajo> listaTrabajo=this.impl.consultarTrabajo();
        return ResponseEntity.ok(listaTrabajo);
    }
    
    @PostMapping
    @RequestMapping(value = "CrearTrabajo", method = RequestMethod.POST)
    public ResponseEntity<?> CrearTrabajo(@RequestBody Trabajo trabajo){
        Trabajo TrabajoCreado=this.impl.crearTrabajo(trabajo);
        return ResponseEntity.status(HttpStatus.OK).body(TrabajoCreado);
    }
    
    @PutMapping
    @RequestMapping(value = "ModificarTrabajo", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarTrabajo(@RequestBody Trabajo trabajo){
        Trabajo TrabajoModificado = this.impl.modificarTrabajo(trabajo);
        return ResponseEntity.status(HttpStatus.OK).body(TrabajoModificado);
    }
    
    @DeleteMapping
    @RequestMapping(value = "EliminarTrabajo/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarTrabajo(@PathVariable int id){
        this.impl.eliminarTrabajo(id);
        return ResponseEntity.ok().build();
    }
}
