package com.aui.student_manager.service;

import com.aui.student_manager.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student getStudent() {
        final var student = new Student("bob");
        return student;
    }
}
