package com.example.vol.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class Vol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numVol;
    private Date dateDepart;
    private Time heureDepart;
    private Date dateArrive;
    private Time heureArrive;
    private String avion;
    private double prix;
    private boolean etat;
    private int nbrePlace;
    private int nbrePlaceRestant;
    private String villeDepart;
    private String villeArrive;

    @OneToMany(mappedBy = "vol", fetch = FetchType.LAZY)
    private List<Reservation> listReservations;

    public Vol() {
    }

    public Vol(Date dateDepart, Time heureDepart, Date dateArrive, Time heureArrive, String avion, double prix, boolean etat, int nbrePlace, int nbrePlaceRestant, String villeDepart, String villeArrive) {
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.dateArrive = dateArrive;
        this.heureArrive = heureArrive;
        this.avion = avion;
        this.prix = prix;
        this.etat = etat;
        this.nbrePlace = nbrePlace;
        this.nbrePlaceRestant = nbrePlaceRestant;
        this.villeDepart = villeDepart;
        this.villeArrive = villeArrive;
    }

    public Vol(Date dateDepart, Time heureDepart, Date dateArrive, Time heureArrive, String avion, double prix, boolean etat, int nbrePlace, int nbrePlaceRestant, String villeDepart, String villeArrive, List<Reservation> listReservations) {
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.dateArrive = dateArrive;
        this.heureArrive = heureArrive;
        this.avion = avion;
        this.prix = prix;
        this.etat = etat;
        this.nbrePlace = nbrePlace;
        this.nbrePlaceRestant = nbrePlaceRestant;
        this.villeDepart = villeDepart;
        this.villeArrive = villeArrive;
        this.listReservations = listReservations;
    }

    public int getNumVol() {
        return numVol;
    }

    public void setNumVol(int numVol) {
        this.numVol = numVol;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Time getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Time heureDepart) {
        this.heureDepart = heureDepart;
    }

    public Date getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(Date dateArrive) {
        this.dateArrive = dateArrive;
    }

    public Time getHeureArrive() {
        return heureArrive;
    }

    public void setHeureArrive(Time heureArrive) {
        this.heureArrive = heureArrive;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public int getNbrePlace() {
        return nbrePlace;
    }

    public void setNbrePlace(int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }

    public int getNbrePlaceRestant() {
        return nbrePlaceRestant;
    }

    public void setNbrePlaceRestant(int nbrePlaceRestant) {
        this.nbrePlaceRestant = nbrePlaceRestant;
    }

    @JsonIgnore
    public List<Reservation> getListReservations() {
        return listReservations;
    }

    public void setListReservations(List<Reservation> listReservations) {
        this.listReservations = listReservations;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrive() {
        return villeArrive;
    }

    public void setVilleArrive(String villeArrive) {
        this.villeArrive = villeArrive;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "numVol=" + numVol +
                ", dateDepart=" + dateDepart +
                ", heureDepart=" + heureDepart +
                ", dateArrive=" + dateArrive +
                ", heureArrive=" + heureArrive +
                ", avion='" + avion + '\'' +
                ", prix=" + prix +
                ", etat=" + etat +
                ", nbrePlace=" + nbrePlace +
                ", nbrePlaceRestant=" + nbrePlaceRestant +
                ", villeDepart='" + villeDepart + '\'' +
                ", villeArrive='" + villeArrive + '\'' +
                ", listReservations=" + listReservations +
                '}';
    }
}
