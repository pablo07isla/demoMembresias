package com.pabloisla.demo.repositorios;

import com.pabloisla.demo.modelos.Visita;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitaRepository extends JpaRepository<Visita, Long> {

}