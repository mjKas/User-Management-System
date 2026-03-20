package com.backend.employeedetails.service.impl;

import com.backend.employeedetails.dto.EmployeeDto;
import com.backend.employeedetails.entity.Employee;
import com.backend.employeedetails.exception.ResourceNotFoundException;
import com.backend.employeedetails.mapper.EmployeeMapper;
import com.backend.employeedetails.repository.EmployeeRepository;
import com.backend.employeedetails.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
//here AllArgsConstructor is needed to pass the objects of EmployeeRepository. If not using Lambok AllargsConstructor make an EmployeeService constructor and pass repository within.
public class EmployeeServiceImpl implements EmployeeService {
   private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mepToEmployee(employeeDto);
        Employee  savedEmp = employeeRepository.save(employee);
        return EmployeeMapper.mapEmpDto(savedEmp);
    }

    @Override
    public EmployeeDto getEmployeeById(Long Id) {
       Employee employee =  employeeRepository.findById(Id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee does not exists with the given ID: " +Id));
        return EmployeeMapper.mapEmpDto(employee);
    }
}
