package com.app.service;

import com.app.model.Calculator;

public interface CalculatorService {
    void setCalculator(Calculator calculator);
    double sum();
    double sub();
    double multi();
    double div();
}
