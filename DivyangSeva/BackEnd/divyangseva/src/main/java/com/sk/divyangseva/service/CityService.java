package com.sk.divyangseva.service;

import com.sk.divyangseva.model.City;
import com.sk.divyangseva.model.State;
import com.sk.divyangseva.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    public CityRepository cityRepository;

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    public Optional<City> getCity(Long id){
        return cityRepository.findById(id);
    }

    public String addCity(City city){
        cityRepository.save(city);
        return "Record Inserted Successfully.";
    }

    public City updateCity(City city,Long id){
        city.setId(id);
        city.getCity_name();
        city.getState();
        return cityRepository.save(city);
    }

    public String delCity(Long id){
        cityRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }

    public City patchCityname(City cityname,Long id){
        City city = cityRepository.findById(id).get();
        city.setCity_name(cityname.getCity_name());
        cityRepository.save(city);
        return city;
    }
}
