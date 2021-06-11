package com.app.service;

import com.app.model.Calculator;

public class CalculatorServiceImpl implements CalculatorService{
    Calculator calculator;

    @Override
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double sum() {
        return calculator.getFirstNumber()+calculator.getSecondNumber();
    }

    @Override
    public double sub() {
        return calculator.getFirstNumber()-calculator.getSecondNumber();
    }

    @Override
    public double multi() {
        return calculator.getFirstNumber()*calculator.getSecondNumber();
    }

    @Override
    public double div() {
        return calculator.getFirstNumber()/calculator.getSecondNumber();
    }
}
