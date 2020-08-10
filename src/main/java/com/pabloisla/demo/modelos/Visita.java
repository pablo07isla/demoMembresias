package com.pabloisla.demo.modelos;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "Visitas")
@Data
@AllArgsConstructor
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVisita;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Cliente")
    private ClienteTitular idCliente;
    @Column(name = "Fecha_Visita")
    private Date fechaVisita;
    @Column(name = "Cantidad_Acomp")
    private int cantidadAcomp;

}