package com.pages.reports;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Diet_Management_Report extends Base_Class {
	
	//git clone successful will try push...

	private static By Reports = By.xpath("//span[text()='Reports']");
	private static By DietManagementReport = By.xpath("//a[text()='Diet Management Report']");

	public void DietManagementReport(String value) throws Throwable {
		if (value.equalsIgnoreCase("Diet Management Report")) {
			TC_129_Reports();
		}

	}

	public static void TC_129_Reports() throws Throwable {
		click(Reports);
		click(DietManagementReport);
		Thread.sleep(10000);
		verification("//h4[text()=' Diet Management Report ']", "Diet Management Report Page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
}