package org.jagdeepjakhu.empmng;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee);

    List<Employee> readEmployees();

    boolean deleteEmployee(Long id);

    String UpdateEmployee(Long id, String employee);

    Employee UpdateEmployee(String id);

}
