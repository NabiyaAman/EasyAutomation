//=====================================================================================
	//File:           GoEasy CoApp Keyword
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goeasy.genericlib.ExcelLib;
import com.goeasy.genericlib.WebDriverCommonLib;




public class CoApp extends WebDriverCommonLib
{
	
	@FindBy(id="continue_button_12")
	private WebElement continueButton12;
	 
	
	@FindBy(id="continue_button_c1")
	private WebElement ContinuAfterCoApp;
	
	
	@FindBy(id="net_pay_1")
	private WebElement netPay;
	
	
	@FindBy(id="first_name_c1")
	private WebElement firstName;
	
	
	@FindBy(id="last_name_c1")
	private WebElement lastName;
	
	
	@FindBy(id="email_c1")
	private WebElement emailCoapp;
	
	
	@FindBy(id="phone_number_c1")
	private WebElement phoneNo;
	
	
	@FindBy(id="birthday_year_c")
	private WebElement birthYear;
	
	
	@FindBy(xpath="//*[@id='loan_form_c1']/div[16]/div")
	private WebElement addressSameCheckBox;
	
	
	@FindBy(id="work_phone_number_1_c")
	private WebElement workPhone;
	
	
	@FindBy(id="current_employer_c")
	private WebElement currentEmployer;
	
	
	@FindBy(id="current_supervisor_c")
	private WebElement supervisor;
	
	
	@FindBy(id="current_supervisor_phone_c")
	private WebElement supervisorPhone;
	
	
	@FindBy(id="current_job_title_c")
	private WebElement jobTitle;
	
	
	@FindBy(id="net_pay_c1")
	private WebElement netPayCoapp;
	
	
	@FindBy(id="gender_c1")
	private WebElement genderCoapp;
	
	
    private WebDriver driver;
	ExcelLib eLib = new ExcelLib();
	
	public CoApp(WebDriver driver) 
	   {
			// TODO Auto-generated constructor stub
			    PageFactory.initElements(driver, this);
				this.driver=driver;
		}
	
	
	
	   //enter email id
	public void enterEmail() throws EncryptedDocumentException, InvalidFormatException, IOException 
	     {        
		        //VB script to edit excel when the excel file is closed
		         eLib.refreshExcelData();
		         
				 String emailId =eLib.getExcelData("CoApp",1,0);
	             emailCoapp.sendKeys(emailId);
			
				 
			 }


    //click on the continueButton at the end of the coapp section
    public void clickContinue12()
	      { 
	         JavascriptExecutor js5=(JavascriptExecutor)driver;
			 js5.executeScript("arguments[0].click()", continueButton12);
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	       }

    
    //enter the netpay for the coapp
    public void enterNetPay() throws EncryptedDocumentException, InvalidFormatException, IOException
      {
             netPay.sendKeys("1000");
             String PayDuration= eLib.getExcelData("CoApp",1,17);
			
			 WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'label_choice_container _9 clearfix')]//span[text()='"+PayDuration+"']"));
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click()", ele);
      
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

    //enter the firstname and last name for the coapp
    public void enterFnameLname() throws EncryptedDocumentException, InvalidFormatException, IOException 
       {

			 String fname = eLib.getExcelData("CoApp",1,1);
			 String lname = eLib.getExcelData("CoApp",1,2);
			
	         firstName.sendKeys(fname);
			 lastName.sendKeys(lname);
	    
        }

   //enter the phonenumber for the coapp
   public void enterPhoneNumber() throws EncryptedDocumentException, InvalidFormatException, IOException
       {
			String phone = eLib.getExcelData("CoApp",1,3);
			phoneNo.sendKeys(phone);
	
        }

   //enter the birthday details for the coapp
   public void enterBirthdayDetails() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
      {
   
		    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		   
		    String birthyear = eLib.getExcelData("CoApp",1,4);		   
			birthYear.sendKeys(birthyear);
			
			String month = eLib.getExcelData("CoApp",1,5);
	        WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'loan_radio_2_month_c')]//span[text()='"+month+"']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", ele);
			
			String day = eLib.getExcelData("CoApp",1,6);
			WebElement day1 = driver.findElement(By.xpath("//div[contains(@id,'loan_radio_3_day_c')]//span[text()='"+day+"']"));
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("arguments[0].click()", day1);
			
	        Thread.sleep(2000);
	
     }

   //Enter the marital status for the coapp
   public void enterMaritalStatus() throws EncryptedDocumentException, InvalidFormatException, IOException
     {
			String marital = eLib.getExcelData("CoApp",1,7);
			WebElement day1 = driver.findElement(By.xpath("//span[text()='"+marital+"']"));
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("arguments[0].click()", day1);
    }

   //enter the Checkbox if the coapp address is same as applicant
   public void clickAddressSameCheckbox()
    {
	        addressSameCheckBox.click();
    }

   
   //enter the employment status
   public void enterEmpStatus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
      {
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       String employmentStatus1= eLib.getExcelData("CoApp",1,9);
			
		   WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'employment_radio_c1')]//span[text()='"+employmentStatus1+"']"));
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("arguments[0].click()", ele);
	      
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
     }
   
   
   

   //enter the citizenship of the coapp
    public void enterCitizenShip() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
      {
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        String employmentCitizen= eLib.getExcelData("CoApp",1,8);
				
				WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'citizen_radio_c1')]//span[text()='"+employmentCitizen+"']"));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", ele);
		
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
		
       }

    //enter the current job duration of the coapp
     public void enterCurrentjobDuration() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
     {
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        String employmentJobduration= eLib.getExcelData("CoApp",1,10);
				
				WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'emp_duration_radio_c1')]//span[text()='"+employmentJobduration+"']"));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", ele);
		    
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  
		
       }

     
     //enter the phone number of the coapp
     public void enterWorkPhone() throws EncryptedDocumentException, InvalidFormatException, IOException
       { 
   
		        String phone= eLib.getExcelData("CoApp",1,11);
		        workPhone.sendKeys(phone);
      }

     //enter the employer Details of the coapp
     public void enterEmploymentDeatils() throws EncryptedDocumentException, InvalidFormatException, IOException
       {
				   String emp = eLib.getExcelData("CoApp",1,12);
				   currentEmployer.sendKeys(emp);
				
			       String sup = eLib.getExcelData("CoApp",1,13);
				   supervisor.sendKeys(sup);
				   
			       String phone = eLib.getExcelData("CoApp",1,14);
				   supervisorPhone.sendKeys(phone);
				   
			       String title = eLib.getExcelData("CoApp",1,15);
				   jobTitle.sendKeys(title);
	
       }
     
     
    //enter the netpay details of the coapp
    public void enterNetpayCoApp() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
            {
			     String netPayAmount = eLib.getExcelData("CoApp",1,16);
			   
			     netPayCoapp.sendKeys(netPayAmount);
			   
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		         String employmentPayDuration= eLib.getExcelData("CoApp",1,17);
				
				 WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'pay_period_radio_c1')]//span[text()='"+employmentPayDuration+"']"));
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click()", ele);
		 
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
	       }


 
   // Select the income via direct deposit and child tax credit type
    public void enterIncome() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	     {
			    String bankDeposit = eLib.getExcelData("CoApp",1,18);
			    
			    WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'other_income_radio_c2')]//span[text()='"+bankDeposit+"']"));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", ele);
			  
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        String ctc_no= eLib.getExcelData("CoApp",1,19);
				
	            WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'ctc_radio_c1')]//span[text()='"+ctc_no+"']"));
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("arguments[0].click()", ele1);  
	    
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
	}
		   
 



  //Select the SIN and add the other person into your application
  public void enterSin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    {          

             String easyCus= eLib.getExcelData("CoApp",1,20);
		   
		     WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'current_address_radio_c1')]//span[text()='"+easyCus+"']"));
          
			 JavascriptExecutor js1=(JavascriptExecutor)driver;
			 js1.executeScript("arguments[0].click()", ele1);  
		  
             driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			
	}

   //Select the place type and car type 
   public void selectPlaceandPaydayLoans() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
	                String easyCus= eLib.getExcelData("CoApp",1,21);

				    WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'own_place_radio_c1')]//span[text()='"+easyCus+"']"));
					JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("arguments[0].click()", ele1);  
								             
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
					String ownPlace= eLib.getExcelData("CoApp",1,22);
                    WebElement ele2 = driver.findElement(By.xpath("//div[contains(@id,'payday_radio_c1')]//span[text()='"+ownPlace+"']"));
					JavascriptExecutor js2=(JavascriptExecutor)driver;
					js2.executeScript("arguments[0].click()", ele2);  
					
				             
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 			
			}
	   		   
		   

		   
		 
   //Select liabilities details
   public void selectLiabilities() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
	                String ownPlace= eLib.getExcelData("CoApp",1,23);
                    WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'other_loans_radio_c1')]//span[text()='"+ownPlace+"']"));
					JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("arguments[0].click()", ele1);  
								             
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					

			
			}

   //Click Continue after the section is filled
    public void clickContinue()
          { 
			     JavascriptExecutor js5=(JavascriptExecutor)driver;
				 js5.executeScript("arguments[0].click()", ContinuAfterCoApp);
				 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
          }

    
    //click on the gender of the coapp
     public void clickGenderCoApp() 
            {

			    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("arguments[0].click()", genderCoapp);
	    
           }

	   		

}

