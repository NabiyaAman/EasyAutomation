package com.goeasy.testcases_finanace;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goeasy.genericlib.Browser;
import com.goeasy.genericlib.ExcelLib;
import com.goeasy.genericlib.ExtentReport;
import com.goeasy.genericlib.WebDriverCommonLib;
import com.goeasy.pageobjectlib.AddTravelers;
import com.goeasy.pageobjectlib.Air;
import com.goeasy.pageobjectlib.FlightSearchResult;
import com.goeasy.pageobjectlib.Login;
import com.goeasy.pageobjectlib.Logout;
import com.goeasy.pageobjectlib.Payment;
import com.goeasy.pageobjectlib.Quote4;
import com.goeasy.pageobjectlib.Reprice;
import com.goeasy.pageobjectlib.TSP;



public class GetLoan extends ExtentReport{
	WebDriver driver;
	WebDriverCommonLib wLib;
	
	Login loginPage;
	Air air;
	FlightSearchResult flightSearchResult;
	Quote4 quote4;
	Reprice reprice;
	TSP tsp;
	AddTravelers addTravelers;
	Payment payment;
	Logout logout;
	ExcelLib eLib = new ExcelLib();	


	
	@BeforeClass
	public void configBrforeClass(){
		//object initialization
		driver = Browser.getBrowser();
		wLib = new WebDriverCommonLib();
		loginPage = PageFactory.initElements(driver, Login.class);
		air = PageFactory.initElements(driver, Air.class);
		flightSearchResult = PageFactory.initElements(driver, FlightSearchResult.class);
		quote4 = PageFactory.initElements(driver, Quote4.class);
		reprice = PageFactory.initElements(driver, Reprice.class);
		tsp = PageFactory.initElements(driver, TSP.class);
		addTravelers = PageFactory.initElements(driver, AddTravelers.class);
		payment = PageFactory.initElements(driver, Payment.class);
		logout = PageFactory.initElements(driver, Logout.class);
		
	
		
	}
		
	
	public void login() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		loginPage.navigateToApp();
		String userName=eLib.getExcelData("Login",0,1);
		String passWord=eLib.getExcelData("Login",1,1);
		
		loginPage.loginToAPP(userName, passWord);
		
		
//		test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName());
//		
//		 Assert.assertTrue(1 > 0);
		
	}

	
	@Test(priority=1)
	public void oneWayBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		
		login();
		test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Assert.assertTrue(1 > 0);
		Actions act = new Actions(driver);
		String from=eLib.getExcelData("Air",0,1);
		String to=eLib.getExcelData("Air",1,1);
		air.searchFlightOneWay(from, to, act);
		
		
		flightSearchResult.selectOneWayFlight();
		quote4.quoteIt();
		tsp.clickOnItenaryBook();
		reprice.repriceBook();
		
	
		
	
		
		
//		addTravelers.addTravelers(act);
//		tsp.clickOnTicketFlight();
//		payment.makePayment();
//		Thread.sleep(50000);
		
		
//		if(driver.findElement(By.id("payAndTicket")).isDisplayed()){
//			tsp.backToTsp();
//		}
//		else{
//			WebElement wb = driver.findElement(By.xpath("//span[@class='text-darkgrey']"));
//			Assert.assertTrue(wb.isDisplayed());
//		}
			
	}
	
	
//	 @AfterMethod
//     public  void LogTestResult(ITestResult result) throws Exception
//     {
//    	 if(result.getStatus()==ITestResult.FAILURE)
//    	 {
//    	  
////    	 String screenshot_path=Utility.captureScreenshot(driver, result.getName());
////    	 String image= logger.addScreenCapture(screenshot_path);
//    		// ExtentReport.logger.log(LogStatus.FAIL, "Title verification");
//    	 }
//    	  
//    	 
//     	
//     }
     
    
     
//     @AfterSuite
//     public void generateReport(){
////     	generateExtentReport.endReport();
//     }
}