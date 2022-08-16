package com.aui.student_manager.controller;

import com.aui.student_manager.model.Student;
import com.aui.student_manager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    private final StudentService studentService;

    @Autowired
    public CommonController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/ping")
    private String ping() {
        return "pong";
    }

    @GetMapping("/api/v1/student")
    private Student sayHello() {
        return studentService.getStudent();
    }
}
