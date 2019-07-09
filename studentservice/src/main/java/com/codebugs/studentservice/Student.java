package com.codebugs.studentservice;
import javax.xml.bind.annotation.*;

@XmlRootElement
public class Student {
	public String name;
	public int age;
	public double cgpa;
	
	Student(){
		this.name = "new student";
		this.age = 0;
		this.cgpa = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	
}
