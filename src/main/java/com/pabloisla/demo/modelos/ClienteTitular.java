package com.pabloisla.demo.modelos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "Clientes_Titulares")
public class ClienteTitular {

    @Id
    @Column(name = "Id_Cliente")
    private Long idCliente;

    @Column(name = "Nombre_Apellido")
    private String nombreApellTit;

    @Column(name = "Celular")
    private String celular;

    @Column(name = "Email")
    @Email
    private String email;

    @ManyToOne
    @JoinColumn(name = "Nit_Empresa")
    private Empresa nitEmpresa;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "idCliente", orphanRemoval = true)
    private List<Beneficiario> listBeneficiarios;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idCliente", orphanRemoval = true)
    private List<Visita> listFechasVisita;

    public ClienteTitular() {
    }

    public ClienteTitular(Long idCliente, String nombreApellTit, String celular, @Email String email,
            Empresa nitEmpresa, List<Beneficiario> listBeneficiarios, List<Visita> listFechasVisita) {
        this.idCliente = idCliente;
        this.nombreApellTit = nombreApellTit;
        this.celular = celular;
        this.email = email;
        this.nitEmpresa = nitEmpresa;
        this.listBeneficiarios = listBeneficiarios;
        this.listFechasVisita = listFechasVisita;
    }

    public ClienteTitular(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreApellTit() {
        return nombreApellTit;
    }

    public void setNombreApellTit(String nombreApellTit) {
        this.nombreApellTit = nombreApellTit;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(Empresa nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public List<Beneficiario> getListBeneficiarios() {
        return listBeneficiarios;
    }

    public void setListBeneficiarios(List<Beneficiario> listBeneficiarios) {
        this.listBeneficiarios = listBeneficiarios;
    }

    public List<Visita> getListFechasVisita() {
        return listFechasVisita;
    }

    public void setListFechasVisita(List<Visita> listFechasVisita) {
        this.listFechasVisita = listFechasVisita;
    }

    @Override
    public String toString() {
        return "ClienteTitular [celular=" + celular + ", email=" + email + ", idCliente=" + idCliente
                + ", listBeneficiarios=" + listBeneficiarios + ", listFechasVisita=" + listFechasVisita
                + ", nitEmpresa=" + nitEmpresa + ", nombreApellTit=" + nombreApellTit + "]";
    }

}