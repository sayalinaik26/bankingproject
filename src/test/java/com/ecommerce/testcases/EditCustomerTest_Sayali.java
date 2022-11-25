package com.ecommerce.testcases;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecommerce.base.BaseClass;
import com.ecommerce.pom.EditCustomerPom_Sayali;
import com.ecommerce.pom.LoginPagePom;
import com.ecommerce.pom.ManagerHomePom;
import com.ecommerce.utility.ExcelReader;
import com.ecommerce.utility.Utility;

public class EditCustomerTest_Sayali extends BaseClass {
	
	LoginPagePom loginPagePom;
	ExcelReader excelReader;
	Utility utility;
	ManagerHomePom managerHomePom;
	EditCustomerPom_Sayali editcustomer;
	SoftAssert softAssert;
		
	
	@BeforeClass
	public void setUp() {
		initDriver();
	}
	
	
	public void tearDown() {
		driver.quit();
	}
	
	/*
	 * // public void testTitle() { // // // }
	 */	
	@Test(priority = 0)
	public void testValidCustomerId() throws EncryptedDocumentException, IOException {
		softAssert= new SoftAssert();
		excelReader = new ExcelReader();
		loginPagePom = new LoginPagePom();
		Sheet sh = excelReader.getSheet("EditCustomer");
		Map<String, Object> data = excelReader.getData(sh);
		//System.out.println(data);
		loginPagePom.setWithValidCredentials((String) data.get("userid"), (String) data.get("password"));
		loginPagePom.clickOnLoginButton();
		managerHomePom.clickOnEditCustomer();
		editcustomer.setValidCustomerId((String)data.get("validCustomerId"));
		softAssert.assertEquals("Characters are not allowed", "Characters are not allowed");
		editcustomer.clickONSubmitButton();
	}
	
	

	
	

}
