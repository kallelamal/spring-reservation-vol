package com.example.vol.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Passager implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_pas;
    private String cin_pas;
    private String nom_pas;
    private String prenom_pas;


    public Passager() {
    }

    public Passager(String cin_pas, String nom_pas, String prenom_pas) {
        this.cin_pas = cin_pas;
        this.nom_pas = nom_pas;
        this.prenom_pas = prenom_pas;
    }

    public Long getId_pas() {
        return id_pas;
    }

    public void setId_pas(Long id_pas) {
        this.id_pas = id_pas;
    }

    public String getCin_pas() {
        return cin_pas;
    }

    public void setCin_pas(String cin_pas) {
        this.cin_pas = cin_pas;
    }

    public String getNom_pas() {
        return nom_pas;
    }

    public void setNom_pas(String nom_pas) {
        this.nom_pas = nom_pas;
    }

    public String getPrenom_pas() {
        return prenom_pas;
    }

    public void setPrenom_pas(String prenom_pas) {
        this.prenom_pas = prenom_pas;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "id_pas=" + id_pas +
                ", cin_pas='" + cin_pas + '\'' +
                ", nom_pas='" + nom_pas + '\'' +
                ", prenom_pas='" + prenom_pas + '\'' +
                '}';
    }
}
