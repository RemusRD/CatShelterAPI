package com.example.catsproject.controller;

import com.example.catsproject.model.Volunteer;
import com.example.catsproject.controller.request.VolunteerRequest;
import com.example.catsproject.service.VolunteerService;
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
    public Volunteer createVolunteer(@RequestBody @Valid VolunteerRequest volunteerRequest) {
        Volunteer newVolunteer = Volunteer
                .builder()
                .name(volunteerRequest.getName())
                .age(volunteerRequest.getAge())
                .sheltername(volunteerRequest.getSheltername())
                .build();

        return volunteerService.createVolunteer(newVolunteer);
    }
}
