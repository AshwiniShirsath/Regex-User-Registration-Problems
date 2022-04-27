package com.bridgelabz.userregistration;
/*
 * @ author: Ashwini 
 * User need to enter a valid Last Name:
 * - Last name starts with Cap and has minimum 3 characters
 */
public class UserRegistrationMain {
	public static void main(String[] args) {
		// Create object of class
		ValidateUserInfo validateUserInfo = new ValidateUserInfo();
		// Method calling 
		validateUserInfo.checkFirstName();
		validateUserInfo.checkLastName();
	}
}
