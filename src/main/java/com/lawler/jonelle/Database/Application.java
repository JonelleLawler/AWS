package com.lawler.jonelle.Database;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/cocktails")
public class Application {

    @Autowired
    private CocktailRepo cocktailRepo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        WebDriverManager.chromedriver().setup();
    }


    @PostMapping("/addCocktail")
    public @ResponseBody
    String addACocktail (@RequestParam String name) {

        Cocktail newCocktail = new Cocktail(name);
        cocktailRepo.save(newCocktail);
        return "Cocktail saved into list";

    }
}
