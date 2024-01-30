package com.excle.comm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(Url);

	}

	public void readExcleSheet() {

		try {
			FileInputStream fis = new FileInputStream("C:\\selenium software\\excleFiles\\myexcle.xlx");

			try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
				XSSFSheet sheet = workbook.getSheetAt(0);
				// XSSFRow row= sheet.getRow(0);

				XSSFRow row = sheet.getRow(1);

				XSSFCell cell = row.getCell(0);

				System.out.println("data=>" + cell.getStringCellValue());

				System.err.println("data=>" + row.getCell(1).getNumericCellValue());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
