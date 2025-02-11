package be.vinci.cae.fiche2.controllers;

import be.vinci.cae.fiche2.models.Drink;
import be.vinci.cae.fiche2.services.DrinksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drinks")
public class DrinksController {
    private DrinksService drinksService;

    public DrinksController(DrinksService drinksService) {
        this.drinksService = drinksService;
    }

    @GetMapping
    public Iterable<Drink> getDrinks(@RequestParam(required = false) String name) {
        return drinksService.getAllDrinks(name);
    }

    @GetMapping("/{id}")
    public Drink getDrink(@PathVariable() long id) {
        return drinksService.getDrink(id);
    }

    @PostMapping
    public Drink addDrink( @RequestBody Drink drink) {
        return drinksService.createDrink(drink);
    }

    @PutMapping("/{id}")
    public Drink updateDrink(@PathVariable() long id, @RequestBody Drink drink) {
        return drinksService.updateDrink(id,drink);
    }

    @DeleteMapping("/{id}")
    public void deleteDrink(@PathVariable() long id) {
        drinksService.deleteDrink(id);
    }

}