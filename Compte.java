package metier;



import java.util.Date;

import java.util.Date;

// Déclaration de la classe Compte
public class Compte {

    // Déclaration des variables membres
    private String code;          // Code du compte
    private double solde;         // Solde du compte
    private Date dateCreation;     // Date de création du compte

    // Constructeur par défaut sans paramètres
    public Compte() {
    }

    // Constructeur avec paramètres
    public Compte(String code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    // Getters et setters pour accéder aux variables membres

    // Getter pour le code du compte
    public String getCode() {
        return code;
    }

    // Setter pour le code du compte
    public void setCode(String code) {
        this.code = code;
    }

    // Getter pour le solde du compte
    public double getSolde() {
        return solde;
    }

    // Setter pour le solde du compte
    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Getter pour la date de création du compte
    public Date getDateCreation() {
        return dateCreation;
    }

    // Setter pour la date de création du compte
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}


