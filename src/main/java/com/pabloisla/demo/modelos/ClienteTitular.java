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

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "Clientes_Titulares")
@Data
@AllArgsConstructor
public class ClienteTitular {

    @Id
    @Column(name = "Id_Cliente")
    private Long idCliente;

    @Column(name = "Nombre_Apellido")
    private String nombreApellidoTit;

    @Column(name = "Celular")
    private String celular;

    @Column(name = "Email")
    @Email
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "NIT_EMPRESA")
    private Empresa nitEmpresa;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idCliente", cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Beneficiarios")
    private List<Beneficiarios> beneficiarios;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idCliente")
    @JoinColumn(name = "Fechas_Visita")
    private List<Visita> fechasVisita;

}