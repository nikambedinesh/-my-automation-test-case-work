package com.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("wevdriver.chrome.driver","chromedriver.exe");
 
  WebDriver driver =new ChromeDriver();
  
  driver.get("https://www.qa.jbktest.com/online-exam#Testing");
  

		
		
	}

}
