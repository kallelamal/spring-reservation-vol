package com.example.vol.models;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id_clt;
    private String login_clt;
    private String password_clt;
    private String cin_clt;
    private String nom_clt;
    private String prenom_clt;
    private int age_clt;
    private String adresse_clt;
    private String num_tel_clt;
    private String mail_clt;
    @OneToMany(mappedBy="client",fetch=FetchType.LAZY)
    private List<Reservation> reservations;

    public Client() {
    }

    public Client(String login_clt, String password_clt, String cin_clt, String nom_clt, String prenom_clt, int age_clt, String adresse_clt, String num_tel_clt, String mail_clt) {
        this.login_clt = login_clt;
        this.password_clt = password_clt;
        this.cin_clt = cin_clt;
        this.nom_clt = nom_clt;
        this.prenom_clt = prenom_clt;
        this.age_clt = age_clt;
        this.adresse_clt = adresse_clt;
        this.num_tel_clt = num_tel_clt;
        this.mail_clt = mail_clt;
    }

    public Client(String login_clt, String password_clt, String cin_clt, String nom_clt, String prenom_clt, int age_clt, String adresse_clt, String num_tel_clt, String mail_clt, List<Reservation> reservations) {
        this.login_clt = login_clt;
        this.password_clt = password_clt;
        this.cin_clt = cin_clt;
        this.nom_clt = nom_clt;
        this.prenom_clt = prenom_clt;
        this.age_clt = age_clt;
        this.adresse_clt = adresse_clt;
        this.num_tel_clt = num_tel_clt;
        this.mail_clt = mail_clt;
        this.reservations = reservations;
    }

    public long getId_clt() {
        return id_clt;
    }

    public void setId_clt(long id_clt) {
        this.id_clt = id_clt;
    }

    public String getNom_clt() {
        return nom_clt;
    }

    public void setNom_clt(String nom_clt) {
        this.nom_clt = nom_clt;
    }

    public String getPrenom_clt() {
        return prenom_clt;
    }

    public void setPrenom_clt(String prenom_clt) {
        this.prenom_clt = prenom_clt;
    }

    public String getAdresse_clt() {
        return adresse_clt;
    }

    public void setAdresse_clt(String adresse_clt) {
        this.adresse_clt = adresse_clt;
    }

    public String getNum_tel_clt() {
        return num_tel_clt;
    }

    public void setNum_tel_clt(String num_tel_clt) {
        this.num_tel_clt = num_tel_clt;
    }


    public String getLogin_clt() {
        return login_clt;
    }

    public void setLogin_clt(String login_clt) {
        this.login_clt = login_clt;
    }

    public String getPassword_clt() {
        return password_clt;
    }

    public void setPassword_clt(String password_clt) {
        this.password_clt = password_clt;
    }

    public String getCin_clt() {
        return cin_clt;
    }

    public void setCin_clt(String cin_clt) {
        this.cin_clt = cin_clt;
    }

    public int getAge_clt() {
        return age_clt;
    }

    public void setAge_clt(int age_clt) {
        this.age_clt = age_clt;
    }

    public String getMail_clt() {
        return mail_clt;
    }

    public void setMail_clt(String mail_clt) {
        this.mail_clt = mail_clt;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id_clt=" + id_clt +
                ", login_clt='" + login_clt + '\'' +
                ", password_clt='" + password_clt + '\'' +
                ", cin_clt='" + cin_clt + '\'' +
                ", nom_clt='" + nom_clt + '\'' +
                ", prenom_clt='" + prenom_clt + '\'' +
                ", age_clt=" + age_clt +
                ", adresse_clt='" + adresse_clt + '\'' +
                ", num_tel_clt='" + num_tel_clt + '\'' +
                ", mail_clt='" + mail_clt + '\'' +
                ", reservations=" + reservations +
                '}';
    }
}
