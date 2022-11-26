package com.ecommerce.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ecommerce.base.BaseClass;
import com.ecommerce.utility.Utility;

public class NewAccountPom_Rohan extends BaseClass {

	public NewAccountPom_Rohan() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='New Account']")
	WebElement clickNewAccount;
	
	@FindBy(xpath = "//input[@name='cusid']")
	WebElement customerId;
	
	@FindBy(xpath = "//select[@name='selaccount']")
	WebElement accountType;
	
	@FindBy(xpath = "//input[@name='inideposit']")
	WebElement initialDeposit;
	
	@FindBy(xpath = "//input[@name='button2']")
	WebElement submit;
	
	@FindBy(xpath = "//input[@name='reset']")
	WebElement reset;
	
	@FindBy(xpath = "//div[@aria-label='Close ad']")
	WebElement ad;
	
	public void setNewAccountFormDetails(Object custId, Object acctype, Object initDeposit) {
		
		customerId.sendKeys(custId.toString());
		Select sel = new Select(accountType);
		sel.selectByVisibleText(acctype.toString());
		initialDeposit.sendKeys(initDeposit.toString()); 
		
	}
	
	public void submitNewAccountForm() {
		
		submit.click();
	}
	
	public void resetNewAccountForm() {
		
		reset.click();
	}
	
	public void clickNewAccount() {
		//Utility.applyImplicitWait();
		clickNewAccount.click();
	}
	
	
}
