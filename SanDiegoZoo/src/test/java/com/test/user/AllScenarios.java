package com.test.user;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.tools.ant.types.resources.LogOutputResource;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BasePackage.Base_Class;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class AllScenarios extends Base_Class {

	Base_Class Base_Class;
	com.pages.diet_management.Diet_Formulation Diet_Formulation;
	com.pages.diet_management.Diet_Preparation Diet_Preparation;
	com.pages.diet_management.Diet_Sheets Diet_Sheets;
	com.pages.notifications.All_System_Requests All_System_Requests;
	com.pages.notifications.Diet_Management_Request Diet_Management_Request;
	com.pages.notifications.My_Notifications My_Notifications;
	com.pages.notifications.My_Requests My_Requests;
	com.pages.notifications.Nutrition_Warehouse_Issue_Sheets Nutrition_Warehouse_Issue_Sheets;
	com.pages.notifications.Nutrition_Warehouse_Pickup_Requests Nutrition_Warehouse_Pickup_Requests;
	com.pages.nutrient_data.Feed_Nutrient_Data Feed_Nutrient_Data;
	com.pages.nutrient_data.Nutrient_Data_Upload Nutrient_Data_Upload;
	com.pages.nutrient_data.Taxa_Energy_Requirements Taxa_Energy_Requirements;
	com.pages.nutrient_data.Taxa_Nutrient_Requirements Taxa_Nutrient_Requirements;
	com.pages.reports.Diet_Management_Report Diet_Management_Report;
	com.pages.reports.Inventory_Item_And_Feed_Type_Mapping Inventory_Item_And_Feed_Type_Mapping;
	com.pages.reports.Inventory_Report Inventory_Report;
	com.pages.reports.Notification_Report Notification_Report;
	com.pages.reports.Nutrient_Data_Report Nutrient_Data_Report;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;

	@BeforeSuite
	public void reference() {
		Base_Class = new Base_Class();
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Diet_Formulation = new com.pages.diet_management.Diet_Formulation();
		Diet_Preparation = new com.pages.diet_management.Diet_Preparation();
		Diet_Sheets = new com.pages.diet_management.Diet_Sheets();
		All_System_Requests = new com.pages.notifications.All_System_Requests();
		Diet_Management_Request = new com.pages.notifications.Diet_Management_Request();
		My_Notifications = new com.pages.notifications.My_Notifications();
		My_Requests = new com.pages.notifications.My_Requests();
		Nutrition_Warehouse_Issue_Sheets = new com.pages.notifications.Nutrition_Warehouse_Issue_Sheets();
		Nutrition_Warehouse_Pickup_Requests = new com.pages.notifications.Nutrition_Warehouse_Pickup_Requests();
		Feed_Nutrient_Data = new com.pages.nutrient_data.Feed_Nutrient_Data();
		Nutrient_Data_Upload = new com.pages.nutrient_data.Nutrient_Data_Upload();
		Taxa_Energy_Requirements = new com.pages.nutrient_data.Taxa_Energy_Requirements();
		Taxa_Nutrient_Requirements = new com.pages.nutrient_data.Taxa_Nutrient_Requirements();
		Diet_Management_Report = new com.pages.reports.Diet_Management_Report();
		Inventory_Item_And_Feed_Type_Mapping = new com.pages.reports.Inventory_Item_And_Feed_Type_Mapping();
		Inventory_Report = new com.pages.reports.Inventory_Report();
		Notification_Report = new com.pages.reports.Notification_Report();
		Nutrient_Data_Report = new com.pages.reports.Nutrient_Data_Report();

	}

	@Test(dataProvider = "TestData")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws Throwable {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {

				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				setup();
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");

				switch (testdata.get("TextMessage").toString()) {

				case "Diet Formulation":
					context.setAttribute("fileName", "Diet_Formulation");
					Diet_Formulation.DietFormulation(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Diet_Formulation");
					driver.quit();

				case "Diet Preparation":
					context.setAttribute("fileName", "Diet_Preparation");
					Diet_Preparation.DietPreparation(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Diet_Preparation");
					driver.quit();

				case "Diet Sheets":
					context.setAttribute("fileName", "Diet_Sheets");
					Diet_Sheets.DietSheets(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Diet_Sheets");
					driver.quit();

				case "All System Requests":
					context.setAttribute("fileName", "All_System_Requests");
					All_System_Requests.AllSystemRequests(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "All_System_Requests");
					driver.quit();

				case "Diet Management Request":
					context.setAttribute("fileName", "Diet_Management_Request");
					Diet_Management_Request.DietManagementRequest(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Diet_Management_Request");
					driver.quit();

				case "My Notifications":
					context.setAttribute("fileName", "My_Notifications");
					My_Notifications.MyNotifications(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "My_Notifications");
					driver.quit();

				case "My Requests":
					context.setAttribute("fileName", "My_Requests");
					My_Requests.MyRequests(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "My_Requests");
					driver.quit();

				case "Nutrition Warehouse Issue Sheets":
					context.setAttribute("fileName", "Nutrition_Warehouse_Issue_Sheets");
					Nutrition_Warehouse_Issue_Sheets
							.NutritionWarehouseIssueSheets(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Nutrition_Warehouse_Issue_Sheets");
					driver.quit();

				case "Nutrition Warehouse Pickup Requests":
					context.setAttribute("fileName", "Nutrition_Warehouse_Pickup_Requests");
					Nutrition_Warehouse_Pickup_Requests
							.NutritionWarehousePickupRequests(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Nutrition_Warehouse_Pickup_Requests");
					driver.quit();

				case "Feed Nutrient Data":
					context.setAttribute("fileName", "Feed_Nutrient_Datas");
					Feed_Nutrient_Data.FeedNutrientData(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Feed_Nutrient_Data");
					driver.quit();

				case "Nutrient Data Upload":
					context.setAttribute("fileName", "Nutrient_Data_Upload");
					Nutrient_Data_Upload.NutrientDataUpload(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Nutrient_Data_Upload");
					driver.quit();

				case "Taxa Energy Requirements":
					context.setAttribute("fileName", "Taxa_Energy_Requirements");
					Taxa_Energy_Requirements.TaxaEnergyRequirements(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Taxa_Energy_Requirements");
					driver.quit();

				case "Taxa Nutrient Requirements":
					context.setAttribute("fileName", "Taxa_Nutrient_Requirements");
					Taxa_Nutrient_Requirements.TaxaNutrientRequirements(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Taxa_Nutrient_Requirements");
					driver.quit();

				case "Diet Management Report":
					context.setAttribute("fileName", "Diet_Management_Report");
					Diet_Management_Report.DietManagementReport(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Diet_Management_Report");
					driver.quit();

				case "Inventory Item And Feed Type Mapping":
					context.setAttribute("fileName", "Inventory_Item_And_Feed_Type_Mapping");
					Inventory_Item_And_Feed_Type_Mapping
							.InventoryItemAndFeedTypeMapping(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Inventory_Item_And_Feed_Type_Mapping");
					driver.quit();

				case "Inventory Report":
					context.setAttribute("fileName", "Inventory_Report");
					Inventory_Report.InventoryReport(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Inventory_Report");
					driver.quit();

				case "Notification Report":
					context.setAttribute("fileName", "Notification_Report");
					Notification_Report.NotificationReport(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Notification_Report");
					driver.quit();

				case "Nutrient Data Report":
					context.setAttribute("fileName", "Nutrient_Data_Report");
					Nutrient_Data_Report.NutrientDataReport(testdata.get("TextMessage").toString());
					context.setAttribute("fileName", "Nutrient_Data_Report");
					driver.quit();

				default:
					break;

				}

				// EndTest
				System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

			}

		} catch (

		Exception e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		} catch (AssertionError e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		}
	}

	@DataProvider(name = "TestData")
	public static Object[][] gettestdate() throws IOException {

		Object[][] objectarry = null;
		java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

		objectarry = new Object[completedata.size()][1];

		for (int i = 0; i < completedata.size(); i++) {
			objectarry[i][0] = completedata.get(i);
		}
		return objectarry;

	}

}
