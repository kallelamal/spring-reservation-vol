package com.example.vol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id_res;
    private Date date;
    private String numero;

    @ManyToOne
    @JoinColumn(name="client")
    private Client client ;

    @ManyToOne
    @JoinColumn(name="passager")
    private Passager passager ;

    @ManyToOne
    @JoinColumn(name="vol")
    private Vol vol ;


    public Reservation() {
    }

    public Reservation(Date date, String numero, List<Client> list_client, List<Passager> list_passager,List<Vol> list_vol) {
        this.date = date;
        this.numero = numero;
    }

    public Reservation(Date date, String numero, Client client, Passager passager, Vol vol) {
        this.date = date;
        this.numero = numero;
        this.client = client;
        this.passager = passager;
        this.vol = vol;
    }

    public long getId_res() {
        return id_res;
    }

    public void setId_res(long id_res) {
        this.id_res = id_res;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
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
                "id_res=" + id_res +
                ", date=" + date +
                ", numero='" + numero + '\'' +
                ", client=" + client +
                ", passager=" + passager +
                ", vol=" + vol +
                '}';
    }
}
