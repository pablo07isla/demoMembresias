package com.pabloisla.demo.modelos;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ClienteTitular {

    private Long idCliente;
    private String nombreApellido;
    private String celular;
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NIT_EMPRESA")
    private Empresa nitEmpresa;

    private List<Beneficiarios> beneficiarios;
    private List<Visita> fechas_visita;

}