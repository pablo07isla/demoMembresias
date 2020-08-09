package com.pabloisla.demo.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "Empresas")
@Data
@AllArgsConstructor
public class Empresa {

    @Id
    @Column(name = "Nit_Empresa")
    private Long nitEmpresa;

    @Column(name = "Razon_Social")
    private String razonSocial;

    @Column(name = "Teléfono")
    private String telefono;

    @Column(name = "Email")
    @Email
    private String email;

    @Column(name = "Persona_contacto")
    private String personaContacto;

    @OneToMany(mappedBy = "nitEmpresa", cascade = CascadeType.ALL)
    private List<ClienteTitular> clientes = new ArrayList<>();

}