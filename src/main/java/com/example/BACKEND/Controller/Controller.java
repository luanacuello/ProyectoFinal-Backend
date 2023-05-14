package com.example.BACKEND.Controller;

import com.example.BACKEND.Entity.Persona;
import com.example.BACKEND.RequestsClasses.PersonaImgRequest;
import com.example.BACKEND.RequestsClasses.PersonaRequest;
import com.example.BACKEND.Service.PersonaServiceIMPL.PersonaServiceIMPL;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("BACKEND")
public class Controller {

    @Autowired
    private PersonaServiceIMPL impl;

    @GetMapping
    @RequestMapping(value = "persona/ConsultarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPersonas() {
        List<Persona> listaPersona = this.impl.consultarPersona();
        return ResponseEntity.ok(listaPersona);
    }

    @PostMapping
    @RequestMapping(value = "persona/CrearPersonas", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPersonas(@RequestBody Persona persona) {
        Persona PersonaCreada = this.impl.crearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaCreada);
    }

    @PostMapping
    @RequestMapping(value = "persona/ModificarPersonas", method = RequestMethod.POST)
    public ResponseEntity<?> ModificarPersonas(@RequestBody PersonaRequest persona) {
        System.out.println(persona);
        Persona PersonaNew = this.impl.buscarPersona(persona.getId());
        if (PersonaNew.getNombre() != persona.getNombre()) {
            PersonaNew.setNombre(persona.getNombre());
        }

        if (PersonaNew.getTitulo() != persona.getTitulo()) {
            PersonaNew.setTitulo(persona.getTitulo());
        }

        if (PersonaNew.getDescripcion() != persona.getDescripcion()) {
            PersonaNew.setDescripcion(persona.getDescripcion());
        }

        Persona PersonaModificada = this.impl.modificarPersona(PersonaNew);
        return ResponseEntity.status(HttpStatus.OK).body(PersonaModificada);
    }

    @GetMapping
    @RequestMapping(value = "persona/BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id) {
        Persona Persona = this.impl.buscarPersona(id);
        return ResponseEntity.ok(Persona);
    }

    @DeleteMapping
    @RequestMapping(value = "persona/EliminarPersona/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersona(@PathVariable int id) {
        this.impl.eliminarPersona(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    @RequestMapping(value = "persona/ModificarPersonas/imagen", method = RequestMethod.POST)
    public ResponseEntity<?> ModificarImagen(@RequestBody PersonaImgRequest PersonaImg) {
        Persona PersonaNew = this.impl.buscarPersona(PersonaImg.getId());
        PersonaNew.setImagen(PersonaImg.getImagen());
        Persona PersonaModificada = this.impl.modificarPersona(PersonaNew);
        return ResponseEntity.status(HttpStatus.OK).body(PersonaModificada);
    }
    
    @PostMapping
    @RequestMapping(value = "persona/ModificarPersonas/banner", method = RequestMethod.POST)
    public ResponseEntity<?> ModificarBanner(@RequestBody PersonaImgRequest PersonaBanner) {
        Persona PersonaNew = this.impl.buscarPersona(PersonaBanner.getId());
        PersonaNew.setBanner(PersonaBanner.getBanner());
        Persona PersonaModificada = this.impl.modificarPersona(PersonaNew);
        return ResponseEntity.status(HttpStatus.OK).body(PersonaModificada);
    }
}
