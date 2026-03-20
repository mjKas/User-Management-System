package com.backend.employeedetails.repository;

import com.backend.employeedetails.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Override
    default List<Employee> findAll() {
        return null;
    }

    @Override
    default List<Employee> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    default <S extends Employee> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Employee> findById(Long aLong) {
        return Optional.empty();
    }
}
