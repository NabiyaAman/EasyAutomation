package com.goeasy.pageobjectlib;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.goeasy.genericlib.WebDriverCommonLib;


public class Air extends WebDriverCommonLib{
	
	@FindBy(xpath="//div[text()='New Air ']")
	private WebElement newAirQuote;
	
	@FindBy(xpath="//label[@class='btn btn-default label-normal one-way-label']")
	private WebElement onWay;
	
	@FindBy(id="airport-from-1")
	private WebElement from;
	
	@FindBy(xpath="//input[@name='airport-to-1']")
	private WebElement to;
	
	@FindBy(xpath=".//*[@id='air']/div/div[2]/div/div/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/input")
	private WebElement depart;
	
	@FindBy(xpath=".//*[@id='air']/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/input")
	private WebElement Return;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-search-airfare']")
	private WebElement flightsearch;
	
	
	
	
	
	
	
	
	public void searchFlightOneWay(String fromAir,String toAir,Actions act) throws InterruptedException{
		newAirQuote.click();
		onWay.click();
		from.sendKeys(fromAir);
		Thread.sleep(4000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).perform();
		to.sendKeys(toAir);
		Thread.sleep(4000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).perform();
		
		depart.click();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.sendKeys(Keys.ENTER).perform();
		
		flightsearch.click();
		waitForPageToLoad();
		
	}
	

	@FindBy(xpath="//label[@class='btn btn-default label-normal round-trip-label active']")
	private WebElement roundTrip;
	
	
	public void searchFlightRoundTrip(String fromAir,String toAir,Actions act) throws InterruptedException{
		newAirQuote.click();
		roundTrip.click();
		from.sendKeys(fromAir);
		Thread.sleep(4000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).perform();
		to.sendKeys(toAir);
		Thread.sleep(4000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER).perform();
		
		depart.click();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.sendKeys(Keys.ENTER).perform();
		
		Return.click();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.sendKeys(Keys.ENTER).perform();
		
		flightsearch.click();
		waitForPageToLoad();
		
	}
	

	
	
	
	
	
	
	 public void selectFromDropDown(WebElement wb,String value){
		 Select s=new Select(wb);
		 s.selectByValue(value);
		 
	 }
	

}
