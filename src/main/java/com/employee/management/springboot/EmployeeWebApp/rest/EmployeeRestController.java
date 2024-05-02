package com.employee.management.springboot.EmployeeWebApp.rest;

import com.employee.management.springboot.EmployeeWebApp.Entity.Employee;
import com.employee.management.springboot.EmployeeWebApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService= theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId){
        Employee theEmployee = employeeService.findById(employeeId);
        return theEmployee;
    }


    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
        Employee dbemployee= employeeService.save(theEmployee);
        return dbemployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbemployee= employeeService.save(theEmployee);
        return dbemployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee theEmployee= employeeService.findById(employeeId);
        employeeService.deleteById(employeeId);
        return "Employee deleted from db";
    }

}
