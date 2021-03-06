package cursor.rybak.web;

import cursor.rybak.model.Hero;
import cursor.rybak.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuoteController {
    private final QuoteRepository quoteRepository;

    @Autowired
    public QuoteController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping("/heroes")
    public List<Hero> getHeroes() {
        return quoteRepository.getHeroes();
    }

    @GetMapping("/api")
    public List<Hero> getHeroes(@RequestParam String hero) {
        return quoteRepository.getHeroQuote(hero);
    }
}
