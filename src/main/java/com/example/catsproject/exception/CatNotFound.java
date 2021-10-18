package com.example.catsproject.exception;

public class CatNotFound extends RuntimeException {
    public CatNotFound(String message) {
        super(message);
    }
}
