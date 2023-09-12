package com.example.Employee.repository;

import com.example.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Employee, Integer> {
    //нужен ли GROUP BY
    @Query(value = "SELECT AVG(Salary) FROM Employee HAVING MIN(department) > 1" , nativeQuery = true)
    @Query(value = "SELECT MAX(Salary) FROM Employee HAVING MIN(department) > 1" , nativeQuery = true)

    List<Employee> getAVGEmployee (){};
}

