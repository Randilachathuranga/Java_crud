package net.java_crud.backend.mapper;

import net.java_crud.backend.dto.EmployeeDto;
import net.java_crud.backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee emp) {
        return new EmployeeDto(
                emp.getId(),
                emp.getFirstname(),
                emp.getLastname(),
                emp.getAge(),
                emp.getEmail(),
                emp.getJoinDate()        // Ensure 'date' exists in Employee entity
        );
    }

    public static Employee mapToEmployee(EmployeeDto empDto) {
        return new Employee(
                empDto.getId(),
                empDto.getFirstname(),
                empDto.getLastname(),
                empDto.getAge(),
                empDto.getEmail(),
                empDto.getJoinDate()     // Ensure 'date' exists in EmployeeDto
        );
    }
}
