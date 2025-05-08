package com.code.springboot.demo.mycoolapp;

import com.code.springboot.demo.mycoolapp.dao.StudentDAO;
import com.code.springboot.demo.mycoolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MycoolappApplication {
	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);
//			readStudent(studentDAO);
//			queryForStudent(studentDAO);
//			findUsingLastName(studentDAO);
//			updateStudent(studentDAO);
//			updateAllStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAll(studentDAO);
		};
	}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println("Deleting all Students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted rows :"+numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println("Delete Student Id: "+studentId);
		studentDAO.delete(studentId);
	}

	private void updateAllStudent(StudentDAO studentDAO) {
		System.out.println(studentDAO.updateAll());
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student theStudent = studentDAO.findById(1);
		theStudent.setFirstName("Alice");
		studentDAO.update(theStudent);
		System.out.println("Updated Student "+theStudent);
	}

	private void findUsingLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("bob");
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudent(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
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
