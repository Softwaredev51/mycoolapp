package com.code.springboot.demo.mycoolapp;

import com.code.springboot.demo.mycoolapp.dao.StudentDAO;
import com.code.springboot.demo.mycoolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MycoolappApplication {
	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
//			createMultipleStudents(studentDAO);
			readStudent(studentDAO);

		};
	}

	private void readStudent(StudentDAO studentDAO) {
		Student myStudent = studentDAO.findById(1);
		System.out.println("Found "+myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating multiple students");
		Student tempStudent1 = new Student("Alice","Joe","alice@gmail.com");
		Student tempStudent2 = new Student("Joe","Bob","bob@gmail.com");
		System.out.println("Saving the students");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		System.out.println("Generated Student id "+ tempStudent1.getId());
		System.out.println("Generated Student id "+ tempStudent2.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new Student");
		Student tempStudent = new Student("paul","doe","paul@gmail.com");
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);
		System.out.println("Generated Student id "+ tempStudent.getId());
	}

}
