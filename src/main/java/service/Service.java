package service;

import model.Employee;
import repository.Repository;

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
