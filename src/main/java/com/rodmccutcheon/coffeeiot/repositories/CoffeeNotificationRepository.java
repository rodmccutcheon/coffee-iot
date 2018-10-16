package com.rodmccutcheon.coffeeiot.repositories;

import com.rodmccutcheon.coffeeiot.model.CoffeeNotification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeNotificationRepository extends CrudRepository<CoffeeNotification, Long>  {
}
