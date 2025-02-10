package be.vinci.cae.fiche2.repository;

import be.vinci.cae.fiche2.models.FoodTruck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodTrucksRepository extends CrudRepository<FoodTruck, Long> {
}
