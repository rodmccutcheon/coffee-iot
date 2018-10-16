package com.rodmccutcheon.coffeeiot.controllers;

import com.rodmccutcheon.coffeeiot.repositories.CoffeeNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeCountController {

    @Autowired
    private CoffeeNotificationRepository coffeeNotificationRepository;

    @GetMapping("/currentCount")
    public long getCoffeeCount() {
        return coffeeNotificationRepository.count();
    }
}
