package ticaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import ticaretDemo.GoogleCustomerLogin.googleCustomerManager;
import ticaretDemo.business.abstracts.CustomerService;
import ticaretDemo.dataAccess.abstracts.CustomerDao;
import ticaretDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerDao customerDao;
	private googleCustomerManager google;
	
	private ArrayList<String> eMailList=new ArrayList<String>();

	public CustomerManager(CustomerDao customerDao , googleCustomerManager google) {
		this.customerDao = customerDao;
		this.google=google;
	}
	
	public static boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	public static boolean isMailValidOnClick() {
		return true;
	}

	@Override
	public void add(Customer customer) {
		if(eMailList.contains(customer.getEmail())) {
			System.out.println("Bu E-Mail Adresi Kullan�l�yor...");
			return;
		}
		if(customer.getPassword().length()<5) {
			System.out.println("Parola En Az 5 6 karakter olmal�d�r...");
			return;
		}
		if((customer.getFirstName().length())<2 || (customer.getLastName().length()<2)) {
			System.out.println("isim ve soyisim en az 2 karakter olmal�d�r");
		}
		if(isEmailValid(customer.getEmail()) != true) {
			System.out.println("Email Adresinizi do�ru girmelisiniz");
			return;
		}
		
		if(isMailValidOnClick() != true) {
			System.out.println("Email adresinizi Do�rulamal�s�n�z...");
			return;
		}
		else {
			eMailList.add(customer.getEmail());
		}
		System.out.println("Email Do�rulama Mesaj� G�nderildi... L�tfen Emaili Do�rulay�n�z....");
		customerDao.add(customer);
	}

	@Override
	public void login(String mail, String sifre) {
		if(eMailList.contains(mail)) {
			System.out.println("Giri� Ba�ar�l�"+mail);
		}
		
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getCustomer(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginWithGoogle(String mail, String password) {
		System.out.println("Google �le Giri� Yap�l�yor...");
		google.login(mail, password);
		
	}
	
}
