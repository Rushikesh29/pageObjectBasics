package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;
import pages.crm.CRMhomePage;

public class LoginPage extends Page{

	
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZohoAppPage doLogin(String username,String password) throws IOException {
		System.out.println("came to type uname and pass");
		type("email_CSS",username);
		System.out.println("came to type uname and pass");
		type("password_CSS",password);
		click("loginbtn_CSS");
		
			
		return new ZohoAppPage();
		
	}

}


