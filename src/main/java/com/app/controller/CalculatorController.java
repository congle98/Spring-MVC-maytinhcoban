package com.app.controller;

import com.app.model.Calculator;
import com.app.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;
    @GetMapping("")
    public String input(){
        return "index";
    }
    @PostMapping("/result")
    public ModelAndView result(String firstNumber, String  secondNumber, String cal){
        String result = "không hợp lệ";
        ModelAndView modelAndView = new ModelAndView("index");
        try {
            double firstNumber_ = Double.parseDouble(firstNumber);
            double secondNumber_ = Double.parseDouble(secondNumber);
            calculatorService.setCalculator(new Calculator(firstNumber_,secondNumber_));
            switch (cal){
                case "+":
                    result = String.valueOf(calculatorService.sum());
                    break;
                case "-":
                    result = String.valueOf(calculatorService.sub());
                    break;
                case "*":
                    result = String.valueOf(calculatorService.multi());
                    break;
                case "/":
                    result = String.valueOf(calculatorService.div());
                    break;
            }
            modelAndView.addObject("result",result);
        }catch (Exception ex){
            modelAndView.addObject("result",result);
        }
        return modelAndView;
    }
}
