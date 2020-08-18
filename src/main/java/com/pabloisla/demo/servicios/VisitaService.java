package com.pabloisla.demo.servicios;

import java.util.List;

import com.pabloisla.demo.modelos.Visita;
import com.pabloisla.demo.repositorios.VisitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitaService {

    @Autowired
    private VisitaRepository repoVisita;

    public List<Visita> listAll() {

        return repoVisita.findAll();

    }

    public void add(Visita visita) {

        repoVisita.save(visita);
    }

    public Visita get(Long id) {
        return repoVisita.findById(id).get();
    }

    public void delete(Long id) {
        repoVisita.deleteById(id);
    }

}