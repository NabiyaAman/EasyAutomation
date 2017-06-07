package com.goeasy.pageobjectlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.goeasy.genericlib.WebDriverCommonLib;


public class Payment extends WebDriverCommonLib {

	@FindBy(id="firstName")
	private WebElement cardHolderFirstName;
	
	@FindBy(xpath="//input[@name='LastName']")
	private WebElement cardHolderLastName;
	
	@FindBy(id="creditCardNumber")
	private WebElement cardNumber;
	
	@FindBy(id="month")
	private WebElement expiryMonth;
	
	@FindBy(xpath="//select[@name='Year']")
	private WebElement expiryYear;
	
	@FindBy(id="verificationCode")
	private WebElement verificationNumber;
	
	@FindBy(id="address1")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="country")
	private WebElement country;
	
	@FindBy(id="stateProvince")
	private WebElement state;
	
	@FindBy(id="zipPostalCode")
	private WebElement zip;
		
	@FindBy(xpath="//input[@class='accept-toc-checkbox']")
	private WebElement acceptCondition;
	
	@FindBy(id="payAndTicket")
	private WebElement payAndTicket;
	
	public void makePayment(){
		
		cardHolderFirstName.sendKeys("AAA");
		cardHolderLastName.sendKeys("BBB");
		cardNumber.sendKeys("4111111111111111");
		selectFromDropDown(expiryMonth, "1");
		selectFromDropDown(expiryYear, "2025");
		verificationNumber.sendKeys("123");
		address.sendKeys("#306 E,100th PL");
		city.sendKeys("Chicago");
		selectFromDropDown(country,"840");
		selectFromDropDown(state,"4677");
		zip.sendKeys("60006");
		acceptCondition.click();
		payAndTicket.click();
		waitForPageToLoad();
		
		
	}

	 public void selectFromDropDown(WebElement wb,String value){
		 Select s=new Select(wb);
		 s.selectByValue(value);
		 
	 }

}
