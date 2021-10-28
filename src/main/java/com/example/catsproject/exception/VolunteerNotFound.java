package com.example.catsproject.exception;

public class VolunteerNotFound  extends RuntimeException { //maybe you want to control this on the exception handler
    public VolunteerNotFound() {
        super("Volunteer Not Found,try again.");
    }
    public VolunteerNotFound(String message) {
        super(message);
    }
}
