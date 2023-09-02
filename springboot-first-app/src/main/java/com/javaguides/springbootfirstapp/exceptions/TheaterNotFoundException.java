package com.javaguides.springbootfirstapp.exceptions;

public class TheaterNotFoundException extends RuntimeException {
    public TheaterNotFoundException(Long theaterId) {
        super("Theater not found with ID: " + theaterId);
    }
}
