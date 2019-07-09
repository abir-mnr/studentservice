package com.codebugs.studentservice;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(){
		System.out.print("getStudent called");
		Student s1 = new Student();
		s1.setName("Abir");
		s1.setAge(23);
		return s1;
	}
}
