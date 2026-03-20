package com.backend.employeedetails.service;

import com.backend.employeedetails.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long Id);
}
