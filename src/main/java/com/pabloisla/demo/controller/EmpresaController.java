package com.pabloisla.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.pabloisla.demo.modelos.Empresa;
import com.pabloisla.demo.servicios.EmpresaService;

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
public class EmpresaController {

    @Autowired
    private EmpresaService serviceEmpresa;

    @GetMapping("/empresas")
    public List<Empresa> listar() {
        return serviceEmpresa.listAll();
    }

    @PostMapping("/empresas")
    public void agregar(@RequestBody Empresa empresa) {
        serviceEmpresa.add(empresa);
    }

    @GetMapping("/empresas/{nit}")
    public ResponseEntity<Empresa> listarId(@PathVariable Integer nit) {
        try {
            Empresa empresa = serviceEmpresa.get(nit);
            return new ResponseEntity<Empresa>(empresa, HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Empresa>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/empresas/{nit}")
    public ResponseEntity<?> actualizar(@RequestBody Empresa empresa, @PathVariable Integer nit) {

        try {
            Empresa empresaExist = serviceEmpresa.get(nit);
            serviceEmpresa.add(empresa);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/empresas/{nit}")
    public ResponseEntity<?> borrar(@PathVariable Integer nit) {
        try {
            Empresa empresaExist = serviceEmpresa.get(nit);
            serviceEmpresa.delete(nit);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}