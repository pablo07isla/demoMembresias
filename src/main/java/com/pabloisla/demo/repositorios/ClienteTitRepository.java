package com.pabloisla.demo.repositorios;

import com.pabloisla.demo.modelos.ClienteTitular;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteTitRepository extends JpaRepository<ClienteTitular, Long> {

}