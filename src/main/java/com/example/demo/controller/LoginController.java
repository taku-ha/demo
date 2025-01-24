package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private HttpSession session;


    @RequestMapping("")
    public String index() {

        return "login-form";
    }

    @RequestMapping("/result")
    public String inputAddress(String address, String pass) {
        session.setAttribute("address", address);
        session.setAttribute("pass", pass);
     
         if(address.equals("test@example.com") && pass.equals("123")) {
            return "login-result";  
        }else {
            return "login-form";
        }
    
    }

    @RequestMapping("/mypage")
    public String myPage() {
        return "mypage";
    }
}
