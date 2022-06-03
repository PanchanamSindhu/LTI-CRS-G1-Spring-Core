package com.lt.bean;

public class Course {

	private String courseCode;
	private String courseName;
	private boolean isOffered;
	private String instructor;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public boolean isOffered() {
		return isOffered;
	}

	public void setOffered(boolean isOffered) {
		this.isOffered = isOffered;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", isOffered=" + isOffered
				+ ", instructor=" + instructor + "]";
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

}
