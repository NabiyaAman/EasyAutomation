package com.goeasy.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	public WebDriver driver;
	
	public void waitForPageToLoad(){
		Browser.driver.manage().timeouts().implicitlyWait
		                         (50, TimeUnit.SECONDS);
	}

	public void waitForLinkNamePresent(String linkName){
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.linkText(linkName)));
		
	}
	
	public void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath(wbXpath)));
		
	}
	
	public void waitForIDPresent(String wbID){
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.id(wbID)));
		
	}
	
	
	public boolean verifyTest(WebElement wb , String expectedMsg){
		boolean flag = false;
		String actMsg = wb.getText();
		if(expectedMsg.equals(actMsg)){
			flag = true;
			System.out.println("msg is verfied==PASS");
		}else{
			System.out.println("msg is not verfied==FAIL");
		}
		return flag;
	}
	
	public void acceptAlert(){
		Alert alt = Browser.driver.switchTo().alert();
		alt.accept();
	}
	
	
	public void cancelAlert(){
		Alert alt = Browser.driver.switchTo().alert();
		alt.dismiss();
	}

	
	
	
}
