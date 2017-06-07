//=====================================================================================
	//File:           GoEasy SignIn Keyword
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
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.goeasy.genericlib.Browser;
import com.goeasy.genericlib.ExcelLib;
import com.goeasy.genericlib.WebDriverCommonLib;
import com.goeasy.pageobjectlib.Register;

public class SignIn extends WebDriverCommonLib
   {
	
			 private WebDriver driver;
			 ExcelLib eLib = new ExcelLib();
			 
			 
			 @FindBy(linkText="Sign-in")
			 private WebElement signIn;
			 
			 @FindBy(id="field-491596")
			 private WebElement signInEmail;
			 
			 @FindBy(id="field-491597")
			 private WebElement signInPassword;
			 
			 @FindBy(xpath="//*[@id='form_submit']")
			 private WebElement signInbutton;
			 
			 @FindBy(id="email")
			 private WebElement email;
			 
			 @FindBy(id="password")
			 private WebElement password;
			 
			 @FindBy(id="repassword")
			 private WebElement retypePassword;
			 
			 @FindBy(id="reg_firstName")
			 private WebElement firstName;
			 
			 @FindBy(id="reg_lastName")
			 private WebElement lastName;
			 
			 @FindBy(linkText="GET A LOAN")
			 private WebElement getALoan;
			 
			 @FindBy(id="continue_button_1")
			 private WebElement continueButton;
			
			 @FindBy(id="email_1")
			 private WebElement email1;
			 
			 @FindBy(id="loan_amount_1")
			 private WebElement loanAmount;
			
			 @FindBy(css="input[id='gender_1']")
			 private WebElement mr;
			 
			 @FindBy(css="input[id='first_name_1']")
			 private WebElement fName;
			 
			 @FindBy(css="input[id='last_name_1']")
			 private WebElement lName;
			 
			 @FindBy(id="phone_number_1")
			 private WebElement phoneNo;
			 
			 @FindBy (id="loan_purpose_3")
			 private WebElement loanPurpose;
			    
			 @FindBy(id="continue_button_2")
			 private WebElement continueButton2;
			 
			 @FindBy(id="continue_button_3")
			 private WebElement continueButton3;
			   
			 @FindBy(css="input[id='birthday_year']")
			 private WebElement birthYear1;
			 
			 @FindBy(id="loan_radio_2_month")
			 private WebElement monthClass;
			 
			 @FindBy(id="loan_radio_3_day")
			 private WebElement dayClass;
			
             @FindBy(css="input[id='postal_code_1']")
			 private WebElement postalCode;
				
			 @FindBy(css="input[id='street_address_1']")
			 private WebElement streetAddress;
				
			 @FindBy(id="address_line_two_11")
			 private WebElement addressLine_2;
				
			 @FindBy(css="input[id='city_1']")
			 private WebElement city;
				
			 @FindBy(xpath="//span[contains(text(),'I have read and agree to the ')]")
			 private WebElement tAndc;
				
			 @FindBy(id="continue_button_4")
			 private WebElement continueButton4;
				
			 @FindBy(xpath="//*[@id='provinces_1']")
			 private WebElement province;
				
			 @FindBy(id="employment_1")
			 private WebElement fulltime;
				
			 @FindBy(id="continue_button_7")
			 private WebElement continueButton5;
			
			 @FindBy(id="continue_button_7")
			 private WebElement continueButton7;
			
			 @FindBy(id="continue_button_6")
			 private WebElement continueButton6;
			
			
			@FindBy(id="work_phone_number_1")
			private WebElement workPhone;
			
			@FindBy(id="continue_button_8")
			private WebElement continueButton8;
			
			@FindBy(id="net_pay_1")
			private WebElement netPay;
			
			@FindBy(id="continue_button_9")
			private WebElement continueButton9;
			 
			
			@FindBy(id="other_income_yes")
			private WebElement anyOtherIncomeYes;
			
			@FindBy(css="input[id='other_income_no']")
			private WebElement anyOtherIncomeNo;
				
			@FindBy(id="continue_button_10")
			private WebElement continueButton10;
			
		
			@FindBy(id="continue_button_11")
			private WebElement continueButton11;
			
			
			@FindBy(css="input[id='co_applicant_2']")
			private WebElement SinNo;
			
			@FindBy(id="continue_button_12")
			private WebElement continueButton12;
			
			@FindBy(id="continue_button_13")
			private WebElement continueButton13;
			
			@FindBy(id="continue_button_14")
			private WebElement continueButton14;
			
			@FindBy(id="continue_button_15")
			private WebElement continueButton15;
			
			@FindBy(id="tu-submit")
			private WebElement submitTU;
 
 
        //constructor
		public SignIn(WebDriver driver) 
		   {
				// TODO Auto-generated constructor stub
			 PageFactory.initElements(driver, this);
				this.driver=driver;
			}
		
		
		
	  //Open the browser and enter the URL
	   public void navigateToApp() throws EncryptedDocumentException, InvalidFormatException, IOException
	      {
		 
	           	 String url=eLib.getExcelData("Login",2,1);
				 Browser.driver.get(url);
	      }
	 
	  //click on the sign in button
	   public void clickSignIn()
	      {
		         signIn.click();
		 
	      }
	 
	   //enter the email and password of the existing account to login
	   public void enterEmailPassword() throws EncryptedDocumentException, InvalidFormatException, IOException
	       {
				 String emailId =eLib.getExcelData("SignIn",1,0);
				 String pass = eLib.getExcelData("SignIn",1,1);
				 
				 
				 signInEmail.sendKeys(emailId);
				 signInPassword.sendKeys(pass);
		 
	        }
	 
	 //click on the signIn button
	 public void clickSignButton()
	      {
		         signInbutton.click();
	      }
	 
	 //click on getAloan
	 public void clickGetALoan()
		 {
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				waitForPageToLoad();
	            getALoan.click();
		 }

	
	 //Assert the autopopulated email
	 public void AssertAutopopulatedEmailField() throws EncryptedDocumentException, InvalidFormatException, IOException
		 {
			String email2= eLib.getExcelData("SignIn",1,0);

			if (!email1.getAttribute("value").equals(email2)) 
			   {
				Assert.assertNotSame("email not populated correctly",email1.getAttribute("value"));
			  }
		 }
	 
	 
		
		//Assert if the loan purpose is checked
		public void isLoanPurposeChecked() throws EncryptedDocumentException, InvalidFormatException, IOException
		 {
			//loanPurpose.findElement(By.tagName("input")).isSelected();
			
			String purpose= eLib.getExcelData("Register",1,6);

			if (!loanPurpose.getAttribute("value").equals(purpose)) 
			   {
				Assert.assertNotSame("loan purpose not selected correctly",loanPurpose.getAttribute("value"));
			  }
			
		 }
		
		
		//assertSecondscreen data autopopulated
		public void AssertSecondScreenIfPopulated() throws EncryptedDocumentException, InvalidFormatException, IOException
		   {
			
            String fname =eLib.getExcelData("Register",1,3);
			if (!fName.getAttribute("value").equals(fname)) 
			   {
				Assert.assertNotSame("first name not populated correctly",fName.getAttribute("value"));
			  }
			
			String lname =eLib.getExcelData("Register",1,4);
			if (!lName.getAttribute("value").equals(lname)) 
			   {
				Assert.assertNotSame("last name not populated correctly",lName.getAttribute("value"));
			  }
			

			
		}
		
		
		//assert if the third screen details are autopopulted
		public void AssertThirdScreenIfPopulated() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			String year =eLib.getExcelData("Register",1,9);
			if (!birthYear1.getAttribute("value").equals(year)) 
			     {
				   Assert.assertNotSame("yaer not populated correctly",birthYear1.getAttribute("value"));
			     }
			
			String month = eLib.getExcelData("Register",1,11);
            WebElement ele = driver.findElement(By.xpath("//span[text()='"+month+"']"));
            if(!ele.isSelected())
                {
            	    Assert.assertNotSame("month not selected correctly",ele.getAttribute("value"));
                 }
			
            String day = eLib.getExcelData("Register",1,10);
			WebElement day1 = driver.findElement(By.xpath("//span[text()='"+day+"']"));
			 if(!day1.isSelected())
	             {
	            	Assert.assertNotSame("day not selected correctly",day1.getAttribute("value"));
	             }
		    
			
			
       }
		
		
		//assert the address screen details autopopulated
		public void AssertAddressScreen() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			String postal =eLib.getExcelData("Register",1,14);
			if (!postalCode.getAttribute("value").equals(postal)) 
			    {
				    Assert.assertNotSame("postal code not populated correctly",postalCode.getAttribute("value"));
			   }
			
			String street =eLib.getExcelData("Register",1,12);
			if (!streetAddress.getAttribute("value").equals(street)) 
			    {
				   Assert.assertNotSame("street address not populated correctly",streetAddress.getAttribute("value"));
			    }
			
			String city1 =eLib.getExcelData("Register",1,13);
			if (!city.getAttribute("value").equals(city)) 
			     {
				   Assert.assertNotSame("city not populated correctly",city.getAttribute("value"));
			    }
			
			String province1 =eLib.getExcelData("Register",1,15);
			if (!province.getAttribute("value").equals(province1)) 
			     {
				   Assert.assertNotSame("province not populated correctly",province.getAttribute("value"));
			     }
			
		}
		
}