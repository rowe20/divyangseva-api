package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.City;
import com.sk.divyangseva.model.State;
import com.sk.divyangseva.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getAllCities(){
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public Optional<City> getCity(@PathVariable Long id){
        return cityService.getCity(id);
    }

    @PostMapping
    public String addCity(@RequestBody City city) {
        return cityService.addCity(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@RequestBody City city,@PathVariable Long id){
        return cityService.updateCity(city,id);
    }

    @DeleteMapping("/{id}")
    public String deleteCity(@PathVariable Long id){
        return cityService.delCity(id);
    }

    @PatchMapping("{id}")
    public City patchCityname(@RequestBody City city, @PathVariable Long id){
        return cityService.patchCityname(city,id);
    }
}
