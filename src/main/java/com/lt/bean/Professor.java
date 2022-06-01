package com.lt.bean;

/** Represents an Admin.
 * @author group5
 
*/
public class Professor {

	private String profName;

	private String department;
	private String designation;


	/** Gets the professor department.
	 * @return A string representing the professor department
	 *     name.
	*/
	public String getDepartment() {
		return department;
	}

	/** Sets the professor department.
	 * @param department A String containing the professor
	 *     department name.
	*/
	public void setDepartment(String department) {
		this.department = department;
	}

	/** Gets the professor designation.
	 * @return A string representing the professor designation
	 *     name.
	*/
	public String getDesignation() {
		return designation;
	}

	/** Sets the professor designation.
	 * @param department A String containing the professor
	 *     designation name.
	*/
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/** Gets the professor Name.
	 * @return A string representing the professor 
	 *     name.
	*/
	public String getProfName() {
		return profName;
	}

	/** Sets the professor name.
	 * @param department A String containing the professor
	 *      name.
	*/
	public void setProfName(String profName) {
		this.profName = profName;
	}

}
