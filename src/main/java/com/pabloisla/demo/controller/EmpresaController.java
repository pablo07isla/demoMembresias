package com.pabloisla.demo.controller;

import java.util.List;

import com.pabloisla.demo.modelos.Empresa;
import com.pabloisla.demo.servicios.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Empresa listarId(@PathVariable Integer nit) {
        return serviceEmpresa.get(nit);
    }

    @PutMapping("/empresas/{nit}")
    public void actualizar(@RequestBody Empresa empresa, @PathVariable Integer nit) {
        serviceEmpresa.add(empresa);
    }

    @DeleteMapping("/empresas/{nit}")
    public void borrar(@PathVariable Integer nit) {
        serviceEmpresa.delete(nit);
    }

}