package com.backend.employeedetails.mapper;

import com.backend.employeedetails.dto.EmployeeDto;
import com.backend.employeedetails.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapEmpDto (Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    public static Employee mepToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
