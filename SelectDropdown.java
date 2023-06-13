package com.SearchAmazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.SelisePlatform.BaseClass;

public class SelectDropdown extends BaseClass {
  @Test
  public void Amazon() throws InterruptedException, AWTException 
  {
	  driver.get("https://www.amazon.com/");
	  Thread.sleep(5000);
	  Robot robot = new Robot();
	  WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]"));
	  WebElement textbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	  WebElement search = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	  dropdown.click();
	  
	  for(int i = 0; i<= 21; i++) {
		  robot.keyPress(KeyEvent.VK_DOWN);
		  Thread.sleep(200);
		  
	  }
	  
	  robot.keyPress(KeyEvent.VK_ENTER);
	  textbox.sendKeys("games");
	  Thread.sleep(3000);
	  search.click();
	  Thread.sleep(6000);
	  
	  String ExpectedText ="Results";
	  String ActualMessage = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span")).getText();
	  if(ExpectedText.equals(ActualMessage)) {
		  System.out.println("Test Case Passed");
	  }
	  else 
	  {
		  System.out.println("Test Case failed. Bug Found");
	  }
  }
}
