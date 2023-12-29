package com.ty.creatingandhandlingcustomeexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@GetMapping("/save")
	public ResponseEntity<ResponseStucture<Student>> saveStudent(@RequestBody Student student)
	{
		
		String studentName=student.getStudentName();
		studentName=studentName+":"+studentName.length();
		
		student.setStudentName(studentName);
		
		ResponseStucture<Student> responseEntity=new ResponseStucture<Student>();
		responseEntity.setStatusCode(200);
		responseEntity.setMessage("success");
		responseEntity.setData(student);
		
		return new ResponseEntity<ResponseStucture<Student>>(responseEntity,HttpStatus.OK);
	
	
	}

}
