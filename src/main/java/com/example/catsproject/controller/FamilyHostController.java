package com.example.catsproject.controller;


import com.example.catsproject.controller.request.CatRequest;
import com.example.catsproject.controller.response.CatResponse;
import com.example.catsproject.exception.CatException;
import com.example.catsproject.model.Cat;
import com.example.catsproject.service.CatService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
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
    public List<CatResponse> getCats() { //List<Cat> -> List<CatResponse>
        final List<Cat> cats =  catService.findAll();
        List<CatResponse> catsReponses = new ArrayList<CatResponse>();
        //fore -> add to catResponses
        return catsReponses;
    }

    //Create a new cat
    @PostMapping(value = "/cat")
    public CatResponse addCat(@RequestBody @Valid CatRequest catRequest) {
        Cat newcat = catService.addCat(Cat.builder()
                .name(catRequest.getName())
                .age(catRequest.getAge())
                .breed(catRequest.getCatBreed())
                .build()
        );
        return new CatResponse(newcat.getId(), newcat.getName(), newcat.getAge(), newcat.getBreed());
    }

    @GetMapping("/cats") // GET /cats?breed=bla
    public List<CatResponse> getCatByBreed(@PathParam(value = "breed") String breed) {
        List<Cat> catList = catService.findByBreed(breed);
        List<CatResponse> catResponseList = new ArrayList<>();
        for (Cat cat : catList) {
            catResponseList.add(new CatResponse(cat.getId(),cat.getName(), cat.getAge(), cat.getBreed()));
        }
        return catResponseList;
    }
    @PutMapping("/cats/{id}")
    public CatResponse updateCat(@RequestBody @Valid CatRequest catRequest, @PathVariable(value="id")String id){
        Cat cat =catService.updateCat(
                id,
                catRequest.getName(),
                catRequest.getAge(),
                catRequest.getCatBreed()
        );
        return new CatResponse(cat.getId(), cat.getName(), cat.getAge(), cat.getBreed());
    }
}








