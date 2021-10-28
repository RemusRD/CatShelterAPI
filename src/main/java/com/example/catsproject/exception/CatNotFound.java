package com.example.catsproject.exception;

public class CatNotFound extends RuntimeException { // nice, this is the way :) 
    public CatNotFound(String message) {
        super(message);
    }
}
