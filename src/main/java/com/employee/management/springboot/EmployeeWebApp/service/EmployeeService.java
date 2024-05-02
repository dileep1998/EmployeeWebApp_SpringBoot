package com.employee.management.springboot.EmployeeWebApp.service;

import com.employee.management.springboot.EmployeeWebApp.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
