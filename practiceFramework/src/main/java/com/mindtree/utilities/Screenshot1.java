package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mindtree.reusablecomponents.WebDriverHelper1;



	public class Screenshot1 extends WebDriverHelper1 { 
		//public WebDriver driver;
		public void getss(String result ) throws IOException
		{
			TakesScreenshot ts=((TakesScreenshot) driver);
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		//String ss=System.getProperty("D:\\Selenium\\Selenium-Programs\\Framework\\Screenshot")+result+" ScreenShot"+".png";
		//File destFile=new File(ss);
		//FileUtils.copyFile(srcFile,destFile);
		FileUtils.copyFile(srcFile,new File("D:\\Selenium\\selenium-programs\\practiceFramework\\ScreenShot\\" + result+"Screenshot"+System.currentTimeMillis()+".png"));
			//return ss;
		
			
		}

		
}
