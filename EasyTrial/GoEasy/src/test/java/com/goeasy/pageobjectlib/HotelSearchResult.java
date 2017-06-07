package com.goeasy.pageobjectlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.goeasy.genericlib.WebDriverCommonLib;


public class HotelSearchResult  extends WebDriverCommonLib {
	
	@FindBy(xpath="//div[@class='hotel-list-item table-item table-item-compact'][1]/div/div[@class='col-xs-3 col-md-3']/div/div[3]/button")
	private WebElement select;
	
	public void selectHotel(){
		select.click();
	}

}
