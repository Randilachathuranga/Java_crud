package net.java_crud.backend.dto;

import java.time.LocalDate;

public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private LocalDate joinDate;

    // Constructor
    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String firstName, String lastName, int age, String email, LocalDate joinDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.joinDate = joinDate;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}