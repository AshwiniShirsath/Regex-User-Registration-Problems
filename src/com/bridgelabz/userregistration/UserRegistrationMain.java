package com.bridgelabz.userregistration;
/*
 * @ author: Ashwini 
 * As a User need to follow pre defined Mobile Format.
 * Mobile Format - E.g. 91 9919819801 
 * - Country code follow by space and 10 digit number
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
	}
}