package com.example.catsproject.service;


import com.example.catsproject.exception.CatException;
import com.example.catsproject.model.Cat;
import com.example.catsproject.model.CatBreed;
import com.example.catsproject.repository.CatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class CatService {

    private final CatRepository catRepository;


    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> findAll() {

        return catRepository.findAll();
    }

    public Cat addCat(Cat newcat) {
        return catRepository.save(newcat);
    }

   // Checks if an Cat exists in the database
    private boolean CheckIfCatIsOnShelter(Cat cat) {
        if (cat.getId() == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Cat not found in the shelter.");
        }
        return this.catRepository.existsById(cat.getId());
    }
//
//    public Cat findById(String id) {
//        return catRepository.findById(id).get();
//  }

    public List<Cat> findByBreed(String breed) {
        return catRepository.findByBreed((CatBreed.valueOf(breed)));
    }

    public Cat updateCat(String id, String name, int age, CatBreed catBreed) {
        return catRepository.saveAll();
    }



}






   


