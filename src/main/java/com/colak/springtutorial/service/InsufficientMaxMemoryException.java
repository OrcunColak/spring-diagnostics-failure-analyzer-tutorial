package com.colak.springtutorial.service;

public class InsufficientMaxMemoryException extends RuntimeException {

    public InsufficientMaxMemoryException(String message) {
        super(message);
    }
}
