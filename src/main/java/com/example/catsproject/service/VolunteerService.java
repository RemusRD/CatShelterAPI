package com.example.catsproject.service;

import com.example.catsproject.model.Volunteer;
import com.example.catsproject.repository.VolunteerRepository;
import org.springframework.stereotype.Service;

@Service
public class VolunteerService {

    private final VolunteerRepository volunteerRepository;

    public VolunteerService(VolunteerRepository volunteerRepository) {

        this.volunteerRepository = volunteerRepository;
    }

    public Volunteer createVolunteer(Volunteer newVolunteer) {
        return volunteerRepository.save(newVolunteer);
    }
}
