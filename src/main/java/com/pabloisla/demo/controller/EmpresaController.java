package com.pabloisla.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.pabloisla.demo.modelos.Empresa;
import com.pabloisla.demo.servicios.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/empresas")
    public List<Empresa> list() {
        return empresaService.listAll();
    }
}