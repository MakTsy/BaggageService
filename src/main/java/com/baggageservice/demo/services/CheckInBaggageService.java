package com.baggageservice.demo.services;


import com.baggageservice.demo.enttities.Baggage;
import com.baggageservice.demo.repo.BaggageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class CheckInBaggageService {
    private final BaggageRepository baggageRepository;

    @Autowired
    public CheckInBaggageService(BaggageRepository baggageRepository) {
        this.baggageRepository = baggageRepository;
    }

    @Transactional
    public void checkInBaggage(UUID passangerId, float bagageWeight) {
        Baggage baggage = new Baggage(passangerId, bagageWeight);
        this.baggageRepository.save(baggage);
    }


}
