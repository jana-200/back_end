package be.vinci.cae.fiche2.services;

import be.vinci.cae.fiche2.models.Drink;
import be.vinci.cae.fiche2.repository.DrinksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinksService {
    private final DrinksRepository drinksRepository;

    public DrinksService(DrinksRepository drinksRepository) {
        this.drinksRepository = drinksRepository;
    }

    public Iterable<Drink> getAllDrinks(String name) {
        if (name == null || name.isEmpty()) {
            return drinksRepository.findAll();
        }
        return drinksRepository.findByName(name);
    }

    public Drink getDrink(long id) {
        return drinksRepository.findById(id).orElse(null);
    }


    public Drink createDrink(Drink drink) {
        return drinksRepository.save(drink);
    }

    public Drink updateDrink(long id,Drink drink) {
        Drink existingDrink = drinksRepository.findById(id).orElse(null);

        if (existingDrink != null) {
            // Mise à jour du drink existant
            existingDrink.setName(drink.getName());
            existingDrink.setDescription(drink.getDescription());
            existingDrink.setPrice(drink.getPrice());
            existingDrink.setAlcoholic(drink.getAlcoholic());
            return drinksRepository.save(existingDrink);
        } else {
            // Création d'un nouveau drink avec l'ID fourni
            return drinksRepository.save(drink);
        }
    }

    public void deleteDrink(long id) {
        drinksRepository.deleteById(id);
    }

}