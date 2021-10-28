package com.example.catsproject.service;

import com.example.catsproject.controller.response.ShelterResponse;
import com.example.catsproject.model.CatShelter;
import com.example.catsproject.repository.CatRepository;
import com.example.catsproject.repository.ShelterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {

    private final ShelterRepository shelterRepository;

    public ShelterService(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    public CatShelter createShelter(CatShelter newCatShelter) {
        return shelterRepository.save(newCatShelter);
    }

    public void deleteById(Long catShelterId) {
        shelterRepository.deleteById(catShelterId);
    }

    public List<CatShelter> findAll() {
        return shelterRepository.findAll();
    }
}
