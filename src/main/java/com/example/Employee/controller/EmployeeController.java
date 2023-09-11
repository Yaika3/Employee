package com.example.Employee.controller;

import com.example.Employee.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Employee.service.Service;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final Service service;
    public EmployeeController(Service service){this.service=service;}

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployee (){
        List<Employee> employees = service.getAll();
        return ResponseEntity.ok(employees);
    }
    @PostMapping
    public ResponseEntity<Employee> add (Employee employee){
        service.add(employee);
        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/id")
    public ResponseEntity<Employee> delete (Integer id){
        service.delete(id);
        return ResponseEntity.ok(null);
    }


}
