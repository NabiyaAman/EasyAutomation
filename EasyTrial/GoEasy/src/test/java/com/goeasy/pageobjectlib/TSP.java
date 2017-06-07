package com.goeasy.pageobjectlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.goeasy.genericlib.WebDriverCommonLib;


public class TSP extends WebDriverCommonLib {

	@FindBy(xpath="//a[@class='btn btn-primary air-update-price']")
	private WebElement itenaryBook;
	
	@FindBy(xpath="//a[@class='btn btn-primary air-payment']")
	private WebElement ticketFlight;

	@FindBy(xpath="//a[text()='Back to Trip Services']")
	private WebElement tsp;
		
	public void clickOnItenaryBook(){
		itenaryBook.click();
		waitForPageToLoad();
	}
	
	public void clickOnTicketFlight(){
		ticketFlight.click();	
		waitForPageToLoad();
	}
	
	public void backToTsp(){
		tsp.click();
		waitForPageToLoad();
		
	}
	
}
