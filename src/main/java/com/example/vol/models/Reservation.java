package com.example.vol.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRes;
    private Date dateRes;
    private int nbrePlace;

    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;

    @OneToMany(mappedBy = "reservation", fetch = FetchType.LAZY)
    private List<Passager> ListPassagers;

    @ManyToOne
    @JoinColumn(name = "vol")
    private Vol vol;

    public Reservation() {
    }

    public Reservation(Date dateRes, int nbrePlace) {
        this.dateRes = dateRes;
        this.nbrePlace = nbrePlace;
    }

    public Reservation(Date dateRes, int nbrePlace, Client client, List<Passager> listPassagers, Vol vol) {
        this.dateRes = dateRes;
        this.nbrePlace = nbrePlace;
        this.client = client;
        ListPassagers = listPassagers;
        this.vol = vol;
    }

    public int getIdRes() {
        return idRes;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public Date getDateRes() {
        return dateRes;
    }

    public void setDateRes(Date dateRes) {
        this.dateRes = dateRes;
    }

    public int getNbrePlace() {
        return nbrePlace;
    }

    public void setNbrePlace(int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }

    @JsonIgnore
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Passager> getListPassagers() {
        return ListPassagers;
    }

    public void setListPassagers(List<Passager> listPassagers) {
        ListPassagers = listPassagers;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idRes=" + idRes +
                ", dateRes=" + dateRes +
                ", nbrePlace=" + nbrePlace +
                ", client=" + client +
                ", ListPassagers=" + ListPassagers +
                ", vol=" + vol +
                '}';
    }
}
