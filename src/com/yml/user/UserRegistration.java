package com.yml.user; 

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	/**
	 * method to validate first name
	 * 
	 * @param firstName -first name is passed as parameter
	 * @return
	 */
	public Boolean validateFirstName(String firstName) {
		String matcher = "^[A-Z][a-z]{2}[a-z]*";
		Boolean check = Pattern.matches(matcher, firstName);
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		UserRegistration register = new UserRegistration();

		System.out.println("Enter first name");
		String firstName = scanner.nextLine();

		Boolean firstNameCheck = register.validateFirstName(firstName);
		if (firstNameCheck) {
			System.out.println("Valid first name");
		} else
			System.out.println("Invalid first name");
	}
}
