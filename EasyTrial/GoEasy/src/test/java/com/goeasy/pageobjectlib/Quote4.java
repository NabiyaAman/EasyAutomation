package com.goeasy.pageobjectlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.goeasy.genericlib.WebDriverCommonLib;



public class Quote4 extends WebDriverCommonLib{
	
	@FindBy(xpath="//button[@class='btn btn-primary on-quote-only-click']")
	private WebElement quote;
	 
	 public void quoteIt(){
		 quote.click();
		 waitForPageToLoad();
	 }

}
