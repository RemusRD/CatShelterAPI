package com.example.catsproject.service;


import com.example.catsproject.exception.CatException;
import com.example.catsproject.model.Cat;
import com.example.catsproject.repository.CatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class CatService {

    private final CatRepository catRepository;

    private final FeedService feedService;

    public CatService(CatRepository catRepository, FeedService feedService) {
        this.catRepository = catRepository;
        this.feedService = feedService;

    }

    public List<Cat> findAll() {

        return catRepository.findAll();
    }

    public Cat save(Cat cat) throws CatException {
        if (this.CheckIfCatIsOnShelter(cat)) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Cat is already on database.");
        }
        return this.catRepository.save(cat);
    }

   // Checks if an Cat exists in the database
    private boolean CheckIfCatIsOnShelter(Cat cat) {
        if (cat.getId() == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Cat not found in the shelter.");
        }
        return this.catRepository.existsById(cat.getId());
    }

    public Cat findById(Long id) {

        return catRepository.findById(id).get();
    }
}






   


