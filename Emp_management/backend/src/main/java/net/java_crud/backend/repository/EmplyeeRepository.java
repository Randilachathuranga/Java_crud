package net.java_crud.backend.repository;

import net.java_crud.backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Optional but recommended
public interface EmplyeeRepository extends JpaRepository<Employee,Long> {


}
