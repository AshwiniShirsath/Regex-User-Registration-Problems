package com.bridgelabz.userregistration;
/*
 * @ author: Ashwini 
 * As a User need to follow pre-defined Password rules.
 * Rule3 – Should have at least 1 Upper Case & 1 Number
 */
public class UserRegistrationMain {
	public static void main(String[] args) {
		// Create object of class
		ValidateUserInfo validateUserInfo = new ValidateUserInfo();
		// Method calling 
		validateUserInfo.checkFirstName();
		validateUserInfo.checkLastName();
		validateUserInfo.checkEmail();
		validateUserInfo.checkMobileNumber();
		validateUserInfo.checkPassword();
	}
}
