package com.ecommerce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.BaseClass;

public class LoginPagePOM extends BaseClass{
	
	public LoginPagePOM(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//input[@name='uid']")
	WebElement userid;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@name='btnReset']")
	WebElement resetButton;
	
	@FindBy(xpath = "//a[text()='here']")
	WebElement getCredentials;
	

}
