package com.baggageservice.demo.enttities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Baggage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private float baggageWeight;
    private UUID idPassenger;

    public Baggage(UUID idPassenger, float baggageWeight) {
        this.baggageWeight = baggageWeight;
        this.idPassenger = idPassenger;
    }

    public Baggage() {
    }

    public void setBaggageWeight(float baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    public UUID getId() {
        return id;
    }
}
