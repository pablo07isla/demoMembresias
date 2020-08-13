package com.pabloisla.demo.modelos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    // @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
    // "idCliente")
    // // @JoinColumn(name = "Id_Beneficiarios")
    // private List<Beneficiario> listBeneficiarios;

    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "idCliente")
    // // @JoinColumn(name = "Fechas_Visita")
    // private List<Visita> listFechasVisita;

    public ClienteTitular() {
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

    @Override
    public String toString() {
        return "ClienteTitular [celular=" + celular + ", email=" + email + ", idCliente=" + idCliente
                + ", nombreApellTit=" + nombreApellTit + "]";
    }

    public ClienteTitular(Long idCliente, String nombreApellTit, String celular, @Email String email) {
        this.idCliente = idCliente;
        this.nombreApellTit = nombreApellTit;
        this.celular = celular;
        this.email = email;
    }

}