package com.example.catsproject.repository;

import com.example.catsproject.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CatRepository extends JpaRepository <Cat,Long> {
}
