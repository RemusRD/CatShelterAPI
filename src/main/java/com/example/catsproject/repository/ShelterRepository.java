package com.example.catsproject.repository;

import com.example.catsproject.model.CatShelter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelterRepository extends JpaRepository<CatShelter,Long> {
}
