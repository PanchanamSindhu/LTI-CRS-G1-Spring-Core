/**
 * 
 */
package com.lt.dao;

import java.util.List;

import com.lt.bean.Login;

/**
 * Interface class that has the following methods.
 * 
 * @author Group5
 * @since 05-31-2022
 */
public interface LoginRegDaoInterface {
	
	public List<Login> verifyLogin();
	
	public void registration();
	
	public void updatePassword(double id);

}
