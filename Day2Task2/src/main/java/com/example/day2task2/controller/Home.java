package com.example.day2task2.controller;

import com.example.day2task2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student = new StudentModel();
        student.setId(73);
        student.setName("Yash");
        student.setEmail("maheshwariy077@gmail.com");
        return student;
    }
}
