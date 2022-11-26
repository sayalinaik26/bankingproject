package com.ecommerce.utility;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ecommerce.base.BaseClass;

public class ExtentReport extends BaseClass {
	
	public static ExtentSparkReporter extentSparkReporter;
	
	public static void generateExtentReport() {
		
		 extentSparkReporter = new ExtentSparkReporter(projectPath+"//extentreport//testreport.html");
	}

}
