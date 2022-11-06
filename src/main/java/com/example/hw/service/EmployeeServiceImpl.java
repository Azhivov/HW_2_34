package com.example.hw.service;

import com.example.hw.exception.EmployeeNotFoundException;
import com.example.hw.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> printAll() {
        return employees;
    }

    @Override
    public boolean remove(String name, String surname) {
        Employee forRemove = new Employee(name, surname);
        if (employees.remove(forRemove)) {
            return true;
        }
        throw new EmployeeNotFoundException("Сорудник не найден!");
    }

    @Override
    public boolean completeCollection() {
        employees.add(new Employee("Петров", "Вася"));
        employees.add(new Employee("Васечкин", "Петя"));
        employees.add(new Employee("Миша", "Иванов"));
        employees.add(new Employee("Иван", "Михайлов"));
        employees.add(new Employee("Сидоров", "Сергей"));
        employees.add(new Employee("Данилова", "Лиза"));
        return true;
    }

    public Employee search(String name, String surname) {
        Employee employeeForSearch = new Employee(name, surname);
        if (employees.contains(employeeForSearch)) {
            return employeeForSearch;
        }
        throw new EmployeeNotFoundException("Сорудник не найден!");

    }

    @Override
    public boolean add(String name, String surname) {
        Employee forRemove = new Employee(name, surname);
        if (employees.contains(forRemove)) {
            throw new EmployeeNotFoundException("Сорудник не найден!");
        }
        return employees.add(new Employee(name, surname));
    }
}



