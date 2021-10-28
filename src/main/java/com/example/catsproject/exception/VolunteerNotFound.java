package com.example.catsproject.exception;

public class VolunteerNotFound  extends RuntimeException {
    public VolunteerNotFound() {
        super("Volunteer Not Found,try again.");
    }
    public VolunteerNotFound(String message) {
        super(message);
    }
}
