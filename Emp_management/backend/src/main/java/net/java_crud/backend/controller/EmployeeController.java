package net.java_crud.backend.controller;

import net.java_crud.backend.dto.EmployeeDto;
import net.java_crud.backend.entity.Employee;
import net.java_crud.backend.services.EmplyeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")  // ✅ This ensures the correct mapping
public class EmployeeController {

    private final EmplyeeService employeeService;

    public EmployeeController(EmplyeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping  // ✅ This will handle POST requests to /api/employees
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

}
