package com.goeasy.pageobjectlib;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.goeasy.genericlib.WebDriverCommonLib;


public class NewHotelSearch  extends WebDriverCommonLib {
	
   @FindBy(xpath="//input[@class='form-control de-form-control destination-typeahead']")
   private WebElement seacrhBox;
	
   @FindBy(xpath="//div[div[input[@class='form-control de-form-control destination-typeahead']]]/following-sibling::div[1]/div[1]/div/div/input")
   private WebElement checkInDate;
   
   @FindBy(xpath="//div[div[input[@class='form-control de-form-control destination-typeahead']]]/following-sibling::div[1]/div[2]/div/select")
   private WebElement nights;
   
   @FindBy(xpath="//div[div[input[@class='form-control de-form-control destination-typeahead']]]/following-sibling::div[1]/div[3]/div/div/input")
   private WebElement checkOutDate;
   
   @FindBy(xpath="//div[div[input[@class='form-control de-form-control destination-typeahead']]]/following-sibling::div[1]/div[4]/div/select")
   private WebElement rooms;
   
   @FindBy(xpath="//div[div[input[@class='form-control de-form-control destination-typeahead']]]/following-sibling::div[1]/div[5]/div/select")
   private WebElement guests;
   
   @FindBy(xpath="//div[div[input[@class='form-control de-form-control destination-typeahead']]]/following-sibling::div[2]/div[1]/div/div[@class='rating-range-slider ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']")
   private WebElement ratingSlider;
   
   @FindBy(xpath="//input[@class='form-control de-form-control hotelchain-typeahead tt-input']")
   private WebElement hotelChain;
   
   @FindBy(xpath="//select[@name='AgentId']")
   private WebElement quoteOwner;
   
   @FindBy(xpath="//select[@name='ProviderType']")
   private WebElement provider;
   
   @FindBy(xpath="//button[@class='btn btn-primary btn-search-hotelfare']")
   private WebElement search;
   
   public void searchHotel(String loc,String inDate,String outDate) throws InterruptedException{
	   seacrhBox.sendKeys(loc);
	   checkInDate.clear();
	   checkInDate.sendKeys(inDate);
	   Thread.sleep(4000);
	   selectFromDropDown(nights, "3");
	   checkOutDate.clear();
	   checkOutDate.sendKeys(outDate);
	   Thread.sleep(4000);
	   Actions act=new Actions(driver);
       act.moveToElement(checkOutDate).sendKeys(Keys.ENTER);
		
	   selectFromDropDown(rooms, "1");
	   selectFromDropDown(guests, "1");
	  // slider();
	  // selectFromDropDown(quoteOwner, "1313");
	   search.click();
   }
   public  void slider(){
	    
	    int width=ratingSlider.getSize().getWidth();
	    Actions move = new Actions(driver);
	    Action action  = move.dragAndDropBy(ratingSlider, ((width*25)/100), 0).build();
	    action.perform();
	    System.out.println("Slider moved");
	}
 
  public void selectFromDropDown(WebElement wb,String value){
			 Select s=new Select(wb);
			 s.selectByValue(value);
			 
		 }
   
   
}
