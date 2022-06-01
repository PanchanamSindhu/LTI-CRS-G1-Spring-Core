package com.lt.exception;

public class CourseNotFoundException extends RuntimeException {
	

	public CourseNotFoundException(String errorMessage) {  
	    super(errorMessage); 

}
}
