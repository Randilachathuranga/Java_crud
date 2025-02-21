package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //http://localhost:8080/students
    @GetMapping("/students") // Changed endpoint to `/students`
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Randila", "Chathuranga"));
        students.add(new Student(2, "John", "Doe"));

        return students; // Return list of students
    }

    //spring boot rest API with path variable
    //http://localhost:8080/students/1
    @GetMapping("/students/{id}")
    public Student studentPathvariable(@PathVariable("id") int id){
        return new Student(id,"Bhagi","Randi");
    }

    // Spring Boot REST API with Request Param
    // Example: http://localhost:8080/students/query?id=1
    @GetMapping("/students/query") // Added leading `/` for clarity
    public Student getStudentById(@RequestParam(name = "id", required = true) int id) {
        return new Student(id, "Randila", "Chathuranga");
    }

}
