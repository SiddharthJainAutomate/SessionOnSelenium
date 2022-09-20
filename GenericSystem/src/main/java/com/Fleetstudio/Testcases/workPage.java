/**
 * 
 */
package com.Fleetstudio.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
/**
 * @author siddharthj
 *This class will store all the locators and methods of Fleet studio Work Page (POM)
 */
public class workPage extends verificationPageWise {
	
	WebDriver driver;
	By AboutUs = By.xpath("(//*[text()='Partners'])[1]");
	By Offerings = By.xpath("//*[text()='Offerings']");
	By Work = By.xpath("//*[text()='Work']");
	By Careers = By.xpath("//*[text()='Careers']");
	By Contact = By.xpath("//*[text()='Contact']");

			
	
	public workPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void clickOnAboutUSLink() {
		driver.findElement(AboutUs).click();	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void VerifyTextofAboutUSLink() {
		
		String expctedtext = "Partners";
		String ActualText = driver.findElement(AboutUs).getText();
		
		if(expctedtext.equalsIgnoreCase(ActualText))
		{
			System.out.println("Text matching");
			test.log(Status.PASS, "Clicked on Partners Link1");
		
			
		}
		else
		{
			System.out.println("Text Not matching");
			
		}
		
	}
	
	

	public void VerifyDestinationURL() {
		
		String URL1 = driver.getCurrentUrl();
		System.out.println(URL1);
		
		if(URL1.equalsIgnoreCase("https://planful.com/partners/")) 
		{
			System.out.println("Landed Partners Page");
			
		}
		else
		{
			System.out.println("Landed on incorrect page");
			
		}	
		
		
	}
	
	public void clickOnOfferings() {
		driver.findElement(Offerings).click();	
	}
	
	public void clickOnWorkLink() {
		driver.findElement(Work).click();	
	}
	
	public void clickOnCareersLink() {
		driver.findElement(Careers).click();	
	}
	
	public void clickOnContactLink() {
		driver.findElement(Contact).click();	
	}
	
	
}
