package com.example.vol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
public class Ville implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id_ville;
    private String libelle_ville;
    @OneToMany(mappedBy="ville",fetch=FetchType.LAZY)
    private List<Aeroport> list_aeroport;

    public Ville() {
    }

    public Ville(String libelle_ville, List<Aeroport> list_aeroport) {
        this.libelle_ville = libelle_ville;
        this.list_aeroport = list_aeroport;
    }

    public Ville(String libelle_ville) {
        this.libelle_ville = libelle_ville;
    }

    public long getId_ville() {
        return id_ville;
    }

    public void setId_ville(long id_ville) {
        this.id_ville = id_ville;
    }

    public String getLibelle_ville() {
        return libelle_ville;
    }

    public void setLibelle_ville(String libelle_ville) {
        this.libelle_ville = libelle_ville;
    }

    public List<Aeroport> getList_aeroport() {
        return list_aeroport;
    }

    public void setList_aeroport(List<Aeroport> list_aeroport) {
        this.list_aeroport = list_aeroport;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "id_ville=" + id_ville +
                ", libelle_ville='" + libelle_ville + '\'' +
                ", list_aeroport=" + list_aeroport +
                '}';
    }
}
