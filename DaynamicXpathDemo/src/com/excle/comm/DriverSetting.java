package com.excle.comm;

	import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class DriverSetting {

		WebDriver driver;
		
		public void driversetting(String Url) {
			
			
		System.setProperty("webdriver.chrome.driver","chromedriver .exe");
		driver=new ChromeDriver();
		
		driver.get(Url);
			  
		}
		
	public void accesselement() {
		 
		
		//relative x path
		
		driver.findElement(By.xpath("/html/body/div[3]/a[4]")).click();
		
		//absolute x path
		
		driver.findElement(By.xpath("//a[@id=\"navbtn_exercises\"]")).click();
		
		
		// daynamic x path
			
	driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("dinesh nikambe");
		
		
		//x path by contains 
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("dinesh@123");
		
		
		
		driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]")).sendKeys("dinesh@123");
		
	
		// 1 continue daynamic xpath 
		
           // 1.1 starts-with method
		
		driver.findElement(By.xpath("//input[starts-with(@name,\"passwd\")]")).sendKeys("dinesh@123");
		
		
		
		// 1.2 start-with(text) method
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Home')]")).click();
		
	}
		
		
	         // 2.following method 
	
		public void attAccessElement() {
			driver.findElement(By.xpath("(//div[@id='HEADBAND0']//following::li)[2]//a")).click();
			
			
		}
		
		// 3.   child method 
		
		public void att2AccessElement() {
			driver.findElement(By.xpath("(//div[@id='HEADBAND0']//child::li)[3]//a")).click();
		}
		
		
	}
		
		