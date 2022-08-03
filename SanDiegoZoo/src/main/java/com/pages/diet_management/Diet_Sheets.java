package com.pages.diet_management;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Diet_Sheets extends Base_Class{
	private static By DietManagement = By.xpath("//*[text()='Diet Management'][@class='menu-title app-c-s--nav-title']");
	private static By DietSheets = By.xpath("//*[text()='Diet Sheets']");
	private static By Options = By.xpath("//tbody/tr[1]/td[6]/div[1]/button[1]/span[1]");
	private static By Options_View = By.xpath("//*[text()='View']");
	public void DietSheets(String value) throws Throwable {
		if (value.equalsIgnoreCase("Diet Sheets")) {
			TC_79_DietManagement();
			TC_80_DietManagement();
			
		}

	}
	
	public static void TC_79_DietManagement() throws Throwable {
		click(DietManagement);
		click(DietSheets);
		Thread.sleep(10000);
		verification("//h4[text()='Diet Sheet List']", "Diet Sheet List page got Loaded and Displayed.");
		Thread.sleep(500);
	}
	
	public static void TC_80_DietManagement() throws Throwable {
		click(DietSheets);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_View);
		Thread.sleep(3000);
		verification("//*[text()='Diet Sheet Preview']", "Diet Sheet Preview page got Displayed.");
		Thread.sleep(500);
		Logout();
	}

}
