package com.example.hw.service;

import com.example.hw.model.Employee;

import java.util.List;

public interface EmployeeService {


    public List<Employee> printAll();
    public boolean remove(String name, String surname);

    public boolean completeCollection();
    public Employee search(String name, String surname);
    public boolean add(String name, String surname);
}
