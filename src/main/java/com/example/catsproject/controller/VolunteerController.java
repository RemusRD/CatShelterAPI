package com.example.catsproject.controller;

import com.example.catsproject.model.CatShelter;
import com.example.catsproject.model.Volunteer;
import com.example.catsproject.request.CreateShelterRQ;
import com.example.catsproject.request.CreateVolunteerRQ;
import com.example.catsproject.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class VolunteerController {

    private final VolunteerService volunteerService;

    public VolunteerController(VolunteerService volunteerService) {

        this.volunteerService = volunteerService;
    }

    @PostMapping(value = "/volunteer", consumes = "application/json")
    public Volunteer createVolunteer(@RequestBody @Valid CreateVolunteerRQ createVolunteerRQ) {

        Volunteer newVolunteer = Volunteer
                .builder()
                .name(createVolunteerRQ.getName())
                .age(createVolunteerRQ.getAge())
                .sheltername(createVolunteerRQ.getSheltername())
                .build();

        return volunteerService.createVolunteer(newVolunteer);
    }
}
