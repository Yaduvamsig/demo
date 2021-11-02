package package1;

import java.io.IOException;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.pageobject.HomePage1;
import com.mindtree.pageobject.Login1;
import com.mindtree.reusablecomponents.WebDriverHelper1;



public class LoginTest1 extends WebDriverHelper1 {
	// public static Logger log=LogManager.getLogger(WebDriverHelper1.class.getName());
		public static Logger log=Logger.getLogger(WebDriverHelper1.class.getName());
	
	@Test(dataProvider="getData")
	public void method1(String email,String password) throws IOException {
		driver=initializeDriver();
		log.info(" driver intialized");
		
		driver.get(prop.getProperty("url"));
		log.info("navigation to url");
		
		HomePage1 h=new HomePage1(driver);
		h.getLogin().click();
		Login1 l=new Login1(driver);
		l.getEmailid().sendKeys(email);
		l.getPassword().sendKeys(password);
		
		l.getsignin().click();
		
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[1][2];
		data[0][0]="firstmail@gmail.com";
		data[0][1]="password1";

		
		return data;
				
	}
	@AfterTest
	public void driverclose()
	{
		driver.close();
	}
	

}
