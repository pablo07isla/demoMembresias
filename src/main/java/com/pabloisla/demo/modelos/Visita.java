package com.pabloisla.demo.modelos;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Visitas")
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVisita;

    @ManyToOne
    @JoinColumn(name = "Id_Cliente")
    private ClienteTitular idCliente;
    @Column(name = "Fecha_Visita")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaVisita;
    @Column(name = "Cantidad_Acomp")
    private int cantidadAcomp;

    public Visita() {

    }

    public Visita(Long idVisita, ClienteTitular idCliente, Calendar fechaVisita, int cantidadAcomp) {
        this.idVisita = idVisita;
        this.idCliente = idCliente;
        this.fechaVisita = fechaVisita;
        this.cantidadAcomp = cantidadAcomp;
    }

    public Long getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Long idVisita) {
        this.idVisita = idVisita;
    }

    // public ClienteTitular getIdCliente() {
    // return idCliente;
    // }

    public void setIdCliente(ClienteTitular idCliente) {
        this.idCliente = idCliente;
    }

    public Calendar getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Calendar fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public int getCantidadAcomp() {
        return cantidadAcomp;
    }

    public void setCantidadAcomp(int cantidadAcomp) {
        this.cantidadAcomp = cantidadAcomp;
    }

    @Override
    public String toString() {
        return "Visita [cantidadAcomp=" + cantidadAcomp + ", fechaVisita=" + fechaVisita + ", idCliente=" + idCliente
                + ", idVisita=" + idVisita + "]";
    }

}