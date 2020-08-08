package com.pabloisla.demo.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
public class Empresa {

    @Id
    private Long nit;
    @Column
    private String razonSocial;
    @Column
    private String telefono;
    @Column
    private String email;
    @Column
    private String personaContacto;
    @OneToMany(mappedBy = "nitEmpresa", cascade = CascadeType.ALL)
    private List<ClienteTitular> clientes = new ArrayList<>();

}