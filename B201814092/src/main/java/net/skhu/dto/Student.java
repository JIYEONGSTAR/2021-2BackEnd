package net.skhu.dto;

public class Student {

	String name;
	String studentNumber;

	public Student(String name, String studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
