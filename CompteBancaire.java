package com.compteBancaire;

public class CompteBancaire {
    private double solde;
    private String nom;
    private String prenom;
    private String sexe;
    private double decouvert;

    public CompteBancaire(double solde, String nom, String prenom, String sexe, double decouvert) {
        this.solde = solde;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.decouvert = decouvert;
    }
    public void deposer(double montant)
    {
        this.solde+=montant;
    }
    public void retirer(double montant)
    {
        if(this.solde+this.decouvert<montant)
            System.out.println("erreur vous n'avez pas assez d'argent");
        else
        {
            this.solde-=montant;
            System.out.println("retrait effectuée avec succes");
        }
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public double getSolde() {
        return solde;
    }

    public void afficherInfo()
    {
        System.out.println("proprietaire du compte :"+this.prenom+" "+this.nom);
        System.out.println("votre decouvert s'eleve à :"+this.decouvert+"et votre dolde est de :"+this.solde);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
