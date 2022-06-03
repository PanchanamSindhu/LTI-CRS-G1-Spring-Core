package com.lt.application;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.lt.bean.Admin;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.configuration.AdminConfig;
import com.lt.configuration.LoginConfig;
import com.lt.configuration.ProfessorConfig;
import com.lt.configuration.StudentConfig;
import com.lt.configuration.UserConfig;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.LoginFailedException;
import com.lt.service.AdminService;
import com.lt.service.LoginService;
import com.lt.service.ProfessorService;
import com.lt.service.StudentService;
import com.lt.bean.Login;

/**
 * The CRS program implements an Spring core application that simply allows the user to
 * perform Specific actions by taking Input from console.
 *
 * @author group5
 * @since 2022-06-02
 */

@SpringBootApplication
@ComponentScan({"com.lt.*"})
@EnableAutoConfiguration
@Configuration
@Import({ AdminConfig.class, StudentConfig.class, ProfessorConfig.class, UserConfig.class, LoginConfig.class })
public class LtCrsG5SpringCoreApplication {
	
	/**
	 * This is the main method which makes use of option select method.
	 * 
	 * @param args Unused.
	 * @return Nothing.
	 * 
	 */

	public static void main(String[] args) {
	
		ApplicationContext adminContext = SpringApplication.run(AdminConfig.class);
		AdminService adminObj = (AdminService) adminContext.getBean("adminBean");

		ApplicationContext studentContext = SpringApplication.run(StudentConfig.class);
		StudentService studentObj = (StudentService) studentContext.getBean("studentBean");
		

		ApplicationContext professorContext = SpringApplication.run(ProfessorConfig.class);
		ProfessorService professorObj = (ProfessorService) professorContext.getBean("professorBean");

		ApplicationContext loginContext = SpringApplication.run(LoginConfig.class);
		LoginService loginObj = (LoginService) loginContext.getBean("loginBean");

		System.out.println("********* Welocme to CRS Application *************\n");
		optionSelect(adminObj, studentObj, professorObj, loginObj);
	}
	
	
	/**
	 * This method is used display menu 
	 * @param unused
	 * @return nothing.
	 */
	public static void optionSelect(AdminService adminObj, StudentService studentObj, ProfessorService professorObj, LoginService loginObj) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Login :");
		System.out.println("2. New Registartion :");
		System.out.println("3. Forget Password :");
		System.out.println("4. Exit :");
		System.out.println("Pleace Select Your Choice :\n");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			login(adminObj, studentObj , professorObj ,loginObj);
			break;

		case 2:
			registration(adminObj, studentObj , professorObj ,loginObj);
			break;

		case 3:
			updatePassword(loginObj);
			break;

		case 4:
			Exit();
			break;

		}
	}

	/**
	 * This method is used to display login page. 
	 * @param unused
	 * @return nothing.
	 */
	public static void login(AdminService adminObj, StudentService studentObj, ProfessorService professorObj,LoginService loginObj){
		
		System.out.println("--Login Page---\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String userName = sc.next();
		System.out.println("Enter Password :");
		String password = sc.next();
		List<Login> loginList = loginObj.verifyLogin();
		for (Login login : loginList) {
			if (login.getUserName().equalsIgnoreCase(userName) && (password.equals(login.getPassword()))) {
				System.out.println("Login Successfull\n");
				if (login.getType().equalsIgnoreCase("Admin")) {
					adminObj.loginList();
				} else if (login.getType().equalsIgnoreCase("student")) {
					studentObj.studentMenu();
				} else if (login.getType().equalsIgnoreCase("Professor")) {
					professorObj.professorMenu();
				}

			}else {
				try {
					throw new LoginFailedException("InValid UserName and Password. Please Enter valid UserName and Password.\n");
				} catch (LoginFailedException e) {
					System.out.println(e);
				}
				optionSelect(adminObj, studentObj, professorObj, loginObj);
			}
		}

	}

	/**
	 * This method allows user to register  application. 
	 * @param unused
	 * @return nothing.
	 */
	public static void registration(AdminService adminObj, StudentService studentObj, ProfessorService professorObj, LoginService loginObj) {

		System.out.println(" Please enter you information ");
		loginObj.registration();

		login(adminObj, studentObj , professorObj ,loginObj);
	}

	/**
	 * This method allows user to update password.
	 * @param unused
	 * @return nothing.
	 */
	public static void updatePassword(LoginService loginObj) {

		System.out.println(" Enter you Id ");
		Scanner sc = new Scanner(System.in);
		double id = sc.nextDouble();
		loginObj.updatePassword(id);

	}
	
	/**
	 * This method is used to close application.
	 * @param unused
	 * @return nothing.
	 */
	private static void Exit() {
		System.out.println("Application Closed");

	}

}
