package com.ecommerce.testcases;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecommerce.base.BaseClass;
import com.ecommerce.pom.LoginPagePom;
import com.ecommerce.pom.ManagerHomePom;
import com.ecommerce.utility.ExcelReader;
import com.ecommerce.utility.Utility;

	public class ManagerHomeTest extends BaseClass {
	
	LoginPagePom loginPagePom;
	ExcelReader excelReader;
	Utility utility;
	ManagerHomePom managerHomePom;
		
	
	@BeforeClass
	public void setUp() {
		initDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void testValidLogin() throws EncryptedDocumentException, IOException {
		SoftAssert softAssert = new SoftAssert();
		excelReader = new ExcelReader();
		Sheet sh = excelReader.getSheet("login");
		Map<String, Object> data = excelReader.getData(sh);
		loginPagePom = new LoginPagePom();
		loginPagePom.setWithValidCredentials((String) data.get("userid"), (String) data.get("password"));
		softAssert.assertEquals(data.get("userid").toString(),"mngr455547");
		managerHomePom = loginPagePom.clickOnLoginButton();
		softAssert.assertAll();
		
	}
	
	@Test(priority = 1)
	public void testClickOnNewCustomer() {	
		//managerHomePom = new ManagerHomePom();	//without creating obj of ManagerHomePom add reference variable to loginPagePom
		managerHomePom.clickOnNewCustomer();
		}
		
	
}
