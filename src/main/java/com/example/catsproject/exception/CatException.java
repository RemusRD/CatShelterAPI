package com.example.catsproject.exception;

public class CatException extends Exception { //Do not use checked exceptions, instead, extend RuntimeException
    public CatException() {
        super();
    }

    public CatException(String message) {
        super(message);
    }

    public CatException(String message, Throwable cause) {
        super(message, cause);
    }

    public CatException(Throwable cause) {
        super(cause);
    }

    protected CatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
