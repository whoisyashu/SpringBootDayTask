package com.example.day2task2.controller;

import com.example.day2task2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {

    @GetMapping("/")
    public ArrayList<StudentModel> getStudent() {
        ArrayList<StudentModel> students = new ArrayList<>();
        students.add(new StudentModel(1, "Yash", "maheshwariy077@gmail.com"));
        students.add(new StudentModel(2, "Yashasvi", "maheshwariy076@gmail.com"));
        students.add(new StudentModel(3, "YashRaj", "maheshwariy075@gmail.com"));
        students.add(new StudentModel(4, "Yogendra", "maheshwariy074@gmail.com"));
        students.add(new StudentModel(5, "Yuvraj", "maheshwariy073@gmail.com"));
        return students;
    }

    @GetMapping("/student/{id}")
    public StudentModel getStudentById(@PathVariable int id) {
        ArrayList<StudentModel> students = getStudent();

        for (StudentModel student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
