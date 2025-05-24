package com.postgresql.testdemo.service;

import com.postgresql.testdemo.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    // Create an employee
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    // Get all employees
    List<EmployeeDto> getAllEmployees();

    // Get employee by ID
    EmployeeDto getEmployeeById(Long id);

    // Update employee
    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    // Delete employee
    void deleteEmployee(Long id);
}
