//=====================================================================================
	//File:           GoEasy SalesForce Keyword
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


public class SalesForce 
{
	
	@FindBy (xpath=".//table[@class='list']//td[normalize-space()='In Progress']")
	private   WebElement inProgress;
	
	@FindBy(id="username")
    private WebElement userName;
	
	@FindBy(id="password")
    private WebElement password;
	
	@FindBy(id="Login")
    private WebElement loginButton;
	
	
    @FindBy(css="input[id='phSearchInput']")
    private WebElement searchBar;
    
    @FindBy(css="input[id='phSearchButton']")
    private WebElement searchButton;
    
    @FindBy(xpath="html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/table/tbody/tr/td[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/table/tbody/tr[1]/th[2]")
    private WebElement customerName;
    
    @FindBy (xpath="html/body/div[1]/div[2]/table/tbody/tr/td/div[2]/table/tbody/tr/td[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/table/tbody/tr[2]/th/a")
    private WebElement Row;
    
    @FindBy(xpath="html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[15]/div[1]/div/div[2]/table")
    private WebElement applicationsTable;
    
	private static WebDriver driver;
	ExcelLib eLib = new ExcelLib();
	String xlpath="D:/easyAutomation2017/GoEasy/requiredSource/TestData1.xlsx";

	public SalesForce(WebDriver driver) 
	  {
			// TODO Auto-generated constructor stub
		 PageFactory.initElements(driver, this);
			this.driver=driver;
		}
	
	
    
    //naviagte to app and enter credentials
     public void navigateToApp() throws EncryptedDocumentException, InvalidFormatException, IOException
       {
	     	 String url=eLib.getExcelData("Login",3,1);
			 Browser.driver.get(url);
			 
			 String uName= eLib.getExcelData("Login",4,1);
			 userName.clear();
			 userName.sendKeys(uName);
			 
			 String pwd = eLib.getExcelData("Login",5,1);
			 password.clear();
			 password.sendKeys(pwd);
			 loginButton.click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	   }
    
    

    //enter the first and last name of the test user to cancel
    public void enterLnameFname(String lname, String fname)
        {
	    	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	  searchBar.sendKeys(lname+" "+fname );
        }
    
    //click on the row
    public void clickRow()
       {
              Row.click();
       }
    
    
    //scroll down to the application table
    public void scrollToApplications()
      {
    
   	         ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
       }
    
  //check if alert is present and accept
  public void checkIfAlertIsPresent()
      {
	
		     WebDriverWait wait = new WebDriverWait(driver, 5);
			    if(wait.until(ExpectedConditions.alertIsPresent()) != null);
			        {
		                   // Before you try to switch to the so given alert, he needs to be present.
	
		              Alert alert = driver.switchTo().alert();
	                      //	alertText = alert.getText();
		              alert.accept();

	
		        }
	
		    
       }
    
   //Clear all the applications in progress the test user you want
    public void clearApplication() throws InterruptedException
       {
			          String sheetname="SalesForce";
			          int rc = com.goeasy.genericlib.ExcelCode.rowcount(xlpath,sheetname);
				
				          
			          for(int i=1;i<=rc;i++)
				              {
								String fname = ExcelCode.celldata(xlpath,sheetname,i,0);
								System.out.println(fname);
								
								String lname = ExcelCode.celldata(xlpath, sheetname,i,1);
								System.out.println(lname);
								
								
								enterLnameFname(lname,fname);
								clickSearchButton();
								driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
			
			
						    
							WebElement table = driver.findElement(By.xpath("//*[@id='Account_body']/table"));
						    List<WebElement> allRows = table.findElements(By.tagName("tr"));
						    System.out.println(allRows.size());
			
					
								for(int i1=1;i1<allRows.size();i1++)
								{
						
							        WebElement table1 = driver.findElement(By.xpath("//*[@id='Account_body']/table"));
							        List<WebElement> allRows1 = table1.findElements(By.tagName("tr"));
							        allRows1.get(i1).findElement(By.xpath(".//td[normalize-space()='Edit']/following-sibling::th/a")).click();
							        Thread.sleep(2000);
							        	 
								   		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
								   		scrollToApplications();
								   		//isElementExists();
								   		 try 
								   		   {
									   			 driver.findElement(By.xpath(".//table[@class='list']//td[normalize-space()='In Progress']/preceding-sibling::th/a")).click(); 
									   			 driver.findElement(By.id("j_id0:j_id156:j_id161:j_id162:j_id170")).click();
									   			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
									   			 
									   			  List<WebElement>radioButton = driver.findElements(By.id("j_id0:j_id145:j_id148"));
									   			  System.out.println(radioButton.size());
									   			    //If u want to select the radio button
									   			  driver.findElement(By.id("j_id0:j_id145:declineTable:6")).click();
									   			    //checkIfAlertIsPresent();
									   			
									   			  driver.findElement(By.id("j_id0:j_id145:declineReasonButton")).click();
									   			    checkIfAlertIsPresent();
									   			  driver.navigate().back();
								   		      
								   		   } 
								   		 catch (NoSuchElementException e) 
								   		    {
								   		           System.out.println("No application in progress");
								   		    }
								   		 
								   		 
								   		 driver.navigate().back();
					      
      
                                     }
	                              }
    
       
       }

    

    private boolean assertEquals(String string, String text) 
       {
		    	if (string.equals(text))
				return true;
				
		    	else 
		    	{
					return false;
				}
	    }


   //click on the search button
	public void clickSearchButton()
	    {
		      searchButton.click();
	    }
    
    
 	
    }
 
