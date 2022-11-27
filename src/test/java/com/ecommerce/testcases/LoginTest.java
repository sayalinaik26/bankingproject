package com.ecommerce.testcases;


import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecommerce.base.BaseClass;
import com.ecommerce.pom.LoginPagePom;
import com.ecommerce.pom.LoginPagePom;
import com.ecommerce.utility.ExcelReader;
import com.ecommerce.utility.Utility;

public class LoginTest extends BaseClass{
	
	LoginPagePom loginPagePom;
	ExcelReader excelReader;
	Utility utility;
	
	@BeforeClass
	public void setUp() {
		initDriver();
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
	@Test
	public void testTitle() {
		utility = new Utility();
		String title = utility.getTitle();
		//System.out.println(title);
		Assert.assertEquals(false, "GTPL Bank Home Page");
		
		
	}
	
	@Test(groups= {"validLogin"})
	public void testValidLogin() throws EncryptedDocumentException, IOException {
		excelReader = new ExcelReader();
		Sheet sh = excelReader.getSheet("loginpage");
		Map<String, Object> data = excelReader.getData(sh);
		loginPagePom = new LoginPagePom();
		loginPagePom.setWithValidCredentials((String) data.get("userid"), (String) data.get("password"));
		loginPagePom.clickOnLoginButton();
	}

}

