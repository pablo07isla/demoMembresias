package com.pabloisla.demo.modelos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "Beneficiarios")
@Data
@AllArgsConstructor
public class Beneficiario {

    @Id
    private Long idBenef;

    @Column(name = "Nombre_Apellido")
    private String nom_apell_benef;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Cliente")
    private ClienteTitular idCliente;

}