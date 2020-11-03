package com.baggageservice.demo.repo;

import com.baggageservice.demo.enttities.Baggage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface BaggageRepository extends JpaRepository<Baggage, UUID> {
    @Query
    Baggage findBaggageByIdPassenger(UUID idPassenger);
}
