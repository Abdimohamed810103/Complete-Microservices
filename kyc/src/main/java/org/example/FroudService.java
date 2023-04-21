package org.example;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FroudService {
    private FroudRepo froudRepo;

    public FroudService(FroudRepo froudRepo) {
        this.froudRepo = froudRepo;
    }

    public boolean froudResponse(Integer cusotmerId){
        Froud froud = Froud.builder()
                .customerId(cusotmerId)
                .isFroud(false)
                .createdAt(LocalDateTime.now())
                .build();
        Froud savFroud = froudRepo.save(froud);
        return false;
    }
}
