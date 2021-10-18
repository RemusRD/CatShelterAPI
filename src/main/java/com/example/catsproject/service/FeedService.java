package com.example.catsproject.service;

import com.example.catsproject.repository.FeedRepository;
import org.springframework.stereotype.Service;

@Service
public class FeedService {

    private final FeedRepository feedRepository;

    public FeedService(FeedRepository feedRepository) {

        this.feedRepository = feedRepository;
    }
}

