package net.java_crud.backend.services.impl;

import lombok.AllArgsConstructor;
import net.java_crud.backend.dto.EmployeeDto;
import net.java_crud.backend.entity.Employee;
import net.java_crud.backend.repository.EmplyeeRepository;
import net.java_crud.backend.mapper.EmployeeMapper;
import net.java_crud.backend.services.EmplyeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmplyeeService {

    private EmplyeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto empdto){

       Employee employee = EmployeeMapper.mapToEmployee(empdto);
       Employee saveEmployee = employeeRepository.save(employee);
       return EmployeeMapper.mapToEmployeeDto(saveEmployee);
    }
}
