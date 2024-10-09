package org.jagdeepjakhu.empmng;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(null);
        return employees;
    }

}
