package testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Page;
import pages.ZohoAppPage;
import pages.crm.CRMhomePage;
import pages.crm.accounts.AccountsPage;
import pages.crm.accounts.CreateAccountPage;
import utilities.Utilities;

public class CreateAccountTest {
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data) throws IOException {
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		Assert.fail("create account test failed");
	}

}
