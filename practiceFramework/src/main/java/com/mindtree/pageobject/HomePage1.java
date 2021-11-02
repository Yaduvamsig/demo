package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage1 {
	WebDriver driver;
	public  HomePage1(WebDriver driver) {
		this.driver=driver;
			
	}
	By search=By.cssSelector("input[class='form-field-input live-search-form-field']");
	
	
	By login=By.xpath("//*[@id=\'site-header-nav\']/nav/ul[2]/li/a");
	
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	
	
	
	
}
