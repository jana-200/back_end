package be.vinci.cae.fiche2.repository;

import be.vinci.cae.fiche2.models.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinksRepository extends CrudRepository<Drink, Long> {
    Iterable<Drink> findByName(String name);
}