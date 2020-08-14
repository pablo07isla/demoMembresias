package com.pabloisla.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.pabloisla.demo.modelos.ClienteTitular;
import com.pabloisla.demo.servicios.ClienteTitService;

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
public class ClienteTitController {

    @Autowired
    private ClienteTitService serviceCliente;

    @GetMapping("/clientes")
    public List<ClienteTitular> list() {
        return serviceCliente.listAll();
    }

    @PostMapping("/clientes")
    public void agregar(@RequestBody ClienteTitular cliente) {
        serviceCliente.add(cliente);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<ClienteTitular> listarId(@PathVariable Long id) {
        try {
            ClienteTitular cliente = serviceCliente.get(id);
            return new ResponseEntity<ClienteTitular>(cliente, HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<ClienteTitular>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<?> actualizar(@RequestBody ClienteTitular cliente, @PathVariable Long id) {

        try {
            ClienteTitular clienteExist = serviceCliente.get(id);
            serviceCliente.add(cliente);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<?> borrar(@PathVariable Long id) {
        try {
            ClienteTitular clienteExist = serviceCliente.get(id);
            serviceCliente.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}