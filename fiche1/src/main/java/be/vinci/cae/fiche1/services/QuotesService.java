package be.vinci.cae.fiche1.services;

import be.vinci.cae.fiche1.models.Quote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotesService {
    public List<Quote> getAllQuotes() {
        Quote[] quotes = {
                new Quote("Ce qui est écrit n'est pas ce qui est - c'est juste ce qui est écrit", "Anonyme"),
                new Quote("La vie est un mystère qu'il faut vivre, et non un problème à résoudre", "Gandhi"),
                // D'autres quotes
        };

        return List.of(quotes);
    }
}
