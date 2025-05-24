package com.postgresql.testdemo.service.impl;

import com.postgresql.testdemo.dto.EmployeeDto;
import com.postgresql.testdemo.entity.Employee;
import com.postgresql.testdemo.mapper.EmployeeMapper;
import com.postgresql.testdemo.repository.EmployeeRepository;
import com.postgresql.testdemo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    // Create Employee
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    // Get All Employees
    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(EmployeeMapper::mapToEmployeeDto)
                .collect(Collectors.toList());
    }

//    // Get Employee by ID
    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

//     Update Employee
    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + id));

        existingEmployee.setFirstName(employeeDto.getFirstName());
        existingEmployee.setLastName(employeeDto.getLastName());
        existingEmployee.setEmail(employeeDto.getEmail());

        Employee updatedEmployee = employeeRepository.save(existingEmployee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployee);
    }

    // Delete Employee
    @Override
    public void deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + id));
        employeeRepository.delete(employee);
    }
}
