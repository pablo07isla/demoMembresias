package com.pabloisla.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.pabloisla.demo.modelos.Visita;
import com.pabloisla.demo.servicios.VisitaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitaController {

    @Autowired
    private VisitaService serviceVisita;

    @GetMapping("/visitas")
    public List<Visita> list() {
        return serviceVisita.listAll();
    }

    @PostMapping("/visitas")
    public void agregar(@RequestBody Visita visita) {
        serviceVisita.add(visita);
    }

    @GetMapping("/visitas/{id}")
    public ResponseEntity<Visita> listarId(@PathVariable Long id) {
        try {
            Visita visita = serviceVisita.get(id);
            return new ResponseEntity<Visita>(visita, HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Visita>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/visitas/{id}")
    public ResponseEntity<?> actualizar(@RequestBody Visita visita, @PathVariable Long id) {

        try {
            Visita visitaExist = serviceVisita.get(id);
            serviceVisita.add(visita);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/visitas/{id}")
    public ResponseEntity<?> borrar(@PathVariable Long id) {
        try {
            Visita visitaExist = serviceVisita.get(id);
            serviceVisita.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}