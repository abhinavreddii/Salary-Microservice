package com.springboot.salary.service;

import com.springboot.salary.model.Salary;

import java.util.Optional;

public interface SalaryService {
    Salary saveSalary(Salary salary);
    Optional<Salary> findSalary(Long id);
    void deleteSalary(Long id);
}
