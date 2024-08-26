package com.colak.springtutorial.service;

import org.springframework.stereotype.Service;

@Service
public class BrokenService {

    public BrokenService() {
        throw new IllegalArgumentException("Failed to construct a BrokenService, because...");
    }
}
