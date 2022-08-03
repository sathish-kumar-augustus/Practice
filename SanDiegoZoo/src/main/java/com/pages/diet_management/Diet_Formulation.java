package com.pages.diet_management;


import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Diet_Formulation extends Base_Class {
	private static By DietManagement = By
			.xpath("//*[text()='Diet Management'][@class='menu-title app-c-s--nav-title']");
	private static By DietFormulation = By.xpath("//a[@href='#/diet-sheet/list']");
	private static By AddNewDietSheet = By.xpath("//*[@title='Add New Diet Sheet']");
	private static By Options = By.xpath("//tbody/tr[1]/td[10]/div[1]/button[1]/span[1]");
	private static By Options_Clone = By.xpath("//*[text()='Clone']");
	private static By Options_Edit = By.xpath("//*[text()='Edit']");
	private static By Options_VersionHistory = By.xpath("//*[text()='Version History']");
	private static By Options_View_Print = By.xpath("//*[text()='View / Print']");
	
	public void DietFormulation(String value) throws Throwable {
		if (value.equalsIgnoreCase("Diet Formulation")) {
			TC_67_DietManagement();
			TC_68_DietManagement();
			TC_69_DietManagement();
			TC_70_DietManagement();
			TC_71_DietManagement();
			TC_72_DietManagement();
		}

	}

	public static void TC_67_DietManagement() throws Throwable {
		click(DietManagement);
		click(DietFormulation);
		Thread.sleep(10000);
		verification("//h4[text()='Diet Formulation List']", "Diet Formulation List Page got loaded and displayed.");
		Thread.sleep(1000);

	}

	public static void TC_68_DietManagement() throws Throwable {
		click(AddNewDietSheet);
		Thread.sleep(1500);
		verification("//h4[text()='Create Diet Formulation']", "Create Diet Formulation Page got Displayed.");
		Thread.sleep(500);

	}

	public static void TC_69_DietManagement() throws Throwable {
		click(DietFormulation);
		Thread.sleep(1000);
		click(Options);
		Thread.sleep(1000);
		click(Options_Clone);
		Thread.sleep(3000);
		verification("//h4[text()='Create Diet Formulation']", "Create Diet Formulation Page got Displayed.");
		Thread.sleep(500);
	}

	public static void TC_70_DietManagement() throws Throwable {
		click(DietFormulation);
		Thread.sleep(1000);
		click(Options);
		Thread.sleep(1000);
		click(Options_Edit);
		Thread.sleep(3000);
		verification("//h4[text()='Edit Diet Formulation']", "Edit Diet Formulation Page got Displayed.");
		Thread.sleep(500);

	}

	public static void TC_71_DietManagement() throws Throwable {
		click(DietFormulation);
		Thread.sleep(1000);
		click(Options);
		Thread.sleep(1000);
		click(Options_VersionHistory);
		Thread.sleep(3000);
		verification("//h4[text()='Diet Sheet Version History List']",
				"Diet Sheet Version History Page got Displayed.");
		Thread.sleep(500);
	}

	public static void TC_72_DietManagement() throws Throwable {
		click(DietFormulation);
		Thread.sleep(1000);
		click(Options);
		Thread.sleep(1000);
		click(Options_View_Print);
		Thread.sleep(3000);
		verification("//h3[text()='Diet Sheet Preview']", "Diet Sheet Preview page got Displayed");
		Thread.sleep(500);
		Logout();
	}

}
