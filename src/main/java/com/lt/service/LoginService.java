package com.lt.service;

import java.util.List;

import com.lt.bean.Login;

public interface LoginService {
	
public List<Login> verifyLogin();
	
	public void registration();
	
	public void updatePassword(double id);

}
