package com.example.hw.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorServices{


    @Override
    public int plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiple(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public double divide(Integer a, Integer b) {
        return (double) a / b;
    }

}
