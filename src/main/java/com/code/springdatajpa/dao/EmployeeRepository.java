package com.code.springdatajpa.dao;

import com.code.springdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//for spring data rest no need of rest controller and service comment those files and add the dependency for spring data rest
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="members") //spring data rest custom endpoint
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
