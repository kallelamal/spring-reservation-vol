package com.example.vol.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Aeroport implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_aero;
    private String libelle;
    private String adresse;

    public Aeroport() {
    }

    public Aeroport(String libelle, String adresse) {
        this.libelle = libelle;
        this.adresse = adresse;
    }

    public Long getId_aero() {
        return id_aero;
    }

    public void setId_aero(Long id_aero) {
        this.id_aero = id_aero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Aeroport{" +
                "id_aero=" + id_aero +
                ", libelle='" + libelle + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
