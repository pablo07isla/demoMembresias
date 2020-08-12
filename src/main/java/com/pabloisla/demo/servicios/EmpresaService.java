package com.pabloisla.demo.servicios;

import java.util.List;

import com.pabloisla.demo.modelos.Empresa;
import com.pabloisla.demo.repositorios.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repoEmpresa;

    public List<Empresa> listAll() {

        return repoEmpresa.findAll();

    }

    public void add(Empresa empresa) {
        repoEmpresa.save(empresa);
    }

}