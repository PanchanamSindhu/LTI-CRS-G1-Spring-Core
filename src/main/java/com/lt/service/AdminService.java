package com.lt.service;

import java.util.List;

import com.lt.bean.Course;



/**
 * Interface class that has the following methods.
 * 
 * @author Group5
 * @since 05-31-2022
 */
public interface AdminService {

	public void addProfessor();

	public void approveStudents();

	public void generateReportCard();

	public void addCourse();
	
	public void removeCourse();
	
	public void loginList();

}
