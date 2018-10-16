package com.rodmccutcheon.coffeeiot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public @Data class CoffeeNotification {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Instant madeAt;
}
