package com.backend.employeedetails.controller;

import com.backend.employeedetails.dto.EmployeeDto;
import com.backend.employeedetails.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    //Save Employee
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmpDto = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmpDto, HttpStatus.CREATED);
    }

    //Get Employee By ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long empId) {
        EmployeeDto employeeDto = employeeService.getEmployeeById(empId);
        System.out.println("Controller hit with ID: " + empId);
        return ResponseEntity.ok(employeeDto);
    }

    //Get all users as a list
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployee() {
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }
    //Update user
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<EmployeeDto> updateEmployee( @PathVariable("id") Long id, @RequestBody EmployeeDto employeedto) {
        EmployeeDto updatedDTO = employeeService.updateEmployee(id, employeedto);
               return new ResponseEntity<>(updatedDTO, HttpStatus.ACCEPTED);
    }

}
