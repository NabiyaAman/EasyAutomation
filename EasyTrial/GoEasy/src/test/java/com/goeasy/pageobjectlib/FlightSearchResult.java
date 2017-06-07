package com.goeasy.pageobjectlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.goeasy.genericlib.WebDriverCommonLib;


public class FlightSearchResult extends WebDriverCommonLib {
	
	@FindBy(xpath="(//div[@class='table-item table-item-compact'])[2]/div[1]/div[@class='col-xs-1 col-md-1 air-column air-add-column']/button")
	private WebElement selectFlight;
	
	public void selectOneWayFlight(){
	selectFlight.click();
	waitForPageToLoad();
	}
	

	@FindBy(xpath="(//div[@class='table-item table-item-compact'])[3]/div[1]/div[@class='col-xs-1 col-md-1 air-column air-add-column']/button")
	private WebElement selectFlightRoumdTrip;

	
	public void selectRoundTripFlight(){
		waitForXpathPresent("(//div[@class='table-item table-item-compact'])[3]/div[1]/div[@class='col-xs-1 col-md-1 air-column air-add-column']/button");
		
		selectFlightRoumdTrip.click();
		waitForPageToLoad();
		}
}
