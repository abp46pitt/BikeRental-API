package com.andrewpotter.bikesapi.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String comment;

    @ManyToOne
    @JoinColumn(name="users_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="bikes_id")
    private Bike bike;
}
