package be.vinci.cae.restaurant.services;

import be.vinci.cae.restaurant.models.Restaurant;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantsService {

    // Liste de restaurants
    private final List<Restaurant> restaurants = Arrays.asList(
            new Restaurant("Comme Chez Soi", "Française"),
            new Restaurant("Le Chalet de la Forêt", "Belge"),
            new Restaurant("La Villa Lorraine", "Française"),
            new Restaurant("Belga Queen", "Belge"),
            new Restaurant("Bia Mara", "Fish"),
            new Restaurant("Aux Armes de Bruxelles", "Belge"),
            new Restaurant("Noordzee Mer du Nord", "Poisson"),
            new Restaurant("Fin de Siècle", "Européenne"),
            new Restaurant("Bon Bon", "Française")
    );

    // Méthode pour récupérer les restaurants filtrés par cuisine
    public List<Restaurant> getRestaurants(String cuisine) {
        if (cuisine == null || cuisine.isEmpty()) {
            return restaurants; // Retourne tous les restaurants si aucun type de cuisine n'est spécifié
        }
        // Filtrer les restaurants par cuisine
        return restaurants.stream()
                .filter(restaurant -> restaurant.getType().equalsIgnoreCase(cuisine))
                .collect(Collectors.toList());
    }
}
