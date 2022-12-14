package com.example.hw.controller;


import com.example.hw.model.Employee;
import com.example.hw.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee/")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public String welcome() {
        return "<h1> Добро подаловать <H1>";}

    @GetMapping
    public boolean completeCollection() {
        return employeeService.completeCollection();
    }
    @GetMapping("/printAll")
    public List<Employee> printAllEmployee() {
        return employeeService.printAll();
    }
    @GetMapping("/add")
    public boolean add (@RequestParam String name,
                        @RequestParam String surname){
        return employeeService.add(name, surname);
    }
    @GetMapping("/remove")
    public boolean remove(@RequestParam String name,
                           @RequestParam String surname) {
        return employeeService.remove(name, surname);
    }
    @GetMapping("/search")
    public Employee search(@RequestParam String name,
                @RequestParam String surname){
            return employeeService.search(name, surname);
    }
}
