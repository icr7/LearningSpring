package com.icr7.Rest.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icr7.Rest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	//define endpoints for "/students" -return list of students
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> theStudents= new ArrayList<>();
		theStudents.add(new Student("Ishwar","Singh"));
		theStudents.add(new Student("Mohit","Chaiser"));
		theStudents.add(new Student("Poornima","Patel"));
		return theStudents;
	}

}
