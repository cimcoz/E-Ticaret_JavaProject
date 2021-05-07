package ticaretDemo.business.abstracts;

import java.util.List;

import ticaretDemo.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void login(String mail,String sifre);
	void loginWithGoogle(String mail,String password);
	List<Customer> getCustomers();
	void getCustomer(String email);
}
