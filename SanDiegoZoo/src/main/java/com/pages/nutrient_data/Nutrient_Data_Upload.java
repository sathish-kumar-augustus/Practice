package com.pages.nutrient_data;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Nutrient_Data_Upload extends Base_Class {
	private static By NutrientData = By.xpath("//span[text()='Nutrient Data']");
	private static By NutrientDataUpload = By.xpath("//a[text()='Nutrient Data Upload']");
	private static By AddNewFile = By.xpath("//i[@class='ti-plus']");
	private static By Options_View = By.xpath("//*[text()='View']");
	private static By ViewAll = By.xpath("//button[text()='View All']");
	private static By Options_VersionHistory = By.xpath("//*[text()='Version History']");
	private static By Options_Edit = By.xpath("//*[text()='Edit']");
	private static By Options = By.xpath("//tbody//tr//td[5]//div//button//span");

	
	
	public void NutrientDataUpload(String value) throws Throwable {
		if (value.equalsIgnoreCase("Nutrient Data Upload")) {
			TC_112_Nutrient_Data();
			TC_113_Nutrient_Data();
			TC_114_Nutrient_Data();
			TC_115_Nutrient_Data();
			TC_116_Nutrient_Data();
			TC_117_Nutrient_Data();
			
			
		}

	}

	public static void TC_112_Nutrient_Data() throws Throwable {
		click(NutrientData);
		click(NutrientDataUpload);
		Thread.sleep(10000);
		verification("//h4[text()='Nutrient Data Upload List']", "Nutrient data Upload Listing page got displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_113_Nutrient_Data() throws Throwable {
		click(AddNewFile);
		Thread.sleep(3000);
		verification("//h4[text()='Create Nutrient Data ']", "Create Nutrient Data page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_114_Nutrient_Data() throws Throwable {
		click(NutrientDataUpload);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_Edit);
		Thread.sleep(3000);
		verification("//h4[text()='Edit Nutrient Data ']", "Edit Nutrient Data page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_115_Nutrient_Data() throws Throwable {
		click(NutrientDataUpload);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_VersionHistory);
		Thread.sleep(3000);
		verification("//h4[text()='Nutrient Data Upload Version History']", "Nutrient Data Upload Version History page got displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_116_Nutrient_Data() throws Throwable {
		click(NutrientDataUpload);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_View);
		Thread.sleep(3000);
		verification("//h4[text()='View Nutrient Data']", "View Nutrient Data page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_117_Nutrient_Data() throws Throwable {
		click(NutrientDataUpload);
		Thread.sleep(1500);
		click(ViewAll);
		Thread.sleep(3000);
		verification("//h4[text()='View Nutrient Data List']", "View Nutrient Data List page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
}
