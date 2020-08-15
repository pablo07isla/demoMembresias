package com.pabloisla.demo.servicios;

import java.util.List;

import com.pabloisla.demo.modelos.Beneficiario;
import com.pabloisla.demo.repositorios.BeneficiarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeneficiarioService {

    @Autowired
    private BeneficiarioRepository repoBenef;

    public List<Beneficiario> listAll() {

        return repoBenef.findAll();

    }

    public void add(Beneficiario beneficiario) {

        repoBenef.save(beneficiario);
    }

    public Beneficiario get(Long id) {
        return repoBenef.findById(id).get();
    }

    public void delete(Long id) {
        repoBenef.deleteById(id);
    }

}