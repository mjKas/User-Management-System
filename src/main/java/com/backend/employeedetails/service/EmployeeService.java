package com.backend.employeedetails.service;

import com.backend.employeedetails.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long Id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long emlpoyeeId, EmployeeDto updatedEmp);
}
