package com.baggageservice.demo.services;

import com.baggageservice.demo.enttities.Baggage;
import com.baggageservice.demo.repo.BaggageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class BaggageClaimService {
    private final BaggageRepository baggageRepository;

    @Autowired
    public BaggageClaimService(BaggageRepository baggageRepository) {
        this.baggageRepository = baggageRepository;
    }

    @Transactional
    public Baggage dropBaggage(UUID idPassenger) {
        Baggage baggage = baggageRepository.findBaggageByIdPassenger(idPassenger);
        this.baggageRepository.deleteById(baggage.getId());
        return baggage;
    }
}
