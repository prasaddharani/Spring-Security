package com.spring.security.controller;

import com.spring.security.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    List<Student> students = new ArrayList<>(
            List.of(new Student("1", "Dharani", "Java"),
                    new Student("2", "Prasad", "Python"))
    );


    @GetMapping
    private List<Student> getStudents() {
        return students;
    }


    @PostMapping("/add")
    private Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}
