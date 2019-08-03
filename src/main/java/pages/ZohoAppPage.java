package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;
import pages.crm.CRMhomePage;

public class ZohoAppPage extends Page{

	public ZohoAppPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void goToChat() {
		driver.findElement(By.cssSelector(".zl-expand:nth-child(2) > div.tc")).click();
	}
	
	public CRMhomePage goToCRM() throws IOException {
		click("crmlink_CSS");//driver.findElement(By.cssSelector("")).
		return new CRMhomePage();
	}
	
	public void goToCalendar() {
		driver.findElement(By.xpath("//span[@class='zicon-apps-calendar zicon-apps-64']")).click();
	}
	
	

}
