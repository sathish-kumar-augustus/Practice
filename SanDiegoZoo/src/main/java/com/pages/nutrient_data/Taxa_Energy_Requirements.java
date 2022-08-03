package com.pages.nutrient_data;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Taxa_Energy_Requirements extends Base_Class {
	

	private static By NutrientData = By.xpath("//span[text()='Nutrient Data']");
	private static By TaxaEnergyRequirements = By.xpath("//a[text()='Taxa Energy Requirements']");
	private static By AddNewTaxaEnergyRequirement = By.xpath("//i[@class='ti-plus']");
	private static By Options_View = By.xpath("//*[text()='View']");
	private static By Options_VersionHistory = By.xpath("//*[text()='Version History']");
	private static By Options_Clone = By.xpath("//*[text()='Clone']");
	private static By Options = By.xpath("//tbody//tr//td[8]//div//button//span");

	
	
	public void TaxaEnergyRequirements(String value) throws Throwable {
		if (value.equalsIgnoreCase("Taxa Energy Requirements")) {
			TC_118_Nutrient_Data();
			TC_119_Nutrient_Data();
			TC_120_Nutrient_Data();
			TC_121_Nutrient_Data();
			TC_122_Nutrient_Data();
			
			
		}

	}

	public static void TC_118_Nutrient_Data() throws Throwable {
		click(NutrientData);
		click(TaxaEnergyRequirements);
		Thread.sleep(10000);
		verification("//h4[text()='Taxa Energy Requirement List']", "Taxa Energy Requirement List page got displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_119_Nutrient_Data() throws Throwable {
		click(AddNewTaxaEnergyRequirement);
		Thread.sleep(3000);
		verification("//h4[text()=' Create Taxa Energy Requirement ']", "Create Taxa Energy Requirement Page got displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_120_Nutrient_Data() throws Throwable {
		click(TaxaEnergyRequirements);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_Clone);
		Thread.sleep(3000);
		verification("//h4[text()=' Clone Taxa Energy Requirement ']", "Clone Taxa Energy Requirement page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_121_Nutrient_Data() throws Throwable {
		click(TaxaEnergyRequirements);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_VersionHistory);
		Thread.sleep(3000);
		verification("//h4[text()='Taxa Energy Requirement Version History']", "Taxa Energy Requirement Version History page got displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_122_Nutrient_Data() throws Throwable {
		click(TaxaEnergyRequirements);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_View);
		Thread.sleep(3000);
		verification("//h4[text()=' View Taxa Energy Requirement ']", "View Taxa Energy Requirements page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
	
}