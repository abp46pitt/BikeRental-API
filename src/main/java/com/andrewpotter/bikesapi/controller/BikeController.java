package com.andrewpotter.bikesapi.controller;

import com.andrewpotter.bikesapi.model.entity.Bike;
import com.andrewpotter.bikesapi.repository.BikeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BikeController {

    public BikeRepository bikeRepository;

    @GetMapping(value = "/bikeController")
    public String getBikeList() {

        Bike bike = bikeRepository.findById(1);

        return bike.getName();
    }

}
