package com.iframe.ocm;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DriverSetting {

		WebDriver driver;
		
		public void driversetting(String Url) {
			
			
		System.setProperty("webdriver.chrome.driver","chromdriver.exe");
		driver=new ChromeDriver();
		driver.get(Url);
		
		}
		
		public void iframeAccess() {
			driver.switchTo().frame(1);
			//driver.switchTo().frame(null); 
			
			WebElement iframeElement= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]"));
			driver.switchTo().frame(iframeElement);
			
			 
			//driver.findElement(By.xpath("/html/body/div/div/div")).click();
			
		}
		
	}

