package com.github.menezeslucas1.citiesapi;

import com.github.menezeslucas1.citiesapi.countries.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    @GetMapping
    public List<Country> countries(){
        return null;
    }
}
