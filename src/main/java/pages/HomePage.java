package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class HomePage extends Page {
	
	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public void goToSignup() {
		driver.findElement(By.cssSelector("zh-signup")).click();
	}
	
	
	public LoginPage goToLogin() throws IOException {
		click("loginlink_CSS");
		System.out.println("clicked on login");
		return new LoginPage();
	}
	
	public void goToSupport() {
		driver.findElement(By.cssSelector("a.zh-support")).click();
	}
	
	public void goToLearnMore() {
		driver.findElement(By.cssSelector("")).click();
	}
	
}








