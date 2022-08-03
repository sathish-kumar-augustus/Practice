package com.pages.diet_management;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Diet_Preparation extends Base_Class {
	
	private static By DietManagement = By.xpath("//*[text()='Diet Management'][@class='menu-title app-c-s--nav-title']");
	private static By DietPreparation = By.xpath("//*[text()='Diet Preparation']");
	private static By AddNewDietPreparation = By.xpath("//*[@class='ti-plus']");
	private static By Options = By.xpath("//tbody/tr[1]/td[10]/div[1]/button[1]/span[1]");
	private static By Options_Clone = By.xpath("//*[text()='Clone']");
	private static By Options_Edit = By.xpath("//*[text()='Edit']");
	private static By Options_VersionHistory = By.xpath("//*[text()='Version History']");
	private static By Options_View = By.xpath("//*[text()='View']");
	
	public void DietPreparation(String value) throws Throwable {
		if (value.equalsIgnoreCase("Diet Preparation")) {
			TC_73_DietManagement();
			TC_74_DietManagement();
			TC_75_DietManagement();
			TC_76_DietManagement();
			TC_77_DietManagement();
			TC_78_DietManagement();
		}

	}
	
	public static void TC_73_DietManagement() throws Throwable {
		click(DietManagement);
		click(DietPreparation);
		Thread.sleep(10000);
		verification("//h4[text()='Diet Preparation List']", "Diet Preparation List Page got Loaded and Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_74_DietManagement() throws Throwable {
		click(AddNewDietPreparation);
		Thread.sleep(5000);
		verification("//li[text()=' Create Diet Preparation ']", "Create Diet Preparation Page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_75_DietManagement() throws Throwable {
		click(DietPreparation);
		Thread.sleep(1000);
		click(Options);
		Thread.sleep(1000);
		click(Options_Clone);
		Thread.sleep(3000);
		verification("//li[text()=' Clone Diet Preparation ']", "Clone Diet Preparation Page got Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_76_DietManagement() throws Throwable {
		click(DietPreparation);
		Thread.sleep(1000);
		click(Options);
		Thread.sleep(1000);
		click(Options_Edit);
		Thread.sleep(3000);
		verification("//*[text()=' Edit Diet Preparation ']", "Edit Diet Preparation Page got Displayed.");
		Thread.sleep(500);

	}
	
	public static void TC_77_DietManagement() throws Throwable {
		click(DietPreparation);
		Thread.sleep(1000);
		click(Options);
		Thread.sleep(1000);
		click(Options_VersionHistory);
		Thread.sleep(3000);
		verification("//h4[text()='Diet Preparation Version History']",
				"Diet Preparation Version History Page got Displayed.");
		Thread.sleep(500);
	}
	
	
	
	public static void TC_78_DietManagement() throws Throwable {
		click(DietPreparation);
		Thread.sleep(1000);
		click(Options);
		Thread.sleep(1000);
		click(Options_View);
		Thread.sleep(3000);
		verification("//h3[text()='Diet Preparation Sheet Preview']", "Diet Preparation Sheet Preview page got displayed.");
		Thread.sleep(500);
		Logout();
	}

}
