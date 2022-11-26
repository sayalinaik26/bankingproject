package com.ecommerce.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.BaseClass;

public class EditCustomerPom_Sayali extends BaseClass {
	
	public EditCustomerPom_Sayali() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='cusid']")
	WebElement customerId;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//input[@name='res']")
	WebElement resetButton;
	
	public void setValidCustomerId(String custId) {
		
		customerId.sendKeys(custId);
	}
	
	public void clickONSubmitButton() {
		
		submitButton.click();
	}
	
	public void closeAd() {
		
		
		
	}

}
