package com.prathamesh.JAVAJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.prathamesh.JAVAJDBC.model.Student;
import com.prathamesh.JAVAJDBC.repo.StudentRepo;

@SpringBootApplication
public class JavajdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JavajdbcApplication.class, args);

		Student s1 = context.getBean(Student.class);

		s1.setId(1);
		s1.setName("Prathamesh");
		s1.setDepartment("Compuer Science");

		StudentRepo sr = context.getBean(StudentRepo.class);

		sr.saveStudent(s1);
		System.out.println(sr.findAll());
	}

}
