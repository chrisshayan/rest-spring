package com.chrisshayan.spring.example.restspring.payroll;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(final Long id) {
        super("Could not find employee id:" + id);
    }
}
