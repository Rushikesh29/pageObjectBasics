package pages.crm.accounts;

import java.io.IOException;

import org.openqa.selenium.By;

import base.Page;

public class CreateAccountPage extends Page {
	
	public CreateAccountPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void createAccount(String name) {
		type("accountname_CSS",name);
	}

}
