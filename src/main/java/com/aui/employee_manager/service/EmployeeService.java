package com.aui.employee_manager.service;

import com.aui.employee_manager.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee getEmployee() {
        final var employee = new Employee("bob");
        return employee;
    }
}
