//=====================================================================================
	//File:           GoEasy Register Keyword
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

 public class Register extends WebDriverCommonLib
    {
	
	private static final String submit = "SUBMIT";
    private WebDriver driver;
    ExcelLib eLib = new ExcelLib();
 
	 @FindBy(linkText="Sign-in")
	 private WebElement signIn;
	 
	 @FindBy(linkText="REGISTER")
	 private WebElement register;
	 
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
	 
	 @FindBy(linkText="Get a loan")
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
	    
	 @FindBy(id="continue_button_2")
	 private WebElement continueButton2;
	 
	 @FindBy(id="continue_button_3")
	 private WebElement continueButton3;
	   
	 @FindBy(css="input[id='birthday_year']")
	 private WebElement birthYear1;
	   
	 @FindBy(css="input[id='postal_code_1']")
	 private WebElement postalCode;
		
	 @FindBy(css="input[id='street_address_1']")
	 private WebElement streetAddress;
		
	 @FindBy(id="address_line_two_11")
	 private WebElement addressLine_2;
		
	 @FindBy(css="input[id='city_1']")
	 private WebElement city;
	 
	 @FindBy(xpath="/html/body/div[4]/div[4]/div[3]/div[2]")
	 private WebElement changeCountry;
	 
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
	 
 
 
	public Register(WebDriver driver) 
		   {
				// TODO Auto-generated constructor stub
			 PageFactory.initElements(driver, this);
				this.driver=driver;
			}
		
		 
		
	 //open browser and enter URl
	 public void navigateToApp() throws EncryptedDocumentException, InvalidFormatException, IOException
	     {
		 
	           	 String url=eLib.getExcelData("Login",2,1);
				 Browser.driver.get(url);
	      }
	 
	 //click on the signin
	 public void clickSignIn()
	    {
		         signIn.click();
		 
	    }

	 //click on the register button
	 public void clickRegister()
	    {
		 	     register.click();
			     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     }
	 
	 
	 //enter The data for the registration page
	 public void enterData() throws EncryptedDocumentException, InvalidFormatException, IOException 
	 {
		         eLib.refreshExcelData();//refreshes the excel values
				 String emailId =eLib.getExcelData("Register",1,0);
				 String pass = eLib.getExcelData("Register",1,1);
				 String retypePass = eLib.getExcelData("Register",1,2);
				 String fname = eLib.getExcelData("Register",1,3);
				 String lname = eLib.getExcelData("Register",1,4);
				 String promotions = eLib.getExcelData("Register",1,5);
				 System.out.println(promotions);
				 
				 email.sendKeys(emailId);
				 password.sendKeys(pass);
				 retypePassword.sendKeys(retypePass);
				 firstName.sendKeys(fname);
				 lastName.sendKeys(lname);
				 
				 

		 }
			
	 

	 //click on the submit for the registration page
	 public void clickSubmit()
	     {
				 WebElement ele = driver.findElement(By.xpath("//button[text()='"+submit+"']"));
				 JavascriptExecutor js1=(JavascriptExecutor)driver;
				 js1.executeScript("arguments[0].click()", ele);
				 
				 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 
	     }
	 
	 
	//click on get a loan button
	 public void clickGetALoan()
		{
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				waitForPageToLoad();
	            getALoan.click();
		}


	 //assert the autopopulated loan field
	 public void AssertAutopopulatedLoanField()
		{
			
            if (!loanAmount.getAttribute("value").equals("500")) 
			   {
				Assert.assertNotSame("Loan Amount not populated correctly",loanAmount.getAttribute("value"));
			   }
		}
		
		
	 //assert the email field which is autopopulated
	 public void AssertAutopopulatedEmailField() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			String email2= eLib.getExcelData("Register",1,0);

			if (!email1.getAttribute("value").equals(email2)) 
			   {
				Assert.assertNotSame("email not populated correctly",loanAmount.getAttribute("value"));
			  }
		}

	 
	   //enter the loan purpose
		public void enterLoanPurpose() throws EncryptedDocumentException, InvalidFormatException, IOException
		 {
				 String purpose = eLib.getExcelData("Register",1,6);
				 WebElement ele = driver.findElement(By.xpath("//span[text()='"+purpose+"']"));
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click()", ele);
                 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 }
		
		
		//click continue on the first screen
		public void clickContinue1()
		  {
				 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				 JavascriptExecutor js1=(JavascriptExecutor)driver;
				 js1.executeScript("arguments[0].click()", continueButton);
		  }
		

		//click on the gender
		public void clickGender() 
		{

			    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("arguments[0].click()", mr);
			    
		}
		
		
		//assert all the names autopopulated
		public void AssertAutopopulatedFields() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
					String firstName=eLib.getExcelData("Register",1,3);
					String lastName=eLib.getExcelData("Register",1,4);		
		
					if (!fName.getAttribute("value").equals(firstName) ) 
					   {
						Assert.assertNotSame("first Name not populated correctly",fName.getAttribute("value"));
					   }
					
					if (!lName.getAttribute("value").equals(lastName) ) 
					   {
						Assert.assertNotSame("last Name not populated correctly",lName.getAttribute("value"));
					   }
					
			
			
		}
		
	
		//enter the phone number
		public void enterPhoneNumber() throws EncryptedDocumentException, InvalidFormatException, IOException
		   {
					String phone = eLib.getExcelData("Register",1,8);
					phoneNo.sendKeys(phone);
			
		   }
		
		//click on the continue button of the second screen
		public void clickContinue2()
		   {
					 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					 JavascriptExecutor js1=(JavascriptExecutor)driver;
					 js1.executeScript("arguments[0].click()", continueButton2);
		   }
		
		
		//enter the birthday details
		public void enterBirthdayDetails() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
			   
				    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
				   
				    String birthyear = eLib.getExcelData("Register",1,9);		   
					birthYear1.sendKeys(birthyear);
					
					String month = eLib.getExcelData("Register",1,11);
		            WebElement ele = driver.findElement(By.xpath("//span[text()='"+month+"']"));
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", ele);
					
					String day = eLib.getExcelData("Register",1,10);
					WebElement day1 = driver.findElement(By.xpath("//span[text()='"+day+"']"));
					JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("arguments[0].click()", day1);
					
	                Thread.sleep(2000);
				
				
				
			}
		 
		//click on continue in the third screen
		public void clickContinue3()
		   {
				    JavascriptExecutor js2=(JavascriptExecutor)driver;
					js2.executeScript("arguments[0].click()", continueButton3);
		   }
		   


		//clcik on continue on the fourth screen
		public void clickContinue4()
			 {
				    JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("arguments[0].click()", continueButton4);
					driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 }
			 
			
			   
		//enter the address details
		public void enterAddressDetails() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
          {
				   
				   String postalcode = eLib.getExcelData("Register",1,14);
				   String street = eLib.getExcelData("Register",1,12);
				   String citydata = eLib.getExcelData("Register",1,13);
				   String province1 = eLib.getExcelData("Register",1,15);
				   
				
				   
				   postalCode.sendKeys(postalcode);
				   //postalCode.click();
				   streetAddress.sendKeys(street);
				   streetAddress.click();
				   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				   postalCode.click();
				   addressLine_2.click();
				   city.sendKeys(citydata);
				   //postalCode.click();
				  
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				    province.click();
				    //driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				    WebElement ele1 = driver.findElement(By.xpath("//li[contains(text(), '"+province1+"')]"));
				    ele1.click();
				    

					
           }
		
		
	 //click on terms and codition
	   public void clickTermsAndConditions()
			{
				   tAndc.click();
				   driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				   
			}
			   


       //click on the mployment status
        public void enterEmpStatus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		    {
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       String employmentStatus1= eLib.getExcelData("Register",1,16);
					
				   WebElement ele = driver.findElement(By.xpath("//span[text()='"+employmentStatus1+"']"));
				   JavascriptExecutor js=(JavascriptExecutor)driver;
				   js.executeScript("arguments[0].click()", ele);
                  
				   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	                
						
	        	
		    }
			   
			   
	  //click on the continue on fifth screen	   
	   public void clickContinue5()
			{ 
	                 JavascriptExecutor js5=(JavascriptExecutor)driver;
					 js5.executeScript("arguments[0].click()", continueButton7);
					 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   
			}
	  
			   
	//select the citizenship	   
	   public void enterCitizenShip() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        String employmentCitizen= eLib.getExcelData("Register",1,19);
					
					WebElement ele = driver.findElement(By.xpath("//span[text()='"+employmentCitizen+"']"));
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", ele);
     
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               
					
			}
		   
		   
	   //click on the continue button on sixth screen	   
	   public void clickContinue6()
			{ 
			  				   
				     JavascriptExecutor js5=(JavascriptExecutor)driver;
					 js5.executeScript("arguments[0].click()", continueButton6);
					 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			}
			
	   
		//click on the currentjob duration	   
	   public void enterCurrentjobDuration() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        String employmentJobduration= eLib.getExcelData("Register",1,20);
					
					WebElement ele = driver.findElement(By.xpath("//span[text()='"+employmentJobduration+"']"));
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", ele);
                
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
              
					
			}
	   
	   //enter work phone number
	   public void enterWorkPhone() throws EncryptedDocumentException, InvalidFormatException, IOException
	       {
		       
		            String phone= eLib.getExcelData("Register",1,21);
		            workPhone.sendKeys(phone);
	       }
	   
		   
		   
	  //click on the continue button in the job duration 	   
	   public void clickContinue8()
			   { 
			  				   
				   JavascriptExecutor js5=(JavascriptExecutor)driver;
				   js5.executeScript("arguments[0].click()", continueButton8);
				   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   }
			 
	   
	   
	   //Select the netpay and type of salary receive - screen 8
       public void enterNetpay() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
				   String netPayAmount = eLib.getExcelData("Register",1,22);
				   
				   netPay.sendKeys(netPayAmount);
				   
				   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			       String employmentPayDuration= eLib.getExcelData("Register",1,23);
					
					WebElement ele = driver.findElement(By.xpath("//span[text()='"+employmentPayDuration+"']"));
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click()", ele);
               
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
             
					
				}
		   
		   
	  //click on the continue button on the 8th screen	  	   
	   public void clickContinue9()
			   { 
			  				   
				     JavascriptExecutor js5=(JavascriptExecutor)driver;
					 js5.executeScript("arguments[0].click()", continueButton9);
					 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   }
		  
			
	   // Select the income via direct deposit and child tax credit type
       public void enterIncome() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					    String bankDeposit = eLib.getExcelData("Register",1,24);
					    
					    WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'label_choice_container _10 clearfix')]//span[text()='"+bankDeposit+"']"));
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", ele);
					  
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				        String ctc_no= eLib.getExcelData("Register",1,25);
						
                        WebElement ele1 = driver.findElement(By.xpath("//div[contains(@class,'label_choice_container _11 clearfix')]//span[text()='"+ctc_no+"']"));
						JavascriptExecutor js1=(JavascriptExecutor)driver;
						js1.executeScript("arguments[0].click()", ele1);  
	              
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            
					
				}
		   		   
	  //click on continue	on the 9th screen	     
	   public void clickContinue10()
			   { 
			  				   
				      JavascriptExecutor js5=(JavascriptExecutor)driver;
					  js5.executeScript("arguments[0].click()", continueButton10);
					  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   }
	   
			
	   // Select the other income type and easy home customer type -screen 10
       public void enterOtherincome() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					    String otherIncome = eLib.getExcelData("Register",1,26);

					    WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'other_income_radio_2')]//span[text()='"+otherIncome+"']"));
						JavascriptExecutor js1=(JavascriptExecutor)driver;
						js1.executeScript("arguments[0].click()", ele1);  
					  
					   
					   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				       String easyCus= eLib.getExcelData("Register",1,27);
						
				       WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'current_customer_radio_1')]//span[text()='"+easyCus+"']"));
	                   JavascriptExecutor js=(JavascriptExecutor)driver;
					   js.executeScript("arguments[0].click()", ele); 
	             
					   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           			
				}
		   		   
		//click on continue on the 10th screen	   
       public void clickContinue11()
			   { 
			  				   
					    JavascriptExecutor js5=(JavascriptExecutor)driver;
						js5.executeScript("arguments[0].click()", continueButton11);
						driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   }
			 
       
       //Select the SIN and add the other person into your application - screen 11
	   public void enterSin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {          
		  
		                String easyCus= eLib.getExcelData("Register",1,28);
					   
					    WebElement ele1 = driver.findElement(By.xpath("//div[contains(@class,'label_choice_container _12 clearfix')]//span[text()='"+easyCus+"']"));
		               
						JavascriptExecutor js1=(JavascriptExecutor)driver;
						js1.executeScript("arguments[0].click()", ele1);  
					  
	                    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
          			
				}
		   		   
	   //click on continue on the 11th screen	  	   
	   public void clickContinue12()
			   { 
			  				   
					   JavascriptExecutor js5=(JavascriptExecutor)driver;
					   js5.executeScript("arguments[0].click()", continueButton12);
					   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   }
			   
			   
	   //Select the current address duration
	   public void enterCurrentAddress() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{       
		                
		                String employmentJobduration= eLib.getExcelData("Register",1,29);
						
						WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'current_address_radio_1')]//span[text()='"+employmentJobduration+"']"));
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", ele);
				             
					    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         			
				}
		   		   
	   //click on continue on the 12th screen	  	   	   
	   public void clickContinue13()
			   { 
			  				   
					   JavascriptExecutor js5=(JavascriptExecutor)driver;
					   js5.executeScript("arguments[0].click()", continueButton13);
					   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   }
			 
	   //Select the place type and car type - screen 13
	   public void selectPlaceCar() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
		                String easyCus= eLib.getExcelData("Register",1,30);

					    WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'own_place_radio_1')]//span[text()='"+easyCus+"']"));
						JavascriptExecutor js1=(JavascriptExecutor)driver;
						js1.executeScript("arguments[0].click()", ele1);  
									             
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						
						String ownPlace= eLib.getExcelData("Register",1,31);
                        WebElement ele2 = driver.findElement(By.xpath("//div[contains(@id,'own_car_radio_1')]//span[text()='"+ownPlace+"']"));
						JavascriptExecutor js2=(JavascriptExecutor)driver;
						js2.executeScript("arguments[0].click()", ele2);  
						
					             
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        			
				}
		   		   
	   //click on continue on the 13th screen	  	   	   
	   public void clickContinue14()
			   { 
			  				   
					   JavascriptExecutor js5=(JavascriptExecutor)driver;
					   js5.executeScript("arguments[0].click()", continueButton14);
					   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   }
			   
			 
	   //Select payday loan type and child support and unpaid taxes - screen 14
	   public void selectPayChildsupp() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
		                String ownPlace= eLib.getExcelData("Register",1,32);
                        WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'payday_radio_1')]//span[text()='"+ownPlace+"']"));
						JavascriptExecutor js1=(JavascriptExecutor)driver;
						js1.executeScript("arguments[0].click()", ele1);  
									             
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						
						String ownPlace1= eLib.getExcelData("Register",1,33);
						
						WebElement ele2 = driver.findElement(By.xpath("//div[contains(@id,'other_loans_radio_1')]//span[text()='"+ownPlace1+"']"));
						JavascriptExecutor js2=(JavascriptExecutor)driver;
						js2.executeScript("arguments[0].click()", ele2);  
						
					             
						driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
       			
				}
		   		   
	   //click on continue on the 14th screen	  	      
	   public void clickContinue15()
			   { 
			  				   
					   JavascriptExecutor js5=(JavascriptExecutor)driver;
					   js5.executeScript("arguments[0].click()", continueButton15);
					   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   }
			   
       //scroll to bottom of the page			   
	   public void scrollToBottom()
			    {
			    
			   	      ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			        
			    }
			   
			   
			  
	   //TU questions screen
	   public void submitAnswers()
			   {
				   
					   JavascriptExecutor js5=(JavascriptExecutor)driver;
					   js5.executeScript("arguments[0].click()", submitTU);
					   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				   
			   }
}
