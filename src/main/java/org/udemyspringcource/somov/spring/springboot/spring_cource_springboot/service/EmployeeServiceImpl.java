package org.udemyspringcource.somov.spring.springboot.spring_cource_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.udemyspringcource.somov.spring.springboot.spring_cource_springboot.dao.EmployeeDao;
import org.udemyspringcource.somov.spring.springboot.spring_cource_springboot.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//        employeeDao.saveEmployee(employee);
//    }
//
//    @Override
//    @Transactional
//    public Employee getEmployee(int id) {
//        return employeeDao.getEmployee(id);
//    }
//
//    @Override
//    @Transactional
//    public void deletEmployee(int id) {
//        employeeDao.deletEmployee(id);
//    }
}
