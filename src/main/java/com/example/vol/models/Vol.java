package com.example.vol.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class Vol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num_vol;
    private Date date_Depart;
    private Time heure_Depart;
    private Date date_Arrive;
    private Time heure_Arrive;
    @OneToMany(mappedBy="vol",fetch=FetchType.LAZY)
    private List<Reservation> list_reservation;

    public Vol() {
    }

    public Vol(Date date_Depart, Time heure_Depart, Date date_Arrive, Time heure_Arrive, List<Reservation> list_reservation) {
        this.date_Depart = date_Depart;
        this.heure_Depart = heure_Depart;
        this.date_Arrive = date_Arrive;
        this.heure_Arrive = heure_Arrive;
        this.list_reservation = list_reservation;
    }

    public Vol(Date date_Depart, Time heure_Depart, Date date_Arrive, Time heure_Arrive) {
        this.date_Depart = date_Depart;
        this.heure_Depart = heure_Depart;
        this.date_Arrive = date_Arrive;
        this.heure_Arrive = heure_Arrive;
    }

    public long getNum_vol() {
        return num_vol;
    }

    public void setNum_vol(long num_vol) {
        this.num_vol = num_vol;
    }

    public Date getDate_Depart() {
        return date_Depart;
    }

    public void setDate_Depart(Date date_Depart) {
        this.date_Depart = date_Depart;
    }

    public Time getHeure_Depart() {
        return heure_Depart;
    }

    public void setHeure_Depart(Time heure_Depart) {
        this.heure_Depart = heure_Depart;
    }

    public Date getDate_Arrive() {
        return date_Arrive;
    }

    public void setDate_Arrive(Date date_Arrive) {
        this.date_Arrive = date_Arrive;
    }

    public Time getHeure_Arrive() {
        return heure_Arrive;
    }

    public void setHeure_Arrive(Time heure_Arrive) {
        this.heure_Arrive = heure_Arrive;
    }

    public List<Reservation> getList_reservation() {
        return list_reservation;
    }

    public void setList_reservation(List<Reservation> list_reservation) {
        this.list_reservation = list_reservation;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "num_vol=" + num_vol +
                ", date_Depart=" + date_Depart +
                ", heure_Depart=" + heure_Depart +
                ", date_Arrive=" + date_Arrive +
                ", heure_Arrive=" + heure_Arrive +
                ", list_reservation=" + list_reservation +
                '}';
    }
}
