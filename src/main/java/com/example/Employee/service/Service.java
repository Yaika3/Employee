package com.example.Employee.service;

import com.example.Employee.model.Employee;
import com.example.Employee.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service

public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void add (Employee employee){
        repository.save(employee);

    }
    public void delete(int id){
        repository.deleteById(id);
    }

    public List<Employee> getAll(){
        return  repository.findAll();
    }
}
