package com.example.BACKEND.Controller;

import com.example.BACKEND.Entity.Estudio;
import com.example.BACKEND.Service.EstudioServiceIMPL.EstudioServiceIMPL;
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
@RequestMapping("BACKEND/Estudio")
public class EstudioController {
    @Autowired
    private EstudioServiceIMPL impl;
    
    @GetMapping
    @RequestMapping(value = "ListarEstudio", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarEstudio(){
        List<Estudio> listaEstudio=this.impl.consultarEstudio();
        return ResponseEntity.ok(listaEstudio);
    }
    
    @PutMapping
    @RequestMapping(value = "CrearEstudio", method = RequestMethod.PUT)
    public ResponseEntity<?> CrearEstudio(@RequestBody Estudio estudio){
        Estudio EstudioCreado=this.impl.crearEstudio(estudio);
        return ResponseEntity.status(HttpStatus.OK).body(EstudioCreado);
    }
    
    @PostMapping
    @RequestMapping(value = "ModificarEstudio", method = RequestMethod.POST)
    public ResponseEntity<?> ModificarEstudio(@RequestBody Estudio estudio){
        Estudio EstudioModificado=this.impl.modificarEstudio(estudio);
        return ResponseEntity.status(HttpStatus.OK).body(EstudioModificado);
    }
    
    @DeleteMapping
    @RequestMapping(value = "EliminarEstudio/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEstudio(@PathVariable int id){
        this.impl.eliminarEstudio(id);
        return ResponseEntity.ok().build();
    }
}
