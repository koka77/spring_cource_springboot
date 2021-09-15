package org.udemyspringcource.somov.spring.springboot.spring_cource_springboot.service;

import org.udemyspringcource.somov.spring.springboot.spring_cource_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deletEmployee(int id);
}
