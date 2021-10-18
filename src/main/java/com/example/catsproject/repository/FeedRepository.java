package com.example.catsproject.repository;

import com.example.catsproject.model.Feed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends CrudRepository <Feed, Long> {
}
