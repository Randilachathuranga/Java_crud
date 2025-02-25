package net.java_crud.backend.mapper;

import net.java_crud.backend.dto.EmployeeDto;
import net.java_crud.backend.entity.Employee;

public final class EmployeeMapper { // Final to prevent instantiation

    private EmployeeMapper() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static EmployeeDto mapToEmployeeDto(Employee emp) {
        return new EmployeeDto(
                emp.getId(),
                emp.getFirstName(),  // Corrected naming
                emp.getLastName(),   // Corrected naming
                emp.getAge(),
                emp.getEmail(),
                emp.getJoinDate()
        );
    }

    public static Employee mapToEmployee(EmployeeDto empDto) {
        return new Employee(
                empDto.getId(),
                empDto.getFirstName(),  // Corrected naming
                empDto.getLastName(),   // Corrected naming
                empDto.getAge(),
                empDto.getEmail(),
                empDto.getJoinDate()
        );
    }
}
