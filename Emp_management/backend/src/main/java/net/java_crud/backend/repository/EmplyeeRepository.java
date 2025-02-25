package net.java_crud.backend.repository;

import net.java_crud.backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplyeeRepository extends JpaRepository<Employee,Long> {


}
