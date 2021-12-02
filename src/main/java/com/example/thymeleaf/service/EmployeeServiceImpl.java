package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements   EmployeeService{
    private List<Employee> employeeList = new ArrayList<>();
    public EmployeeServiceImpl() {
        employeeList.add(new Employee(1,"Franz","Müller"));
        employeeList.add(new Employee(2,"Herbert","Rainer"));
        employeeList.add(new Employee(3,"Alex","Walter"));

    }
    @Override
    public List<Employee> listAllEmployees() {
        return employeeList;
    }

    @Override
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
}
