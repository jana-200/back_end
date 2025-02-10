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

    public Iterable<Drink> getAllDrinks() {
        return drinksRepository.findAll();
    }

    public Drink getDrink(long id) {
        return drinksRepository.findById(id).orElse(null);
    }


    public Drink createDrink(Drink drink) {
        return drinksRepository.save(drink);
    }

    public void deleteDrink(long id) {
        drinksRepository.deleteById(id);
    }

}