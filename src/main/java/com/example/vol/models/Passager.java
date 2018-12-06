package com.example.vol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Passager implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPas;
    private String cinPas;
    private String nomPas;
    private String prenomPas;
    private int agePas;

    @ManyToOne
    @JoinColumn(name="reservation")
    private Reservation reservation;

    public Passager() {
    }

    public Passager(String cinPas, String nomPas, String prenomPas, int agePas, Reservation reservation) {
        this.cinPas = cinPas;
        this.nomPas = nomPas;
        this.prenomPas = prenomPas;
        this.agePas = agePas;
        this.reservation = reservation;
    }

    public int getIdPas() {
        return idPas;
    }

    public void setIdPas(int idPas) {
        this.idPas = idPas;
    }

    public String getCinPas() {
        return cinPas;
    }

    public void setCinPas(String cinPas) {
        this.cinPas = cinPas;
    }

    public String getNomPas() {
        return nomPas;
    }

    public void setNomPas(String nomPas) {
        this.nomPas = nomPas;
    }

    public String getPrenomPas() {
        return prenomPas;
    }

    public void setPrenomPas(String prenomPas) {
        this.prenomPas = prenomPas;
    }

    public int getAgePas() {
        return agePas;
    }

    public void setAgePas(int agePas) {
        this.agePas = agePas;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "idPas=" + idPas +
                ", cinPas='" + cinPas + '\'' +
                ", nomPas='" + nomPas + '\'' +
                ", prenomPas='" + prenomPas + '\'' +
                ", agePas=" + agePas +
                ", reservation=" + reservation +
                '}';
    }
}
