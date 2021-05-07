package ticaretDemo.dataAccess.concretes;

import java.util.List;

import ticaretDemo.dataAccess.abstracts.CustomerDao;
import ticaretDemo.entities.concretes.Customer;

public class StorageDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("�nbelle�e Kaydedildi : "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("�nbellekten silindi : "+customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("�nbellekten g�ncellendi : "+customer.getFirstName());
		
	}

	@Override
	public Customer get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
