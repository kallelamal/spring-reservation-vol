package com.example.vol.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idClt;
    private String loginClt;
    private String passwordClt;
    private String cinClt;
    private String nomClt;
    private String prenomClt;
    private int ageClt;
    private String adresseClt;
    private String numTel;
    private String mailClt;

    @OneToMany(mappedBy="client",fetch=FetchType.LAZY)
    private List<Reservation> reservations;

    public Client() {
    }

    public Client(String loginClt, String passwordClt) {
        this.loginClt = loginClt;
        this.passwordClt = passwordClt;
    }

    public Client(String cinClt, String nomClt, String prenomClt, int ageClt, String adresseClt, String numTel, String mailClt) {
        this.cinClt = cinClt;
        this.nomClt = nomClt;
        this.prenomClt = prenomClt;
        this.ageClt = ageClt;
        this.adresseClt = adresseClt;
        this.numTel = numTel;
        this.mailClt = mailClt;
    }

    public Client(String cinClt, String nomClt, String prenomClt, int ageClt, String adresseClt, String numTel, String mailClt, List<Reservation> reservations) {
        this.cinClt = cinClt;
        this.nomClt = nomClt;
        this.prenomClt = prenomClt;
        this.ageClt = ageClt;
        this.adresseClt = adresseClt;
        this.numTel = numTel;
        this.mailClt = mailClt;
        this.reservations = reservations;
    }

    public int getIdClt() {
        return idClt;
    }

    public void setIdClt(int idClt) {
        this.idClt = idClt;
    }

    public String getLoginClt() {
        return loginClt;
    }

    public void setLoginClt(String loginClt) {
        this.loginClt = loginClt;
    }

    public String getPasswordClt() {
        return passwordClt;
    }

    public void setPasswordClt(String passwordClt) {
        this.passwordClt = passwordClt;
    }

    public String getCinClt() {
        return cinClt;
    }

    public void setCinClt(String cinClt) {
        this.cinClt = cinClt;
    }

    public String getNomClt() {
        return nomClt;
    }

    public void setNomClt(String nomClt) {
        this.nomClt = nomClt;
    }

    public String getPrenomClt() {
        return prenomClt;
    }

    public void setPrenomClt(String prenomClt) {
        this.prenomClt = prenomClt;
    }

    public int getAgeClt() {
        return ageClt;
    }

    public void setAgeClt(int ageClt) {
        this.ageClt = ageClt;
    }

    public String getAdresseClt() {
        return adresseClt;
    }

    public void setAdresseClt(String adresseClt) {
        this.adresseClt = adresseClt;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getMailClt() {
        return mailClt;
    }

    public void setMailClt(String mailClt) {
        this.mailClt = mailClt;
    }
    @JsonIgnore
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClt=" + idClt +
                ", loginClt='" + loginClt + '\'' +
                ", passwordClt='" + passwordClt + '\'' +
                ", cinClt='" + cinClt + '\'' +
                ", nomClt='" + nomClt + '\'' +
                ", prenomClt='" + prenomClt + '\'' +
                ", ageClt=" + ageClt +
                ", adresseClt='" + adresseClt + '\'' +
                ", numTel='" + numTel + '\'' +
                ", mailClt='" + mailClt + '\'' +
                ", reservations=" + reservations +
                '}';
    }
}
