package ticaretDemo.core;

import ticaretDemo.GoogleCustomerLogin.googleCustomerManager;

public class googleLoginAdapter implements myGoogle{

	@Override
	public void login(String mail, String password) {
		googleCustomerManager login=new googleCustomerManager();
		login.login(mail, password);
		
	}
	
}
