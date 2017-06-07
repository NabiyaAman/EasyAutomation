//=====================================================================================
//File:              GoEasy UserFlow6
//Created:           2017/05/11
//Last Changed:      2017/06/04
//Author:            Nabiya and Venugopal reddy 
//Test case name:    User flow 6 for getting loan  
//=====================================================================================
//History:
//$Log:  
//Revision 
//                   Initial Draft of Test Case.
//=====================================================================================
package com.goeasy.testcases_finance;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.goeasy.genericlib.Browser;
import com.goeasy.genericlib.ExcelLib;
import com.goeasy.genericlib.ExtentReport;
import com.goeasy.genericlib.WebDriverCommonLib;
import com.goeasy.pageobjectlib.CoApp;
import com.goeasy.pageobjectlib.GetALoan;
import com.goeasy.pageobjectlib.Login;
import com.goeasy.pageobjectlib.Logout;
import com.goeasy.pageobjectlib.Register;
import com.goeasy.pageobjectlib.SignIn;

/* ===============================================Keyword details ================================================================== 
1) Login
2) Register
3) CoApp
================================================================================================================== */


public class UserFlow6 extends ExtentReport{
	/*============================================================================================================================
	 
	 Test Goal : Userflow 6, Sign for a registers user->My profile->get a loan->profile data is prepopulated
	 ->fill rest of the application(ntpay<1200 weekly)->complete application
	 ======================================================================================*/
	
	WebDriver driver;
	WebDriverCommonLib wLib;
	ExcelLib eLib;
	String filePath="D:\\EasyAutomation\\GoEasyAuto\\requiredSource\\TestData1.xlsx";
	
	
	Login loginPage;
	Register register;
	SignIn signIn;
	GetALoan getLoan;
	CoApp coapp;


		
	@BeforeClass
	public void configBrforeClass(){
		//object initialization
		driver = Browser.getBrowser();
		
		
		wLib = new WebDriverCommonLib();
		eLib = new ExcelLib();
		loginPage = PageFactory.initElements(driver, Login.class);
	
		getLoan = PageFactory.initElements(driver, GetALoan.class);
		register = PageFactory.initElements(driver, Register.class);
		signIn = PageFactory.initElements(driver, SignIn.class);
		coapp = PageFactory.initElements(driver, CoApp.class);
		
	}
	
	
	/* =======================================Test Execution=================================================================*/
	@Test
    public void getLoan() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		
		
		       //Navigate to Home page and click on Sign and user is taken Register page
				register.navigateToApp();
				register.clickSignIn();
				
				
				//Sign in with an existing user's email and password
				signIn.enterEmailPassword();
				signIn.clickSignButton();
				
				
                //click on get A loan, the user is take to application page
				Thread.sleep(1000);
				signIn.clickGetALoan();
				wLib.waitForPageToLoad();
				
				//Loan details page- Screen1
				getLoan.switchwindow();
				signIn.AssertAutopopulatedEmailField();
				register.AssertAutopopulatedLoanField();
				register.enterLoanPurpose();
				Thread.sleep(20000);
				register.clickContinue1();
				
				//About yourself- screen2
				Thread.sleep(1000);
				register.clickGender();
				signIn.AssertSecondScreenIfPopulated();
				register.enterPhoneNumber();
				Thread.sleep(20000);
				register.clickContinue2();
				
				//birthday details-screen3
				Thread.sleep(1000);
				signIn.AssertThirdScreenIfPopulated();
				Thread.sleep(20000);
				register.clickContinue3();
				
				//Address details-screen 4
				signIn.AssertAddressScreen();
				Thread.sleep(20000);
                register.clickContinue4();
				
				//Employment status- screen5
                Thread.sleep(1000);
				register.enterEmpStatus();
				Thread.sleep(20000);
				register.clickContinue5();
                Thread.sleep(10000);
				System.out.println("Reachced here");
				

				//Select citizen ship - Screen 6
				register.enterCitizenShip();
				Thread.sleep(2000);
				register.clickContinue6();
				
				
				//Select the current job duration - Screen7
				Thread.sleep(1000);
				register.enterCurrentjobDuration();
				Thread.sleep(2000);
				register.clickContinue8();
				
				//Select the netpay and type of salary receive - screen 8
				Thread.sleep(1000);
				coapp.enterNetPay();
				Thread.sleep(2000);
				register.clickContinue9();
				
				// Select the income via direct deposit and child tax credit type -screen 9
				register.enterIncome();
				Thread.sleep(2000);
				register.clickContinue10();
				
				// Select the other income type and easy home customer type -screen 10
				register.enterOtherincome();
				Thread.sleep(2000);
				register.clickContinue11();
				Thread.sleep(10000);
				
				
				//Select the SIN and add the other person into your application - screen 11
                Thread.sleep(2000);
				coapp.clickContinue12();
				Thread.sleep(10000);
				
				//Fill the details for Co app section
				eLib.refreshExcelData();
				coapp.enterEmail();
				coapp.clickGenderCoApp();
				
				coapp.enterFnameLname();
				Thread.sleep(1000);
				coapp.enterPhoneNumber();
				coapp.enterBirthdayDetails();
				Thread.sleep(1000);
				
				
				coapp.enterMaritalStatus();
				Thread.sleep(1000);
				coapp.clickAddressSameCheckbox();
				Thread.sleep(1000);
				coapp.enterCitizenShip();
				Thread.sleep(1000);
				coapp.enterEmpStatus();
				Thread.sleep(1000);
				coapp.enterCurrentjobDuration();
				coapp.enterWorkPhone();
				Thread.sleep(1000);
				coapp.enterEmploymentDeatils();
				Thread.sleep(1000);
				coapp.enterNetpayCoApp();
				
				
				//work stopped add class argument to span text
				Thread.sleep(1000);
				coapp.enterIncome();
				coapp.enterSin();
				Thread.sleep(1000);
				coapp.selectPlaceandPaydayLoans();
				Thread.sleep(1000);
				coapp.selectLiabilities();
				Thread.sleep(10000);
				coapp.clickContinue();
				
				
				//Select the current address duration - screen 12
				register.enterCurrentAddress();
				Thread.sleep(2000);
				register.clickContinue13();
				
				//Select the place type and car type - screen 13
				register.selectPlaceCar();
				Thread.sleep(2000);
				register.clickContinue14();
				Thread.sleep(5000);
				Thread.sleep(10000);
				
				
				
				//Select pay day loan type and child support and unpaid taxes - screen 14
				register.selectPayChildsupp();
				Thread.sleep(2000);
				register.clickContinue15();
				Thread.sleep(10000);
				
				//TU questions
				register.scrollToBottom();
				Thread.sleep(10000);
		        register.submitAnswers();
				
                test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		        driver.quit();
	}
		
	
}
	