package com.postgresql.testdemo.repository;

import com.postgresql.testdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//Jpa repository is inherited all the database functions like all CRUD

}
