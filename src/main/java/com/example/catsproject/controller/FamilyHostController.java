package com.example.catsproject.controller;


import com.example.catsproject.exception.CatException;
import com.example.catsproject.model.Cat;
import com.example.catsproject.model.Volunteer;
import com.example.catsproject.request.CreateNewCatHF;
import com.example.catsproject.service.CatService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class FamilyHostController {

    private CatService catService;

    public FamilyHostController(CatService catService) {

        this.catService = catService;
    }

    //Read All
    @GetMapping(value = "/cats")
    public List<Cat> getCats() {

        return catService.findAll();
    }

    //Create a new cat
    @PostMapping(value = "/cat", consumes = "application/json")
    public Cat addCat(@RequestBody @Valid Cat cat) throws CatException {
        return catService.save(cat);
    }
     //Update the information
    @PutMapping(value = "/cats")
    Cat updateCat(@RequestBody Cat newcat, @PathVariable Long id) throws CatException {
        Cat updateCat = catService.findById(id);
        updateCat.setAge(newcat.getAge());
        updateCat.setName(newcat.getName());
        return catService.save(updateCat);
    }
}








