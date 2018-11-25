package com.example.vol.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_res;
    private Date date;
    private String numero;
    @OneToMany(mappedBy="resvervation",fetch=FetchType.LAZY)
    private List<Client> list_client;
    @OneToMany(mappedBy="resvervation",fetch=FetchType.LAZY)
    private List<Passager> list_passager;

    public Reservation() {
    }

    public Reservation(Date date, String numero, List<Client> list_client, List<Passager> list_passager) {
        this.date = date;
        this.numero = numero;
        this.list_client = list_client;
        this.list_passager = list_passager;
    }

    public Long getId_res() {
        return id_res;
    }

    public void setId_res(Long id_res) {
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

    public List<Client> getList_client() {
        return list_client;
    }

    public void setList_client(List<Client> list_client) {
        this.list_client = list_client;
    }

    public List<Passager> getList_passager() {
        return list_passager;
    }

    public void setList_passager(List<Passager> list_passager) {
        this.list_passager = list_passager;
    }
}
