package com.ecommerce.testcases;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import com.ecommerce.base.BaseClass;
import com.ecommerce.pom.EditCustomerPom_Sayali;
import com.ecommerce.pom.LoginPagePom;
import com.ecommerce.pom.ManagerHomePom;
import com.ecommerce.utility.ExcelReader;
import com.ecommerce.utility.Utility;

public class DeleteCustomerTest_Sayali extends BaseClass {
	
	LoginPagePom loginPagePom;
	ExcelReader excelReader;
	Utility utility;
	ManagerHomePom managerHomePom;
	EditCustomerPom_Sayali editcustomer;
	SoftAssert softAssert;
	Sheet sh;
		
	
	@BeforeClass
	public void setUp() {
		initDriver();
	}
	
	
	public void tearDown() {
		driver.quit();
	}
	
	public void testDeleteCustomer() {
		
		loginPagePom = new LoginPagePom();
		//loginPagePom.s
	}
}
