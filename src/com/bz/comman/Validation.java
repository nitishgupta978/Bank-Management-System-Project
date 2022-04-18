package com.bz.comman;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Validation {
	final static String CAP_LATTER ="^[A-Z].*";
	public static void CheckStartWithCap(String input) {
		
		Pattern pattern = Pattern.compile(CAP_LATTER);
		Matcher matcher = pattern.matcher(input);
		
		if(!matcher.find()) {
			System.out.println("Please Enter First CAP..");
		}
}
	final static String DIGIT_ONLY = "(91)?^{1}[6-9]+[0-9]{9}/z";
	public static void CheckAllDigit(String input) {
		
		Pattern pattern = Pattern.compile(DIGIT_ONLY);
		Matcher matcher = pattern.matcher(input);
		
		if(!matcher.find()) {
			System.out.println("Please Enter Valid Digit Mobile Number:");
		}
	}
	final static String ID_CHECK ="{1}[A-Za-z]|[@]|[0-9]";
	public static void CheckIdStartWithCapEndDigit(String input) {
		
		Pattern pattern = Pattern.compile(ID_CHECK);
		Matcher matcher = pattern.matcher(input);
		if(!matcher.find()) {
			System.out.println("Please Enter the Vailde the ID");
		}
	}
	
	final static String PASSWORD_CHECK ="{1}[A-Za-z]|[@,!,@,#,%.$.&.*]|[0-9]";
	public static void CheckpasswordStartWithCapEndDigit(String input) {
		
		Pattern pattern = Pattern.compile(PASSWORD_CHECK);
		Matcher matcher = pattern.matcher(input);
		if(!matcher.find()) {
			System.out.println("Please Enter the Vailde the Password");
		}
	}
	final static String EMAIL_CHECK ="{1}^[a-z]|[0-9]+[@,!,@,#,%.$.&.*]+gmail.com";
	public static void CheckEmailStartWithCapEndDigit(String input) {
		
		Pattern pattern = Pattern.compile(EMAIL_CHECK);
		Matcher matcher = pattern.matcher(input);
		if(!matcher.find()) {
			System.out.println("Please Enter the Vailde the Email");
		}
	}
	final static String ADDRESSID_CHECK ="^{1}[A-Za-z]|[0-9]";
	public static void CheckAddressStartWithCap(String input) {
		
		Pattern pattern = Pattern.compile(ADDRESSID_CHECK);
		Matcher matcher = pattern.matcher(input);
		if(!matcher.find()) {
			System.out.println("Please Enter the Vailde the AddressID");
		}
	}
	final static String USERNAME_CHECK ="{1}[A-Za-z]|[@]|[0-9]";
	public static void CheckUserNameStartWithCap(String input) {
		
		Pattern pattern = Pattern.compile(USERNAME_CHECK);
		Matcher matcher = pattern.matcher(input);
		if(!matcher.find()) {
			System.out.println("Please Enter the Vailde the UserNmae");
		}
	}
}



