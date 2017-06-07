package com.goeasy.pageobjectlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.goeasy.genericlib.WebDriverCommonLib;



public class Logout extends WebDriverCommonLib{
	
	@FindBy(xpath="//span[@class='action-text dashboard-username']")
	private WebElement profile;
	
	@FindBy(xpath="(//span[text()='Logout'])[2]")
	private WebElement logout;
	
	public void logoutFromProfile(){
		profile.click();
		logout.click();
		waitForPageToLoad();
		
	}

}
