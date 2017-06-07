//=====================================================================================
	//File:           GoEasy GetALoan Keyword
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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.regexp.recompile;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.goeasy.genericlib.Browser;
import com.goeasy.genericlib.ExcelCode;
import com.goeasy.genericlib.ExcelLib;
import com.goeasy.genericlib.WebDriverCommonLib;


public class GetALoan extends WebDriverCommonLib
{
	private WebDriver driver;
	ExcelLib eLib = new ExcelLib();

	private static final String submit = "SUBMIT";
	

	 @FindBy(xpath="//span[contains(text(),'GET A LOAN')]/../../a[@class='headerlink-button green_button solid homepage-icon-set']")
	 private WebElement getloanlink;
    
     @FindBy(linkText="Sign-in")
	 private WebElement signIn;
	 
	 @FindBy(linkText="REGISTER")
	 private WebElement register;
	 
	 @FindBy(id="email_1")
	 private WebElement email;
	 
	 @FindBy(id="password_1")
	 private WebElement password;
	 
	 @FindBy(id="retype_password_1")
	 private WebElement retypePassword;
	 
	 @FindBy(id="first_name_1")
	 private WebElement firstName;
	 
	 @FindBy(id="last_name_1")
	 private WebElement lastName;
	 
     @FindBy(id="continue_button_1")
	 private WebElement continueButton;
	
     @FindBy(id="email_2")
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
	
	 @FindBy(id="continue_button_5")
	 private WebElement continueButton51;
	
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


	public GetALoan(WebDriver driver) 
	   {
			  // TODO Auto-generated constructor stub
			    PageFactory.initElements(driver, this);
				this.driver=driver;
		}
	
	//switch to the current active window
     public void switchwindow() throws InterruptedException
	   {
				   for(String winHandle : driver.getWindowHandles())
				        {
				          driver.switchTo().window(winHandle);
				         }
				   System.out.println(driver.getCurrentUrl());
				   Thread.sleep(4000);
		
	    }
	  

   
    //enter the loan amount
    public void enterLoanAmount() throws EncryptedDocumentException, InvalidFormatException, IOException 
	   {
		
				 String loan =eLib.getExcelData("Register",2,34);
				 loanAmount.sendKeys(loan);
				 
	   }
    
    //enter the emailId
    public void enterEmail() throws EncryptedDocumentException, InvalidFormatException, IOException 
	 {
		         eLib.refreshExcelData();
				 String emailId =eLib.getExcelData("Register",2,0);
                 email.sendKeys(emailId);

      }
			
	 
     //click on the get a loan link
	 public void clickGetALoan()
		{
                   getloanlink.click();
		}


	 
	
		
	 //assert if the email is autopopulated 
	 public void AssertAutopopulatedEmailField() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			String email= eLib.getExcelData("Register",2,0);

			if (!email1.getAttribute("value").equals(email)) 
			    {
				  Assert.assertNotSame("email not populated correctly",email1.getAttribute("value"));
			    }
		}

	 
	   //enter the loan purpose
		public void enterLoanPurpose() throws EncryptedDocumentException, InvalidFormatException, IOException
		 {
				 String purpose = eLib.getExcelData("Register",2,6);
				 WebElement ele = driver.findElement(By.xpath("//span[text()='"+purpose+"']"));
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click()", ele);
                 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 }
		
		
	    //enter the firstanme and lastname
        public void enterFnameLname() throws EncryptedDocumentException, InvalidFormatException, IOException 
		{

				 String fname = eLib.getExcelData("Register",2,3);
				 String lname = eLib.getExcelData("Register",2,4);
				
				 
				
				 firstName.sendKeys(fname);
				 lastName.sendKeys(lname);
			    
		}
		
	   
	   //create acount screen
	   public void createAccount() throws EncryptedDocumentException, InvalidFormatException, IOException
	       {
				     String pass = eLib.getExcelData("Register",2,1);
					 String retypePass = eLib.getExcelData("Register",2,2);
					
                     password.sendKeys(pass);
					 retypePassword.sendKeys(retypePass);
		            
	       }
	   
	   //click on the continue
	   public void clickContinue()
		   { 
	                  JavascriptExecutor js5=(JavascriptExecutor)driver;
					  js5.executeScript("arguments[0].click()", continueButton51);
					  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		     
		   }
	   
	
			
			
		   //enter the phone number 
			public void enterPhoneNumber() throws EncryptedDocumentException, InvalidFormatException, IOException
			   {
						String phone = eLib.getExcelData("Register",2,8);
						phoneNo.sendKeys(phone);
				
			   }
			
			
			//enter the birthday details
			public void enterBirthdayDetails() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
				   
					    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
					   
					    String birthyear = eLib.getExcelData("Register",2,9);		   
						birthYear1.sendKeys(birthyear);
						
						String month = eLib.getExcelData("Register",2,11);
			            WebElement ele = driver.findElement(By.xpath("//span[text()='"+month+"']"));
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", ele);
						
						String day = eLib.getExcelData("Register",2,10);
						WebElement day1 = driver.findElement(By.xpath("//span[text()='"+day+"']"));
						JavascriptExecutor js1=(JavascriptExecutor)driver;
						js1.executeScript("arguments[0].click()", day1);
						
		                Thread.sleep(2000);
					
					
					
				}
			   
		
				 
				
				   
			//enter the addressDetails
			public void enterAddressDetails() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	          {
					   
					   String postalcode = eLib.getExcelData("Register",2,14);
					   String street = eLib.getExcelData("Register",2,12);
					   String citydata = eLib.getExcelData("Register",2,13);
					   String province1 = eLib.getExcelData("Register",2,15);
					   
					
					   
					   postalCode.sendKeys(postalcode);
					   //postalCode.click();
					   streetAddress.sendKeys(street);
					   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
			
			
			
			//enter the employment status
            public void enterEmpStatus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			    {
				       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				       String employmentStatus1= eLib.getExcelData("Register",2,16);
						
					   WebElement ele = driver.findElement(By.xpath("//span[text()='"+employmentStatus1+"']"));
					   JavascriptExecutor js=(JavascriptExecutor)driver;
					   js.executeScript("arguments[0].click()", ele);
	                  
					   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		                
							
		        	
			     }
				   
				   
				   
		  
			//enter the citizenship status	   
		   public void enterCitizenShip() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
				        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				        String employmentCitizen= eLib.getExcelData("Register",2,19);
						
						WebElement ele = driver.findElement(By.xpath("//span[text()='"+employmentCitizen+"']"));
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", ele);
	     
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	               
						
				}
			   
			   
				   

				
		   
		  //click on the current job duration   
		   public void enterCurrentjobDuration() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
				        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				        String employmentJobduration= eLib.getExcelData("Register",2,20);
						
						WebElement ele = driver.findElement(By.xpath("//span[text()='"+employmentJobduration+"']"));
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", ele);
	                
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	              
						
				}
		   
		   //click on the work phone number
		   public void enterWorkPhone() throws EncryptedDocumentException, InvalidFormatException, IOException
		       {
			       
			            String phone= eLib.getExcelData("Register",2,21);
			            workPhone.sendKeys(phone);
		       }
		   
			   

		   
		   //Select the netpay and type of salary receive
	       public void enterNetpay() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				  {
					    String netPayAmount = eLib.getExcelData("Register",2,22);
					   
					    netPay.sendKeys(netPayAmount);
					   
					    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				        String employmentPayDuration= eLib.getExcelData("Register",2,23);
						
						WebElement ele = driver.findElement(By.xpath("//span[text()='"+employmentPayDuration+"']"));
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()", ele);
	               
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	             
						
					}
			   
			   
				   

			  
				
		   // Select the income via direct deposit and child tax credit type
	       public void enterIncome() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
					{
						    String bankDeposit = eLib.getExcelData("Register",2,24);
						    
						    WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'label_choice_container _10 clearfix')]//span[text()='"+bankDeposit+"']"));
							JavascriptExecutor js=(JavascriptExecutor)driver;
							js.executeScript("arguments[0].click()", ele);
						  
	                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					        String ctc_no= eLib.getExcelData("Register",2,25);
							
	                        WebElement ele1 = driver.findElement(By.xpath("//div[contains(@class,'label_choice_container _11 clearfix')]//span[text()='"+ctc_no+"']"));
							JavascriptExecutor js1=(JavascriptExecutor)driver;
							js1.executeScript("arguments[0].click()", ele1);  
		              
							driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	            
						
					}
			   		   
				   

		   
				
		   // Select the other income type and easy home customer type 
	       public void enterOtherincome() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
					{
						    String otherIncome = eLib.getExcelData("Register",2,26);

						    WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'other_income_radio_2')]//span[text()='"+otherIncome+"']"));
							JavascriptExecutor js1=(JavascriptExecutor)driver;
							js1.executeScript("arguments[0].click()", ele1);  
						  
						   
						   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					       String easyCus= eLib.getExcelData("Register",2,27);
							
					       WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'current_customer_radio_1')]//span[text()='"+easyCus+"']"));
		                   JavascriptExecutor js=(JavascriptExecutor)driver;
						   js.executeScript("arguments[0].click()", ele); 
		             
						   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	           			
					}
			   		   
				   

				 
	       
	       //Select the SIN and add the other person into your application 
		   public void enterSin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				 {          
			  
			                String easyCus= eLib.getExcelData("Register",2,28);
						   
						    WebElement ele1 = driver.findElement(By.xpath("//div[contains(@class,'label_choice_container _12 clearfix')]//span[text()='"+easyCus+"']"));
			               
							JavascriptExecutor js1=(JavascriptExecutor)driver;
							js1.executeScript("arguments[0].click()", ele1);  
						  
		                    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	          			
					}
			   		   
				   

				   
				   
		   //Select the current address duration
		   public void enterCurrentAddress() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
					{       
			                
			                String employmentJobduration= eLib.getExcelData("Register",2,29);
							
							WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'current_address_radio_1')]//span[text()='"+employmentJobduration+"']"));
							JavascriptExecutor js=(JavascriptExecutor)driver;
							js.executeScript("arguments[0].click()", ele);
					             
						    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	         			
					}
			   		   
				   
	
				 
		   //Select the place type and car type 
		   public void selectPlaceCar() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				  {
			                String easyCus= eLib.getExcelData("Register",2,30);

						    WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'own_place_radio_1')]//span[text()='"+easyCus+"']"));
							JavascriptExecutor js1=(JavascriptExecutor)driver;
							js1.executeScript("arguments[0].click()", ele1);  
										             
							driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
							
							String ownPlace= eLib.getExcelData("Register",2,31);
	                        WebElement ele2 = driver.findElement(By.xpath("//div[contains(@id,'own_car_radio_1')]//span[text()='"+ownPlace+"']"));
							JavascriptExecutor js2=(JavascriptExecutor)driver;
							js2.executeScript("arguments[0].click()", ele2);  
							
						             
							driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        			
					}
			   		   
				   
	
				   
				 
		   //Select payday loan type and child support and unpaid taxes - screen 14
		   public void selectPayChildsupp() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
					{
			                String ownPlace= eLib.getExcelData("Register",2,32);
	                        WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'payday_radio_1')]//span[text()='"+ownPlace+"']"));
							JavascriptExecutor js1=(JavascriptExecutor)driver;
							js1.executeScript("arguments[0].click()", ele1);  
										             
							driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
							
							String ownPlace1= eLib.getExcelData("Register",2,33);
							
							WebElement ele2 = driver.findElement(By.xpath("//div[contains(@id,'other_loans_radio_1')]//span[text()='"+ownPlace1+"']"));
							JavascriptExecutor js2=(JavascriptExecutor)driver;
							js2.executeScript("arguments[0].click()", ele2);  
							
						             
							driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	       			
					}
			   		   
				   

	     
			   

	   
}

	