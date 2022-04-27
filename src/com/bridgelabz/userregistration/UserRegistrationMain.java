package com.bridgelabz.userregistration;
/*
 * @ author: Ashwini 
 * User need to enter a valid First Name:
 * - First name starts with Cap and has minimum 3 characters
 */
public class UserRegistrationMain {
	public static void main(String[] args) {
		// Create object of class
		ValidateUserInfo validateUserInfo = new ValidateUserInfo();
		// Method calling to check Firstname
		validateUserInfo.checkFirstName();
	}
}
