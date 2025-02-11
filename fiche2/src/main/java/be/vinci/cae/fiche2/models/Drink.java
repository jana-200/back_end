package be.vinci.cae.fiche2.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "drinks")
public class Drink {
    public Drink() {}

    public Drink(String name, String description, float price, Boolean alcoholic,FoodTruck foodTruck) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.alcoholic = alcoholic;
        this.foodTruck = foodTruck;
    }
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique=true)
    private String name;
    private String description;
    private float price;
    private Boolean alcoholic;

    @ManyToOne
    @JsonBackReference
    private FoodTruck foodTruck;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Boolean getAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(Boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public FoodTruck getFoodTruck() {
        return foodTruck;
    }

    public void setFoodTruck(FoodTruck foodTruck) {
        this.foodTruck = foodTruck;
    }
}