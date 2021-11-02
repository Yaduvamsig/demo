package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {
	WebDriver driver;
	public Login1(WebDriver driver) {
		this.driver=driver;
	}
	By emailid=By.id("customer_email");
	 By password =By.xpath("//*[@id=\'customer_password\']");
	 By signin =By.xpath("//*[@id='customer_login']");
	public WebElement getEmailid() {
		return driver.findElement(emailid);
		
	}
	public WebElement getPassword() {
		return driver.findElement(password);
		
	}
	public WebElement getsignin() {
		return driver.findElement(signin);
		
	}
}
