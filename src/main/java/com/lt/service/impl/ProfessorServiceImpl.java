package com.lt.service.impl;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.lt.application.LtCrsG5SpringCoreApplication;
import com.lt.service.ProfessorService;

/**
 * The class that implements from ProfessorService interface to provide body for unimplemented methods .
 * 
 * @author Group5
 * @since 05-31-2022
 */
@Service
public class ProfessorServiceImpl implements ProfessorService {

	@Override
	public void addGrades() {
		
	}
	
	/**
	 * This method allows user to view  registered students. 
	 * @param unused
	 * @return nothing.
	 */
	@Override
	public void viewRegisteredStudents() {
		StudentServiceImpl studentService=new StudentServiceImpl();
		studentService.viewStudents();

	}

	/**
	 * This method allows user to select  course. 
	 * @param unused
	 * @return nothing.
	 */
	@Override
	public void selectCourses() {
		CourseServiceImpl courseService = new CourseServiceImpl();
		courseService.CoursesList();

	}
	/**
	 * This method display  professor menu. 
	 * @param unused
	 * @return nothing.
	 */
	public  void professorMenu() {
		System.out.println("===== Professor Memu =====");
		System.out.println("Choose from following options:");
		System.out.println("--------------");
		System.out.println("1. View Teaching Courses : ");
		System.out.println("2. View Enrolled Student : ");
		System.out.println("3. Add Grades : ");
		System.out.println("4. Logout : ");
		
		System.out.println("Enter your Option : \n");
		Scanner sc= new Scanner(System.in);
		int profChoice=sc.nextInt();
		
		switch (profChoice) {
		case 1:
			selectCourses();
			professorMenu();
			break;

		case 2:
			viewRegisteredStudents();
			professorMenu();
			break;

		case 3:
			//addGrades();
			//professorMenu();
			//break;
		case 4:
			//LtCrsG5SpringCoreApplication.optionSelect();

		}	
		
	}

}
