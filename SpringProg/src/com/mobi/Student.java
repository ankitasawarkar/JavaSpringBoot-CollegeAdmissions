package com.mobi;

import java.util.ArrayList;
import com.mobi.Address;

public class Student {
	private String StudentName;
	private String StudentHobby;
	private String StudentDOB;
	private String StudentMobileNo;
	private ArrayList<String> StudentSkills;
	private Address StudentAddress;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, String studentHobby, String studentDOB, String studentMobileNo,
			ArrayList<String> studentSkills, Address studentAddress) {
		super();
		StudentName = studentName;
		StudentHobby = studentHobby;
		StudentDOB = studentDOB;
		StudentMobileNo = studentMobileNo;
		StudentSkills = studentSkills;
		StudentAddress = studentAddress;
	}

	public Address getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		StudentAddress = studentAddress;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentHobby() {
		return StudentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		StudentHobby = studentHobby;
	}

	public String getStudentDOB() {
		return StudentDOB;
	}

	public void setStudentDOB(String studentDOB) {
		StudentDOB = studentDOB;
	}

	public String getStudentMobileNo() {
		return StudentMobileNo;
	}

	public void setStudentMobileNo(String studentMobileNo) {
		StudentMobileNo = studentMobileNo;
	}

	public ArrayList<String> getStudentSkills() {
		return StudentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		StudentSkills = studentSkills;
	}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentHobby=" + StudentHobby + ", StudentDOB=" + StudentDOB
				+ ", StudentMobileNo=" + StudentMobileNo + ", StudentSkills=" + StudentSkills + ", StudentAddress="
				+ StudentAddress + "]";
	}

}

