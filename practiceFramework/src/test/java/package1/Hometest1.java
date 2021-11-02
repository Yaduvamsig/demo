package package1;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.pageobject.HomePage1;
import com.mindtree.reusablecomponents.WebDriverHelper1;

public class Hometest1 extends WebDriverHelper1 {
	//public static Logger log=LogManager.getLogger(WebDriverHelper1.class.getName());
	public static Logger log=Logger.getLogger(WebDriverHelper1.class.getName());
	
	
	@BeforeTest
	public void  initialize() throws IOException {
		driver=initializeDriver();
		log.info(" driver intialized");
		
		driver.get(prop.getProperty("url"));
		log.info("navigation to url");
		
		
	}
	@Test
	public void method() {
		HomePage1 h=new HomePage1(driver);
		h.getSearch().sendKeys("shop");
		h.getSearch().sendKeys(Keys.ENTER);
		
		
		
	}
	@AfterTest
	public void driverclose() {
		driver.close();
	}
	

}

