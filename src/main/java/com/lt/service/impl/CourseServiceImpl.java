package com.lt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lt.dao.CourseDao;
import com.lt.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	CourseDao courseDao=new CourseDao();
	
	@Override
	public void CoursesList() {
		List<String> courses=new ArrayList<String>();
		courses=courseDao.ListOfCourses();
		System.out.println("Available Courses :"+ courses+"\n");
	}

	@Override
	public Void AllCoursesList() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
