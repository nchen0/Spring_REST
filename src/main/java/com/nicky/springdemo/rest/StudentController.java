package com.nicky.springdemo.rest;

import com.nicky.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    // Define an endpoint for Getting Students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Sarah", "Bella"));
        theStudents.add(new Student("Mary", "Joan"));
        return theStudents;
    }
}
