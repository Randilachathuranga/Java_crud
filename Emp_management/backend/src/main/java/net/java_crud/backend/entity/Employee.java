package net.java_crud.backend.entity;  // Defines the package where this class belongs

import jakarta.persistence.*;  // Imports JPA annotations for entity mapping
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter  // Generates getter methods for all fields
@Setter  // Generates setter methods for all fields
@NoArgsConstructor  // Generates a no-argument constructor
@AllArgsConstructor  // Generates a constructor with all fields as arguments
@Entity  // Marks this class as a JPA entity (maps to a database table)
@Table(name = "employees")  // Specifies the table name in the database

public class Employee {  // Defines the Employee entity class

    @Id  // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generates ID values using database identity strategy
    private Long id;  // Primary key field (unique identifier for each employee)

    @Column(name = "first_name")  // Maps this field to the 'first_name' column in the database
    private String firstname;  // Stores the employee's first name

    @Column(name = "last_name")  // Maps this field to the 'last_name' column in the database
    private String lastname;  // Stores the employee's last name

    @Column(name = "Age")  // Maps this field to the 'Age' column in the database
    private int age;  // Stores the employee's age

    @Column(name = "email", nullable = false, unique = true)  // Maps this field to the 'email' column, making it required and unique
    private String email;  // Stores the employee's email address

    @Column(name = "joindate")
    private LocalDate joinDate;
}
