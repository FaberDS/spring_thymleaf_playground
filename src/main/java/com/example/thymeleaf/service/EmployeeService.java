package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
        List<Employee> listAllEmployees();
        void setEmployeeList(List<Employee> employeeList);
        void addEmployee(Employee employee);
}
