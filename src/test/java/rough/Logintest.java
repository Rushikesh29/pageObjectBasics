package rough;

import java.io.IOException;

import base.Page;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import pages.crm.CRMhomePage;
import pages.crm.accounts.AccountsPage;
import pages.crm.accounts.CreateAccountPage;

public class Logintest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("rishikeshr2992@gmail.com", "Rushi@789");
		CRMhomePage cp =zp.goToCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount("rushikesh");
		
		

	}

}
