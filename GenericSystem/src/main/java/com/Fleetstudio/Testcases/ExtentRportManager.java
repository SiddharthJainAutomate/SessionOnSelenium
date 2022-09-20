package com.Fleetstudio.Testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentRportManager {
	
	public static ExtentReports extent = new ExtentReports();
	public static ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
	public static  ExtentTest test= extent.createTest("Partner Page");
	
	
	public static ExtentReports getReports() {
		
		if(extent == null)
		{
	
	extent = new ExtentReports();
	spark = new ExtentSparkReporter("index.html");
	test= extent.createTest("Partner Page");
	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("MyReport");
	extent.attachReporter(spark);
	
		
		
		}
		return extent;
		
}
	
}
