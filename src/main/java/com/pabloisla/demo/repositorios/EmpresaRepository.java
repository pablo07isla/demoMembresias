package com.pabloisla.demo.repositorios;

import com.pabloisla.demo.modelos.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}