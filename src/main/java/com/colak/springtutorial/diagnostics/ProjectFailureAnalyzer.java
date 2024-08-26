package com.colak.springtutorial.diagnostics;

import com.colak.springtutorial.service.InsufficientMaxMemoryException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

@Slf4j
public class ProjectFailureAnalyzer extends AbstractFailureAnalyzer<InsufficientMaxMemoryException> {


    @Override
    public FailureAnalysis analyze(Throwable rootFailure, InsufficientMaxMemoryException exception) {
        return new FailureAnalysis("The application is failed to start", exception.getMessage(), exception);
    }
}
