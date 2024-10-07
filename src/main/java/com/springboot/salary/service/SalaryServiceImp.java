package com.springboot.salary.service;

import com.springboot.salary.model.Salary;
import com.springboot.salary.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SalaryServiceImp implements SalaryService{

    @Autowired
    private SalaryRepository repository;

    @Override
    public Salary saveSalary(Salary salary) {
        return repository.save(salary);
    }

    @Override
    public Optional<Salary> findSalary(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteSalary(Long id) {
        repository.deleteById(id);
    }
}
