package pages.crm.accounts;

import java.io.IOException;

import org.openqa.selenium.By;

import base.Page;

public class AccountsPage  extends Page {
	
	public AccountsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateAccountPage gotoCreateAccounts() throws IOException {
		click("createaccountbtn_CSS");
		return new CreateAccountPage();
	}

}
