package com.samplecode;

public class UserValidation {
	
	public static boolean validate(String userName,String password) {
		boolean status  = false;
		if("CodeWithJava".equals(userName) && "Code@123".equals(password))
			status = true ;
		return status;
	}
	
	public static void main(String[] args) {
		
		String userName = "CodeWithJava";
		String password = "Code@123";
		
		if(validate(userName,password)) {
			System.out.println("Welcome " + userName + " !!");
		}else {
			System.out.println("Invalid Username/Password, Try Again !!");
		}
	}

}