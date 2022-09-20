package com.Fleetstudio.Testcases;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class verificationPageWise {
	
	WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static  ExtentTest test;
	
	@BeforeMethod
	public void setUpTest() {
		extent = ExtentRportManager.getReports();
		test = extent.createTest("Partners");
		
	      System.setProperty("webdriver.chrome.driver", GlobalVariable.driverPath);
	      driver =new ChromeDriver();
	      
	}
	 
	@Test
	public void test() throws IOException {
		
		
        driver.manage().window().maximize();
		driver.get(GlobalVariable.URL);
		workPage work =new workPage(driver);
		work.VerifyTextofAboutUSLink();
		work.clickOnAboutUSLink();
		//test.log(Status.PASS, "Clicked on Partners Link");
		work.VerifyDestinationURL();
		//test.log(Status.FAIL, "Landed on the Partners page");
		
	}
	
	

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
	
	@AfterMethod
	public void tearDown() {
	    extent.flush();
	}
	
	
	
	

}
