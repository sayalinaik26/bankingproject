package com.ecommerce.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.ecommerce.base.BaseClass;

public class NewAccountTest_Rohan extends BaseClass {
	
	
	
	@BeforeClass
	public void setUp() {
		initDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
}



