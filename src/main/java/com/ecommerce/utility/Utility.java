package com.ecommerce.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.base.BaseClass;

public class Utility extends BaseClass {
	
	public String getTitle() {
		
		return driver.getTitle();
	}
	
	public void applyImplicitWait() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	public void applyExplicitlywait(WebElement ele) {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void takeScreenShot(String name) throws IOException {
		
		File screenshotSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String des = projectPath+"//screenshot//"+name+""+".jpg";
		FileUtils.copyFile(screenshotSrc, new File(des));
	}

}
