package com.listner;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ecommerce.utility.Utility;

public class OurListner implements ITestListener {
	
	public void onTestSuccess(ITestResult result) {
		
		try {
			Utility.takeScreenShot(result.getName());
		} catch (IOException e) {
			
		}
	}
		
	public void onTestFailure(ITestResult result) {
			
		try {
			Utility.takeScreenShot(result.getName());
		} catch (IOException e) {
				
			e.printStackTrace();
		}
	 }
}
