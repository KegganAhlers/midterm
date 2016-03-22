package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	private Enrollment () {
		
	}
	
	public Enrollment (UUID StudentID, UUID SectionID){
		EnrollmentID = UUID.randomUUID();
	}
	
	public void SetGrade(double Grade) {
		this.Grade = Grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

}
