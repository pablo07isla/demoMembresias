package com.pabloisla.demo.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Empresas")
public class Empresa {

    @Id
    @Column(name = "nit_empresa")
    private Integer nitEmpresa;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "teléfono")
    private String telefono;
    @Column(name = "email")
    private String email;
    @Column(name = "persona_contacto")
    private String personaContacto;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "NitEmpresa_fk")
    private List<ClienteTitular> clientes = new ArrayList<>();

    public Empresa() {
    }

    public Integer getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(Integer nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    public List<ClienteTitular> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteTitular> clientes) {
        this.clientes = clientes;
    }

    public Empresa(Integer nitEmpresa, String razonSocial, String telefono, String email, String personaContacto,
            List<ClienteTitular> clientes) {
        this.nitEmpresa = nitEmpresa;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.email = email;
        this.personaContacto = personaContacto;
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Empresa [clientes=" + clientes + ", email=" + email + ", nitEmpresa=" + nitEmpresa
                + ", personaContacto=" + personaContacto + ", razonSocial=" + razonSocial + ", telefono=" + telefono
                + "]";
    }

}