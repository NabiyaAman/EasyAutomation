//=====================================================================================
	//File:           GoEasy ClearDataSF
	//Created:        2017/05/11
	//Last Changed:   2017/06/6
	//Author:         Nabiya and Venugopal reddy 
	//Test case name:   
	//=====================================================================================
	//History:
	//$Log:  
	//Revision 
    //	                   Initial Draft of Test Case.
	//=====================================================================================
package com.goeasy.testcases_finance;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.goeasy.genericlib.Browser;
import com.goeasy.genericlib.ExcelCode;
import com.goeasy.genericlib.ExtentReport;
import com.goeasy.genericlib.WebDriverCommonLib;
import com.goeasy.pageobjectlib.Login;
import com.goeasy.pageobjectlib.SalesForce;
/* ===============================================Keyword details ================================================================== 
1) SalesForce

================================================================================================================== */

public class ClearDataSF extends ExtentReport
{
	/*============================================================================================================================
	 
	 Test Goal : ClearDataSF, Clear Data from backend so that test user can apply for loan and successfully complete application.
	 =============================================================================================================================*/
	
	WebDriver driver;
	WebDriverCommonLib wLib;
	SalesForce sf;
	
	@BeforeClass
	public void openBrowser()
	  {
			 //object initialization
			 driver = Browser.getBrowser();
	         wLib = new WebDriverCommonLib();
			 sf = PageFactory.initElements(driver, SalesForce.class);
		
		
       }
	
	
	@Test
	public void CancelApplication() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
			 sf.navigateToApp();
			 sf.clearApplication();
	
			 test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	  }
	
	
	@AfterClass
	public void closeBrowser()
	  {
		      driver.quit();
	  }
}

