package ticaretDemo;

import ticaretDemo.GoogleCustomerLogin.googleCustomerManager;
import ticaretDemo.business.abstracts.CustomerService;
import ticaretDemo.business.concretes.CustomerManager;
import ticaretDemo.dataAccess.concretes.HiberNateCustomer;
import ticaretDemo.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("engin", "demirog", "engin@gmail.com","123456");
		
		CustomerService customerService=new CustomerManager(new HiberNateCustomer(),new googleCustomerManager());
		
		//customerService.add(customer);
		customerService.loginWithGoogle(customer.getEmail(), customer.getPassword());

	}

}
