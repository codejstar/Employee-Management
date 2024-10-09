package org.jagdeepjakhu.empmng;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controller {

    List<Employee> employees = new ArrayList<>();

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        // List<Employee> employees = new ArrayList<>();
        // Employee emp = new Employee();
        // emp.setName("Shivam");
        // employees.add(emp);
        // employees.add(null);
        return employees;
    }

    @PostMapping("employees")
    public String postMethodName(@RequestBody Employee employee) {
        employees.add(employee);

        return "add Successfully";
    }

}
