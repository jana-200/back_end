package be.vinci.cae.fiche1.controllers;

import be.vinci.cae.fiche1.models.Quote;
import be.vinci.cae.fiche1.services.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/quotes")
public class QuotesController {
    private final QuotesService quotesService;

    public QuotesController(QuotesService  quotesService) {
        this.quotesService = quotesService;
    }
    @GetMapping("/")
    public Iterable<Quote> all() {
        return quotesService.getAllQuotes();
    }
}
