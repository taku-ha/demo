package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cal")
public class CalculationController {
    
    @RequestMapping("")
    public String math() {
    return "calculation-form";
    }

    @RequestMapping("/add")
    public String execute(AdditionForm, Model model) {

        double num1 = Double.parseDouble(form.getNum1());
        double num2 = Double.parseDouble(form.getNum2());
        String operator = form.getOperator();
      
            case "+" -> num1 + num2;
           
       
            
        return "answer.calculation";
    }

}

