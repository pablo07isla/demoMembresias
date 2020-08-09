package com.pabloisla.demo.modelos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "Beneficiarios")
@Data
@AllArgsConstructor
public class Beneficiarios {

    @Id
    private Long idBenef;
    @Column(name = "Nombre_Apellido")
    private String nom_apell_benef;
    @ManyToOne(cascade = CascadeType.ALL)
    private ClienteTitular idCliente;

}