package com.example.catsproject.controller;

import com.example.catsproject.model.CatShelter;
import com.example.catsproject.controller.request.ShelterRequest;
import com.example.catsproject.service.ShelterService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class ShelterController {
    private final ShelterService shelterService;

    public ShelterController(ShelterService shelterService) {
        this.shelterService = shelterService;
    }

    //Create a shelter
    @PostMapping(value = "/shelter", consumes = "application/json")
    public CatShelter createShelter(@RequestBody @Valid ShelterRequest shelterRequest) {

        CatShelter newCatShelter = CatShelter
                .builder()
                .name(shelterRequest.getName())
                .location(shelterRequest.getLocation())
                .volunteers(shelterRequest.getVolunteers())
                .build();

        return shelterService.createShelter(newCatShelter);
    }

    //Delete by ID
    @DeleteMapping(value = "/delete/{id}")
    public void deleteCatShelter(@PathVariable(value = "id") Long catShelterId) {
        shelterService.deleteById(catShelterId);
    }

    //Read all the volunteers
    @GetMapping("/shelter/{id}")
    public List<CatShelter> ShelterList() {
        return shelterService.findAll();
    }
}

