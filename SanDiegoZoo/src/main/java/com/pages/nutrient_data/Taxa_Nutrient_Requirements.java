package com.pages.nutrient_data;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Taxa_Nutrient_Requirements extends Base_Class {
	

	private static By NutrientData = By.xpath("//span[text()='Nutrient Data']");
	private static By TaxaNutrientRequirements = By.xpath("//a[text()='Taxa Nutrient Requirements']");
	private static By AddNewTaxaNutrientRequirement = By.xpath("//i[@class='ti-plus']");
	private static By Options_View = By.xpath("//*[text()='View']");
	private static By Options_VersionHistory = By.xpath("//*[text()='Version History']");
	private static By Options_Clone = By.xpath("//*[text()='Clone']");
	private static By Options_Edit = By.xpath("//*[text()='Edit']");
	private static By Options = By.xpath("//tbody//tr[1]//td[165]//div//button//span");

	
	
	public void TaxaNutrientRequirements(String value) throws Throwable {
		if (value.equalsIgnoreCase("Taxa Nutrient Requirements")) {
			TC_123_Nutrient_Data();
			TC_124_Nutrient_Data();
			TC_125_Nutrient_Data();
			TC_126_Nutrient_Data();
			TC_127_Nutrient_Data();
			TC_128_Nutrient_Data();
			
			
		}

	}

	public static void TC_123_Nutrient_Data() throws Throwable {
		click(NutrientData);
		click(TaxaNutrientRequirements);
		Thread.sleep(10000);
		verification("//h4[text()='Taxa Nutrient Requirement List']", "Taxa Nutrient Requirements List page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_124_Nutrient_Data() throws Throwable {
		click(AddNewTaxaNutrientRequirement);
		Thread.sleep(3000);
		verification("//h4[text()=' Create Taxa Nutrient Requirement ']", "Create Taxa Nutrient Requirements page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_125_Nutrient_Data() throws Throwable {
		click(TaxaNutrientRequirements);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_Clone);
		Thread.sleep(3000);
		verification("//h4[text()=' Clone Taxa Nutrient Requirement ']", "Clone Taxa Nutrient Requirements page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_126_Nutrient_Data() throws Throwable {
		click(TaxaNutrientRequirements);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_Edit);
		Thread.sleep(3000);
		verification("//h4[text()=' Edit Taxa Nutrient Requirement ']", "Edit Taxa Nutrient Requirements page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_127_Nutrient_Data() throws Throwable {
		click(TaxaNutrientRequirements);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_VersionHistory);
		Thread.sleep(3000);
		verification("//h4[text()='Taxa Nutrient Requirement Version History']", "Taxa Nutrient Requirements Version History page got displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_128_Nutrient_Data() throws Throwable {
		click(TaxaNutrientRequirements);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_View);
		Thread.sleep(3000);
		verification("//h4[text()=' View Taxa Nutrient Requirement ']", "View Taxa Nutrient Requirements page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
	
}