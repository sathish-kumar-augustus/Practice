package com.pages.nutrient_data;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Feed_Nutrient_Data extends Base_Class {

	private static By FeedNutrientData = By.xpath("//a[text()='Feed Nutrient Data']");
	private static By NutrientData = By.xpath("//span[text()='Nutrient Data']");
	private static By AddNewFeedId = By.xpath("//i[@class='ti-plus']");
	private static By Options_View = By.xpath("//*[text()='View']");
	private static By Options_Clone = By.xpath("//*[text()='Clone']");
	private static By Options_VersionHistory = By.xpath("//*[text()='Version History']");
	private static By Options_Edit = By.xpath("//*[text()='Edit']");
	private static By Options = By.xpath("//tbody//tr[2]//td[166]//div//button//span");
	private static By Cancel_Button = By.xpath("//button[text()=' Cancel ']");
	private static By Yes_Button = By.xpath("//span[text()='Yes']");

	
	
	public void FeedNutrientData(String value) throws Throwable {
		if (value.equalsIgnoreCase("Feed Nutrient Data")) {
			TC_106_Nutrient_Data();
			TC_107_Nutrient_Data();
			TC_108_Nutrient_Data();
			TC_109_Nutrient_Data();
			TC_110_Nutrient_Data();
			TC_111_Nutrient_Data();

		}

	}

	public static void TC_106_Nutrient_Data() throws Throwable {
		click(NutrientData);
		click(FeedNutrientData);
		Thread.sleep(10000);
		verification("//h4[text()='Feed Nutrient Data List']", "Feed Nutrient Data List page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_107_Nutrient_Data() throws Throwable {
		click(AddNewFeedId);
		Thread.sleep(3000);
		verification("//h4[text()=' Create Feed Data ']", "Create Feed Data page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_108_Nutrient_Data() throws Throwable {
		click(FeedNutrientData);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_Clone);
		Thread.sleep(3000);
		verification("//h4[text()=(' Clone Feed Data ')]", "Clone Feed Data page got Displayed.");
		Thread.sleep(1000);
		click(Cancel_Button);
		Thread.sleep(1000);
		click(Yes_Button);
		Thread.sleep(500);
	}
	
	public static void TC_109_Nutrient_Data() throws Throwable {
		click(Options);
		Thread.sleep(1000);
		click(Options_Edit);
		Thread.sleep(3000);
		verification("//h4[text()=' Edit Feed Data ']", "Edit Feed Data page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_110_Nutrient_Data() throws Throwable {
		click(FeedNutrientData);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_VersionHistory);
		Thread.sleep(3000);
		verification("//h4[text()='Feed Nutrient Data Version History']", "Feed Nutrient Data Version History page got displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_111_Nutrient_Data() throws Throwable {
		click(FeedNutrientData);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_View);
		Thread.sleep(3000);
		verification("//h4[text()=' View Feed Data ']", "View Feed Data page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
}
