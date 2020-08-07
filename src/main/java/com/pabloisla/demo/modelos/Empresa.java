package com.pabloisla.demo.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Empresa {

    private int nit;
    private String razonSocial;
    private String telefono;
    private String email;
    private String personaContacto;

}