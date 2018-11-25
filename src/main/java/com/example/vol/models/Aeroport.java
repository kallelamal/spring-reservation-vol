package com.example.vol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Aeroport implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id_aero;
    private String libelle;
    private String adresse;
    @ManyToOne
    @JoinColumn(name="ville")
    private Ville ville ;


    public Aeroport() {
    }


    public Aeroport(String libelle, String adresse, List<Ville> list_Ville) {
        this.libelle = libelle;
        this.adresse = adresse;
    }

    public long getId_aero() {
        return id_aero;
    }

    public void setId_aero(long id_aero) {
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

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Aeroport{" +
                "id_aero=" + id_aero +
                ", libelle='" + libelle + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville=" + ville +
                '}';
    }
}
