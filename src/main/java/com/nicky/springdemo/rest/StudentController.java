package com.nicky.springdemo.rest;

import com.nicky.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Sarah", "Bella"));
        theStudents.add(new Student("Mary", "Joan"));
    }

    // Define an endpoint for Getting Students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    // Define an endpoint for retrieving a single student
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // Check if there is id
        if ((studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }
}
