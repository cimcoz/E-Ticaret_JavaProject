package ticaretDemo.dataAccess.abstracts;

import java.util.List;

import ticaretDemo.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer get(String email);
	List<Customer> getAll();
	
}
