
package com.code.springdatajpa.service;
import com.code.springdatajpa.dao.EmployeeRepository;
import com.code.springdatajpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository theEmployeeRepository){
        employeeRepository = theEmployeeRepository;
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee findById(int theId){
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee theEmployee = null;
        if(result.isPresent()){
            theEmployee = result.get();
        }
        return theEmployee;
    }

    public Employee save(Employee theEmployee){
        return employeeRepository.save(theEmployee);
    }

    public void deleteById(int theId){
        System.out.println("Spring Data JPA");
        employeeRepository.deleteById(theId);
    }
}
