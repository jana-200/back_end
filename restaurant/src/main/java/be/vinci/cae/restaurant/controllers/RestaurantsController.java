package be.vinci.cae.restaurant.controllers;

import be.vinci.cae.restaurant.models.Restaurant;
import be.vinci.cae.restaurant.services.RestaurantsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/restaurants")
public class RestaurantsController {

    private final RestaurantsService restaurantsService;

    public RestaurantsController(RestaurantsService restaurantsService) {
        this.restaurantsService = restaurantsService;
    }

    // Endpoint pour récupérer les restaurants
    @GetMapping
    public List<Restaurant> getRestaurants(@RequestParam(required = false) String cuisine) {
        return restaurantsService.getRestaurants(cuisine);
    }
}


