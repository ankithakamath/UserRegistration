package com.yml.user;

import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		String[] valid = new String[] { "abc.xyz@bridgelabz.co.in", "abc@yahoo.com", "abc-100@yahoo.com",
				"abc.100@yahoo.com", "abc111@yahoo.com", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com",
				"abc+100@gmail.com", "abc.xyz@bridgelabz.co.in" };

		String[] invalid = new String[] { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
				".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
				"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

		String pattern = "^[a-zA-Z+_]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}+\\.?[a-zA-Z-_]*";

		for (int i = 0; i < 10; i++) {
			System.out.print(valid[i]);
			System.out.println(Pattern.matches(pattern, valid[i]));
		}
		System.out.println("******");
		for (int i = 0; i < 13; i++) {
			System.out.println(Pattern.matches(pattern, invalid[i]));
		}
	}
}
