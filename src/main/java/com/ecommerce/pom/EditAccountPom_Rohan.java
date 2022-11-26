package com.ecommerce.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.BaseClass;

public class EditAccountPom_Rohan extends BaseClass {

	public EditAccountPom_Rohan() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='accountno']")
	WebElement accountNo;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submit;
	
	@FindBy(xpath = "//input[@name='res']")
	WebElement reset;
	
	public void setAccountNo(String accNo) {
		
		accountNo.sendKeys(accNo);
	}
	
	public void submitEditAccountForm() {
		
		submit.click();
	}
	
	public void resetEditAccountForm() {
		
		reset.click();
	}
	
	
}
