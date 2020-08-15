package com.pabloisla.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.pabloisla.demo.modelos.Beneficiario;
import com.pabloisla.demo.modelos.ClienteTitular;
import com.pabloisla.demo.servicios.BeneficiarioService;

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
public class BeneficiarioController {

    @Autowired
    private BeneficiarioService serviceBenef;

    @GetMapping("/beneficiarios")
    public List<Beneficiario> list() {
        return serviceBenef.listAll();
    }

    @PostMapping("/beneficiarios")
    public void agregar(@RequestBody Beneficiario cliente) {
        serviceBenef.add(cliente);
    }

    @GetMapping("/beneficiarios/{id}")
    public ResponseEntity<Beneficiario> listarId(@PathVariable Long id) {
        try {
            Beneficiario cliente = serviceBenef.get(id);
            return new ResponseEntity<Beneficiario>(cliente, HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Beneficiario>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/beneficiarios/{id}")
    public ResponseEntity<?> actualizar(@RequestBody Beneficiario cliente, @PathVariable Long id) {

        try {
            Beneficiario benefExist = serviceBenef.get(id);
            serviceBenef.add(cliente);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/beneficiarios/{id}")
    public ResponseEntity<?> borrar(@PathVariable Long id) {
        try {
            Beneficiario benefExist = serviceBenef.get(id);
            serviceBenef.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}