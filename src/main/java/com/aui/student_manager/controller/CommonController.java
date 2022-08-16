package com.aui.student_manager.controller;

import com.aui.student_manager.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/ping")
    private String ping(){
        return "pong";
    }

    @GetMapping("/")
    private Student sayHello(){
        final var student = new Student("bob");
        return student;
    }
}
