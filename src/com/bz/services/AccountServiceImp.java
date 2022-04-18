package com.bz.services;

import com.bz.interfaces.IAccountService;
import com.bz.interfaces.ICustomerService;
import com.bz.model.Customer;

public class AccountServiceImp  implements AccountService {

	private  ICustomerService customerService = new CustomerServiceImpl();
	
	public int openAccount(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = customerService.search(customerId);
		if(customer!= null) {
			Account account = new Account();
		}System.out.println("Account is not generated due invaild customer");
		return 0;
	} 
	
}






