package be.vinci.cae.fiche2.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "trucks")
public class FoodTruck {

    public FoodTruck() {}

    public FoodTruck(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique=true)
    private String name;
    private String adresse;

    @OneToMany(mappedBy = "foodTruck")
    @JsonManagedReference
    private List<Drink> drinks;

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
