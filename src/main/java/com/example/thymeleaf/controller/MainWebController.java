package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Employee;
import com.example.thymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainWebController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping({"/","index"})
    public String getIndex(Model model){
        model.addAttribute("employees",employeeService.listAllEmployees() );
        model.addAttribute("pageTitle","Awesome page");

/*

        model.addAttribute("message", "This is the Message");
        model.addAttribute("description", "This is the description for the message");

        model.addAttribute("name","TEST");
        model.addAttribute("condition",Boolean.TRUE);
        model.addAttribute("role","a");
        model.addAttribute("students", List.of("John","Peter","Frank"));
        */
        return "index";
    }

}
