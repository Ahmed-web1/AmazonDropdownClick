package com.SelisePlatform;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	
	  @BeforeClass
	  public void browser_Config() {	
		  
		  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver(); 
		  
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);	  
	  }  
	  
      @AfterClass
      public void closeBrowser()
      {
    	  driver.close();
      }

}
