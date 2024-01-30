package com.seleniumwork.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/selenium%20software/Offline%20Website/index.html");
		
		WebElement email_element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 email_element.sendKeys("kiran@gmail.com");
		 
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		  
		  WebElement signin_element= driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		  signin_element.click();
		  
		 WebElement dashboard_element=driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
		 
		 
		 System.out.println("=>"+dashboard_element.getText());
		 //user click
		  driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		  // add user
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		 //username
		 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("dinesh nikabe");
		 //mobile no.
		 driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9172182941");
		 // email
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("nikambedinesh143@gmail.com");
		 // course
		 driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("selenium");
		 // gender
		//  driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
		  
		 WebElement dropdown_element= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		 
		 Select selectdropdown = new Select(dropdown_element);
		  selectdropdown.selectByIndex(1);
		  //password
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		  // friend mobile no.
		   driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("9172182945");
		    // submit
		   driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		   
		   Alert alert=driver.switchTo().alert();
		   alert.accept();
	
		 
		 
	}

}
