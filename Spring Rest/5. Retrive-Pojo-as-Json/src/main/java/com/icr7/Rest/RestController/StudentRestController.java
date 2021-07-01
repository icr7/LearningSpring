package com.icr7.Rest.RestController;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icr7.Rest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	List<Student> theStudents;

	// define @PopstConstruct to load the student data..
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		theStudents.add(new Student("Ishwar", "Singh"));
		theStudents.add(new Student("Mohit", "Chaiser"));
		theStudents.add(new Student("Poornima", "Patel"));
	}

	// define endpoints for "/students" -return list of students

	@GetMapping("/students")
	public List<Student> getStudents() {

		return theStudents;
	}

}
