 package com.ocators.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver .get("file:///C:/selenium%20software/Offline%20Website/index.html");
		
		 driver.findElement(By.linkText("Register a new membership" )).click();
		 
		 //driver.findElement(By.partialLinkText("Register")).click();	
		  
		   driver.findElement(By.name("name")).sendKeys("dinesh");
		   
		   driver.findElement(By.id("mobile")).sendKeys("9172182941");
		//   
		  driver.findElement(By.tagName("input")).sendKeys("nikambedinesh145@gmail.com");
		   
	list <webdriver> list = new chromedriver();driver.findElement(By.tagName("input"));
		  
		 
		  System.out.println("size =>"+list.size());
		  
		  for(int i=0;i<list.size();i++) {
			  System.out.println(list.get(i).getAttribute("placeholder"));
			  
			 if(list.get(i).getAttribute("placeholder").compareTo("Email")==0) {
				 System.out.println("email access..");
				 <>.get(i).sendKeys("nikambedinesh145@gmail.com");
			//	 
				 
			 }
			  
		  
			
		}
		  
	driver.findElement(By.className("button")).click();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}

}
