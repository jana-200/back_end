package be.vinci.cae.restaurant.models;


public class Restaurant {
    private String nom;
    private String type;

    public Restaurant(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }
    public Restaurant() {
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }
}
