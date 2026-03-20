package com.backend.employeedetails.controller;

import com.backend.employeedetails.dto.EmployeeDto;
import com.backend.employeedetails.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;
    //Save Employee
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
       EmployeeDto savedEmpDto =  employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmpDto, HttpStatus.CREATED);
    }
    //Get Employee By ID
}
