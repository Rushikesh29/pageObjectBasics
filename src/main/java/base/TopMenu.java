package base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	WebDriver driver;
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}

	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AccountsPage gotoAccounts() throws IOException {
		Page.click("accountlink_CSS");
		return new AccountsPage();
	}

	public void gotoDeals() {

	}

	public void gotoActivities() {

	}

	public void gotoReports() {

	}

	public void gotoAnalytics() {

	}

	public void gotoProducts() {

	}

	public void gotoQuotes() {

	}

	public void gotoProjects() {

	}

	public void signOut() {

	}

}
