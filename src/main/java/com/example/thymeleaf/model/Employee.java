package com.example.thymeleaf.model;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Employee {
    private long id;
    private String name;
    private String department;
}
