package com.goeasy.genericlib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static WebDriver driver;
	
	public static WebDriver getBrowser(){
		
		if(Constants.browser.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/requiredSource/chromedriverLatest.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		}else if(Constants.browser.equals("ie")){
			  System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator.Jenifer-PC\\Desktop\\new\\IEDriverServer.exe");
			  driver = new InternetExplorerDriver();
		}else if(Constants.browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
			  driver = new FirefoxDriver();
			  driver.manage().window().maximize();
		}else{
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
}
