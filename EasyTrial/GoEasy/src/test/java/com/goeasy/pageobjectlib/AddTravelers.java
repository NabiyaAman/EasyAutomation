package com.goeasy.pageobjectlib;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.goeasy.genericlib.WebDriverCommonLib;


public class AddTravelers extends WebDriverCommonLib{
	
	@FindBy(id="clientSearch")
	private WebElement addTraveler;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-select-client']")
	private WebElement selectTraveler;
	
	@FindBy(id="view20_traveling")
	private WebElement isTravelling;
	
	@FindBy(xpath="//select[@name='Title']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='FirstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='LastName']")
	private WebElement lastName;
	
	@FindBy(xpath="(//select[@class='day form-control de-form-control'])[1]")
	private WebElement date;
	
	@FindBy(xpath="(//select[@class='month form-control de-form-control'])[1]")
	private WebElement month;
	
	@FindBy(xpath="(//select[@class='year form-control de-form-control'])[1]")
	private WebElement year;
	
	@FindBy(xpath="//label[@class='de-label']/input[@value='M']")
	private WebElement male;

	@FindBy(xpath="//select[@name='Nationality']")
	private WebElement nationality;
	

	@FindBy(xpath="//button[@class='btn btn-primary pull-right js-save-and-book btn-disabled']")
                                	 
	private WebElement bookOnly;
	
	
	public void addTravelers(Actions act){
		addTraveler.sendKeys("rob");
		act.sendKeys(Keys.ENTER).perform();
		selectTraveler.click();
		//act.moveToElement(isTravelling).click().perform();
		isTravelling.click();
//		selectFromDropDown(title,"Mr.");
//		firstName.sendKeys("Roberto");
//		lastName.sendKeys("Cavilli");
//		selectFromDropDown(date, "29");
//		selectFromDropDown(month, "5");
//		selectFromDropDown(year, "1974");
//		selectFromDropDown(nationality, "840");
		//bookOnly.click();
		act.moveToElement(bookOnly).click().build().perform();
		waitForPageToLoad();
		
	}
	
	
	 public void selectFromDropDown(WebElement wb,String value){
		 Select s=new Select(wb);
		 s.selectByValue(value);
		 
	 }

}
