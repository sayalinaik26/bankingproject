package com.ecommerce.testcases;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
	Sheet sh;
		
	
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
	public void testValidCustomerId() throws EncryptedDocumentException, IOException, InterruptedException {
		softAssert= new SoftAssert();
		excelReader = new ExcelReader();
		loginPagePom = new LoginPagePom();
		Sheet sh = excelReader.getSheet("loginpage");
		Map<String, Object> data = excelReader.getData(sh);
		//System.out.println(data);
		loginPagePom.setWithValidCredentials((String) data.get("userid"), (String) data.get("password"));
		loginPagePom.clickOnLoginButton();
		managerHomePom = new ManagerHomePom();
		managerHomePom.clickOnEditCustomer();
		Thread.sleep(5000);

		
		Alert alert = driver.switchTo().alert();
		//driver.findElement(By.xpath("//div[@class='ns-qe2n6-e-14 button-common close-button']")).click();
		driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
		Thread.sleep(2000);
		//alert.dismiss();
		excelReader.getSingleData(sh, 0, 0);
		sh = excelReader.getSheet("EditCustomer");
		System.out.println(sh);
		editcustomer.setValidCustomerId((String)data.get("validCustomerId"));
		softAssert.assertEquals("Characters are not allowed", "Characters are not allowed");
		editcustomer.clickONSubmitButton();
	}
	
	

	
	

}
