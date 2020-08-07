package com.pabloisla.demo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity

public class Empresa {

    @Id
    private int nit;
    @Column
    private String razonSocial;
    private String telefono;
    private String email;
    private String personaContacto;

}