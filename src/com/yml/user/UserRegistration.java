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
	/**
	 * method to validate last name
	 * 
	 * @param last name -last name is passed as parameter
	 * @return
	 */
	
	public Boolean validateLastName(String LastName) {
		String string = "^[A-Z][a-z]{2}[a-z]*";
		Boolean result = Pattern.matches(string, LastName);
		return result;
	}
	
	public Boolean validateEmail(String email) {
		String string = "^[a-zA-z0-9]+?(.)[a-zA-Z0-9+_-]*@[a-zA-Z]+\\.[a-zA-z]{2,4}?(.)[A-za-z]*$";
		Boolean result = Pattern.matches(string, email);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		UserRegistration register = new UserRegistration();

		System.out.println("Enter Firstname which starts with Cap and has minimum 3 characters");
		String firstName = scanner.nextLine();
		Boolean firstNameCheck = register.validateFirstName(firstName);
		if (firstNameCheck) {
			System.out.println("Valid first name");
		} else
			System.out.println("Invalid first name");

		System.out.println("\nEnter last name which starts with Cap and has minimum 3 characters");
		String secondName = scanner.nextLine();

		Boolean secondNameCheck = register.validateLastName(secondName);
		if (secondNameCheck) {
			System.out.println("Valid last name");
		} else
			System.out.println("Invalid last name");
		System.out.println("Enter valid email");
		String email = scanner.nextLine();
		Boolean emailCheck = register.validateEmail(email);
		if (emailCheck) {
			System.out.println("Valid email");
		} else
			System.out.println("Invalid email");
	}
}