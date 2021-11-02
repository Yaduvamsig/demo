package com.mindtree.reusablecomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverHelper1{
public static WebDriver driver;
public Properties prop;
public WebDriver initializeDriver() throws IOException {
    prop=new Properties();
	FileInputStream fis=new FileInputStream("D:\\Selenium\\Selenium_programs\\practiceFramework\\testdata\\config.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium_programs\\Selenium_project\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	return driver;
}

	

}



