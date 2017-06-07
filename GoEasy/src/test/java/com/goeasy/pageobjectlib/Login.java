//=====================================================================================
	//File:           GoEasy Login Keyword
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
package com.goeasy.pageobjectlib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.goeasy.genericlib.Browser;
import com.goeasy.genericlib.ExcelLib;
import com.goeasy.genericlib.WebDriverCommonLib;



public class Login extends WebDriverCommonLib{

	 @FindBy(id="username")
	 private WebElement userNameEdt;
	 
	 @FindBy(id="password")
	 private WebElement passwordEdt;
	 
	 @FindBy(xpath="//button[@class='btn btn-primary btn-login']")
	 private WebElement signIn;
	 
	 
	 //Open gthe browser and enter the URL
	 public void navigateToApp() throws EncryptedDocumentException, InvalidFormatException, IOException
	   {
			 ExcelLib eLib = new ExcelLib();
			 
			 String url=eLib.getExcelData("Login",2,1);
			 Browser.driver.get(url);
	         waitForPageToLoad();
	    }
	 
	 
	 //enter the credentials
	 public void loginToAPP(String userName , String password) throws InterruptedException
	    {
		
		 userNameEdt.sendKeys(userName);
		 passwordEdt.sendKeys(password);
		 Thread.sleep(4000);
		 
		 try
		    {  
			 
			//code that may throw exception  
			 signIn.click();
			}
		 catch(Exception ref)
		    {
		
				signIn.click();
				
			}  
		 
		 
		 signIn.click();
		 Thread.sleep(4000);
		 waitForPageToLoad();

      }
}
