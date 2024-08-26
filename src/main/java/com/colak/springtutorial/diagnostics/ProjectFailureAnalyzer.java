package com.colak.springtutorial.diagnostics;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

@Slf4j
public class ProjectFailureAnalyzer implements FailureAnalyzer {


    @Override
    public FailureAnalysis analyze(Throwable failure) {
        return new FailureAnalysis("The application is failed to start", failure.getMessage(), failure);
    }
}
