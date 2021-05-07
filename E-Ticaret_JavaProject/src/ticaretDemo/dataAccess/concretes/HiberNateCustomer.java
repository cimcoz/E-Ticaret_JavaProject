package ticaretDemo.dataAccess.concretes;

import java.util.List;

import ticaretDemo.dataAccess.abstracts.CustomerDao;
import ticaretDemo.entities.concretes.Customer;

public class HiberNateCustomer implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("HyberNate �le eklendi : "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("HyberNate �le silindi : "+customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("HyberNate �le g�ncellendi : "+customer.getFirstName());
		
	}

	@Override
	public Customer get(String email) {
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
