package com.rodmccutcheon.coffeeiot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.Instant;

@Entity
public class CoffeeNotification implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private Instant madeAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getMadeAt() {
        return madeAt;
    }

    public void setMadeAt(Instant madeAt) {
        this.madeAt = madeAt;
    }
}
