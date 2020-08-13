package com.pabloisla.demo.controller;

import java.util.List;

import com.pabloisla.demo.modelos.ClienteTitular;
import com.pabloisla.demo.servicios.ClienteTitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteTitController {

    @Autowired
    private ClienteTitService serviceCliente;

    @GetMapping("/clientes")
    public List<ClienteTitular> list() {
        return serviceCliente.listAll();
    }

    @PostMapping("/clientes")
    public void agrgar(@RequestBody ClienteTitular cliente) {
        serviceCliente.add(cliente);
    }

}