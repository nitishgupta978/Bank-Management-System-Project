package com.bz.controller;

import java.util.Scanner;
import com.bz.comman.Validation;
import com.bz.interfaces.ICustomerService;
import com.bz.model.Customer;
import com.bz.services.CustomerServiceImpl;

public class BankManagementApp {
	static Scanner scanner= new Scanner(System.in);
	
	static ICustomerService customerService = new CustomerServiceImpl();
	public static void registerCustomer() {

		Customer customer = new Customer();
//		System.out.println("Enter the Id");
//		String id = scanner.next();
//		Validation.CheckIdStartWithCapEndDigit(id);
//		customer.setId(id);
		
		System.out.println("Enter the firstName");
		String firstName = scanner.next();
		Validation.CheckStartWithCap(firstName);
		customer.setFirstName(firstName);
		
		System.out.println("Enter the middleName");
		String middleName = scanner.next();
		Validation.CheckStartWithCap(middleName);
		customer.setMiddleName(middleName);
		
		System.out.println("Enter the lastName");
		String lastName = scanner.next();
		Validation.CheckStartWithCap(lastName);
		customer.setLastName(lastName);
		
		System.out.println("Enter the mobileNo");
		String mobileNo = scanner.next();
		Validation.CheckAllDigit(mobileNo);;
		customer.setMobileNo(mobileNo);
		
		System.out.println("Enter the username");
		String username = scanner.next();
		Validation.CheckUserNameStartWithCap(username);
		customer.setUsername(username);
		
		System.out.println("Enter the password");
		String password = scanner.next();
		Validation.CheckpasswordStartWithCapEndDigit(password);
		customer.setPassword(password);
		
		System.out.println("Enter the email");
		String email = scanner.next();
		Validation.CheckEmailStartWithCapEndDigit(email);
		customer.setEmail(email);
		
		System.out.println("Enter the addressId");
		String addressId = scanner.next();
		Validation.CheckAddressStartWithCap(addressId);
		customer.setAddressId( addressId);
		
		System.out.println("customer"+ customer);
		customerService.add(customer);
	
	}
	
	private static void showAllCustomer() {
		// TODO Auto-generated method stub
		System.out.println(customerService.getAllCustomers());
		
	}
public static void main(String[] args) {
	int ch=1;
	do {
	System.out.println("Welcome");
	System.out.println("1 Register Customer");
	System.out.println("2 Get All Customer");
	System.out.println("(Enter your choise");
	int choise = scanner.nextInt();
	switch(choise) {
	case 1:
		registerCustomer();
		break;
	case 2:
		showAllCustomer();
		break;
	default:
		break;
	}
	
	System.out.println("If you to Continew please Press 1..");
ch = scanner.nextInt();
}
	while(ch==1);
	System.out.println("Infailed");
}
}


