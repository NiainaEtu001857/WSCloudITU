package com.spring.models;

import com.spring.models.view.AnnonceDetailView;

public class DetailVoiture {
    private String matricule;
    private Long kilometrage;
    private String marque;
    private String categorie;
    private Long annee;
    private String carburant;

    public DetailVoiture(String matricule, Long kilometrage, String marque, String categorie, Long annee,
            String carburant) {
        this.matricule = matricule;
        this.kilometrage = kilometrage;
        this.marque = marque;
        this.categorie = categorie;
        this.annee = annee;
        this.carburant = carburant;
    }

    public DetailVoiture() {
    }

    public DetailVoiture(AnnonceDetailView detailAnnonce) {
        this.matricule = detailAnnonce.getMatricule();
        this.kilometrage = detailAnnonce.getKilometrage();
        this.marque = detailAnnonce.getMarque();
        this.categorie = detailAnnonce.getCategorie();
        this.annee = detailAnnonce.getAnnee();
        this.carburant = detailAnnonce.getCarburant();
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        if (matricule != null)
            this.matricule = matricule;
    }

    public Long getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Long kilometrage) {
        if (kilometrage != null)
            this.kilometrage = kilometrage;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        if (marque != null)
            this.marque = marque;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        if (categorie != null)
            this.categorie = categorie;
    }

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        if (annee != null)
            this.annee = annee;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        if (carburant != null)
            this.carburant = carburant;
    }

}
