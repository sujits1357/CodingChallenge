package com.sphinix.challenge2;

import org.apache.log4j.Logger;

/**
 * @author Abhilash
 *
 */
public class EmployerDetails {

	public static void main(String args[]) {

		final Logger logger = Logger.getLogger(EmployerDetails.class);

		Employer employer1 = new Employer();
		employer1.setEmployerName("Sphinix Network Solutions INC");
		//load dummy data
		employer1.loadData();
		
		
		Employer employer2= null;
		try {
			employer2 = (Employer) employer1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		employer2.setEmployerName("HCL America");
		
		logger.debug("Employer 1 Hashcode " + employer1.getEmployee().hashCode());
		logger.debug("Employer 2 Hashcode " +employer2.getEmployee().hashCode());
		
		if(employer1.equals(employer2)) {
			logger.debug("Both employees are same");
		} else {
			logger.debug("Both employees are not same");
		}

	}

}