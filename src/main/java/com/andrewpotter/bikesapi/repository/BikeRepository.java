package com.andrewpotter.bikesapi.repository;

import com.andrewpotter.bikesapi.model.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, String> {

    Bike findById(Integer id);

}
