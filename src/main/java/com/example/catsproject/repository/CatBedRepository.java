package com.example.catsproject.repository;

import com.example.catsproject.model.CatBed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatBedRepository extends JpaRepository <CatBed, Long> {
}
