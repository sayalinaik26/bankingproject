package com.ecommerce.testcases;

import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.ecommerce.base.BaseClass;
import com.ecommerce.pom.LoginPagePom;
import com.ecommerce.pom.ManagerHomePom;
import com.ecommerce.utility.ExcelReader;
import com.ecommerce.utility.ExtentReport;
import com.ecommerce.utility.Utility;

	public class ManagerHomeTest extends BaseClass {
	
	LoginPagePom loginPagePom;
	ExcelReader excelReader;
	Utility utility;
	ManagerHomePom managerHomePom;
	ExtentReports extentReports;
		
	
	@BeforeClass
	public void setUp() {
		extentReports = new ExtentReports();
		extentReports.attachReporter(ExtentReport.extentSparkReporter);
	
		initDriver();
	}
	
	@AfterClass
	public void tearDown() {
		extentReports.flush();
		driver.quit();
	}
	
	@Test
	public void testClickOnNewCustomer() {	
		ExtentTest logger = extentReports.createTest("testClickOnNewCustomer");
		managerHomePom = new ManagerHomePom();	//without creating obj of ManagerHomePom add reference variable to loginPagePom
		managerHomePom.clickOnEditCustomer();
		
	}
		
	
}
