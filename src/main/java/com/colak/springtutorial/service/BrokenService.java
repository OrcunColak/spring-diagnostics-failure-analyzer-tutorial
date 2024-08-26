package com.colak.springtutorial.service;

import org.springframework.stereotype.Service;

@Service
public class BrokenService {

    public BrokenService() {
        throw new InsufficientMaxMemoryException("Failed to construct a BrokenService, because...");
    }
}
