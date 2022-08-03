package com.pages.reports;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Nutrient_Data_Report extends Base_Class {

	private static By Reports = By.xpath("//span[text()='Reports']");
	private static By NutrientDataReport = By.xpath("//a[text()='Nutrient Data Report']");

	public void NutrientDataReport(String value) throws Throwable {
		if (value.equalsIgnoreCase("Nutrient Data Report")) {
			TC_133_Reports();
		}

	}

	public static void TC_133_Reports() throws Throwable {
		click(Reports);
		click(NutrientDataReport);
		Thread.sleep(10000);
		verification("//h4[text()='Nutrient Data Report ']", "Nutrient Data Report page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
}