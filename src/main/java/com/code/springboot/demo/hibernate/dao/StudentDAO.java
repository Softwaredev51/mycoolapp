package com.code.springboot.demo.hibernate.dao;

import com.code.springboot.demo.hibernate.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer Id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    int updateAll();

    void delete(Integer id);

    int deleteAll();

}
