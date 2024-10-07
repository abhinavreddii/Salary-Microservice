package com.springboot.salary.controller;

import com.springboot.salary.model.Salary;
import com.springboot.salary.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/salary")
public class SalaryController {

    @Autowired
    private SalaryService service;

    @PostMapping("/save")
    public Salary saveSalary(@RequestBody Salary salary) {
        return service.saveSalary(salary);
    }

    @GetMapping("/find/{id}")
    public Optional<Salary> findSalary(@PathVariable Long id) {
        return service.findSalary(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSalary(@PathVariable Long id) {
        service.deleteSalary(id);
    }

}
