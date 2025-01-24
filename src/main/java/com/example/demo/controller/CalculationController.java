package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.AdditionForm;

@Controller
@RequestMapping("/calc")
public class CalculationController {

    @RequestMapping("")
    public String index() {
        return "calculation-form";
    }

    @RequestMapping("/answer")
    public String calcAnswer(AdditionForm add, Model model) {
    
        int num1 = add.getintNum1();
        int num2 = add.getintNum2();
        int answer = num1 + num2;

        model.addAttribute("number1", num1);
        model.addAttribute("number2", num2);
        model.addAttribute("result", answer);

        return "answer";
    }
    
    

}
