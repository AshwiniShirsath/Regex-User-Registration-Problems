package com.bridgelabz.userregistration;
/*
 * @ author: Ashwini 
 * As a User need to enter a valid email - E.g. abc.xyz@bl.co.in
 * - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
 */
public class UserRegistrationMain {
	public static void main(String[] args) {
		// Create object of class
		ValidateUserInfo validateUserInfo = new ValidateUserInfo();
		// Method calling 
		validateUserInfo.checkFirstName();
		validateUserInfo.checkLastName();
		validateUserInfo.checkEmail();
	}
}
