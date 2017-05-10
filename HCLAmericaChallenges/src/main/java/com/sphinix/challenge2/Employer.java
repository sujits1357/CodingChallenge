package com.sphinix.challenge2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhilash
 *
 */
public class Employer implements Cloneable {

	private String employerName;
	private List<Employee> employee = new ArrayList<Employee>();

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	/**
	 * Load dummy data
	 */
	public void loadData() {

		for (int i = 1; i <= 10; i++) {
			Employee emp = new Employee();
			emp.setId(i);
			emp.setName(" Employee " + i);
			emp.setPhone(Long.parseLong("23234567") + i);
			emp.setAddress("NJ" + i);
			getEmployee().add(emp);

		}
	}

	@Override
	public String toString() {
		return "Employer [employerName=" + employerName + ", employee=" + employee + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null ) {
			return false;
		}
		
		Employer employer = (Employer) obj;
		
		return (employer.getEmployee() == this.getEmployee());
	}

}