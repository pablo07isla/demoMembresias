package com.pabloisla.demo.servicios;

import java.util.List;

import com.pabloisla.demo.modelos.ClienteTitular;
import com.pabloisla.demo.modelos.Empresa;
import com.pabloisla.demo.repositorios.ClienteTitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteTitService {

    @Autowired
    private ClienteTitRepository repoClienTit;

    public List<ClienteTitular> listAll() {

        return repoClienTit.findAll();

    }

    public void add(ClienteTitular cliente) {

        repoClienTit.save(cliente);
    }

    public ClienteTitular get(Long id) {
        return repoClienTit.findById(id).get();
    }

    public void delete(Long id) {
        repoClienTit.deleteById(id);
    }

}