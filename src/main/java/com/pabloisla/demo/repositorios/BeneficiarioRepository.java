package com.pabloisla.demo.repositorios;

import com.pabloisla.demo.modelos.Beneficiario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {

}