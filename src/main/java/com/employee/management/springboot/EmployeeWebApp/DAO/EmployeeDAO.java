package com.employee.management.springboot.EmployeeWebApp.DAO;

import com.employee.management.springboot.EmployeeWebApp.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
