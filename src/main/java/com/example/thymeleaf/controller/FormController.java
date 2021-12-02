package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Employee;
import com.example.thymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class FormController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/form","index_form"})
    public String getIndex(Model model){
        model.addAttribute("allDepartments", List.of("Finance","Research","Sales","Operations"));
        model.addAttribute("employee", new Employee());

        return "index_form";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee, Model model){
        System.out.println(employee);
        employeeService.addEmployee(employee);
        return "fragments/success";
    }
}
