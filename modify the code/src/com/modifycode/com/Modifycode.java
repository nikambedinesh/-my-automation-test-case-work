 package com.modifycode.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.modify.config.Configration;

public class Modifycode extends Configration{
	
	
	//Modifycode(){
		//System.out.println("non argument cunstrctor");
		
	//}
    WebDriver driver;
    
  //public void driversetting(String url) {
	//   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		
	//	  driver= new ChromeDriver();
		//driver.get("file:///C:/selenium%20software/Offline%20Website/index.html");
	//			driver.get(url);
	//	driver.manage().window().maximize();
		
  // }
   
 //  public void login() {
		
	//	WebElement email_Element=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	//	 email_Element.sendKeys("kiran@gmail.com");
		 
	//	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		 
		  
		//  WebElement signin_element= driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
	//	  signin_element.click();
			
		
		
   //}
public static void main(String[] args) {
	//TODO Auto-generated method stub

		
		//Modifycode modify= new Modifycode();
		 
		//modify.driversetting("file:///C:/selenium%20software/Offline%20Website/index.html");
		//modify.login();

		
	//	Configration config=new Configration();
		
	//	config.driversetting("file:///C:/selenium%20software/Offline%20Website/index.html");
	//	config.login();
		
	 Modifycode modify= new Modifycode();
	  modify.driversetting("file:///C:/selenium%20software/Offline%20Website/index.html");
	  modify.login();
	
	}

}
