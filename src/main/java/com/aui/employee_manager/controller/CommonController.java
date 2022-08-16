package com.aui.employee_manager.controller;

import com.aui.employee_manager.model.Employee;
import com.aui.employee_manager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    private final EmployeeService employeeService;

    @Autowired
    public CommonController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/ping")
    private String ping() {
        return "pong";
    }

    @GetMapping("/api/v1/employee")
    private Employee sayHello() {
        return employeeService.getEmployee();
    }
}
