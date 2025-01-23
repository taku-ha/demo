package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveForm;

@Controller
@RequestMapping("/receive")
public class ReceiveController {

    @RequestMapping
    public String index() {
        return "info-form";
    }

    @RequestMapping("/recieve-info")
    public String receiveInfo(ReceiveForm recieveForm) {
        System.out.println(recieveForm.getName());
        System.out.println(recieveForm.getAge());
        return "finished";
    }

}
