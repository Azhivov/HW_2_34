package com.example.hw.controller;


import com.example.hw.services.CalculatorServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequiredArgsConstructor
    @RequestMapping("calculator")
    public class CalculatorControler {
        private final CalculatorServices calculatorService;

        @GetMapping("/plus")
        public String plus(@RequestParam(name = "num1") Integer a,
                           @RequestParam(name = "num2") Integer b){
            int plus = calculatorService.plus(a, b);
            return a + " + " + b + " = " + plus;

        }
        @GetMapping("/minus")
        public String minus(@RequestParam(name = "num1") Integer a,
                            @RequestParam(name = "num2") Integer b){
            int minus = calculatorService.minus(a, b);
            return a + "-" + b + " = " + minus;

        }
        @GetMapping("/multiple")
        public String multiple(@RequestParam(name = "num1") Integer a,
                               @RequestParam(name = "num2") Integer b){
            int multiple =  calculatorService.multiple(a, b);
            return a + " * " + b + " = " + multiple;

        }
        @GetMapping("/divide")
        public String divide(@RequestParam(name = "num1") Integer a,
                             @RequestParam(name = "num2") Integer b){
            double divide = calculatorService.divide(a, b);
            return a + " /g " + b + " = " + divide;

        }
}
