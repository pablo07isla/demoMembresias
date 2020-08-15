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
public class Beneficiario {

    @Id
    @Column(name = "Id_Benef")
    private Long idBenef;

    @Column(name = "Nombre_Apellido")
    private String nom_apell_benef;

    @ManyToOne
    @JoinColumn(name = "Id_Cliente")
    private ClienteTitular idCliente;

    public Beneficiario() {
    }

    public Beneficiario(Long idBenef, String nom_apell_benef, ClienteTitular idCliente) {
        this.idBenef = idBenef;
        this.nom_apell_benef = nom_apell_benef;
        this.idCliente = idCliente;
    }

    public Long getIdBenef() {
        return idBenef;
    }

    public void setIdBenef(Long idBenef) {
        this.idBenef = idBenef;
    }

    public String getNom_apell_benef() {
        return nom_apell_benef;
    }

    public void setNom_apell_benef(String nom_apell_benef) {
        this.nom_apell_benef = nom_apell_benef;
    }

    // public ClienteTitular getIdCliente() {
    // return idCliente;
    // }

    public void setIdCliente(ClienteTitular idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Beneficiario [idBenef=" + idBenef + ", idCliente=" + idCliente + ", nom_apell_benef=" + nom_apell_benef
                + "]";
    }

}