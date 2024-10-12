package org.jagdeepjakhu.empmng;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// import java.util.ArrayList;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controller {

    // List<Employee> employees = new ArrayList<>();
    // @Autowired
    EmployeeService employeeService = new EmployeeServiceImpl();

    // Dependcy Injection //IOC container for new object
    // @Autowired
    // EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        // employees.add(employee);
        return employeeService.createEmployee(employee);
        // return "add Successfully";
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id)) {
            return "Delete ";
        } else {
            return "Not found";
        }
    }
}

// List<Employee> employees = new ArrayList<>();
// Employee emp = new Employee();
// emp.setName("Shivam");
// employees.add(emp);
// employees.add(null);