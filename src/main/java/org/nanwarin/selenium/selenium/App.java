package org.nanwarin.selenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/***
 * @author nchantarutai
 *
 */

public class App 
{
	
	static String baseUrl = "http://bronco-planner.com/";
	static String expectedTitle = "Bronco-Planner - CPP Student Organizer";
	
    public static void main( String[] args )
    {
    	firefoxBrowser();
    	chromeBrowser();
    }
    
    public static void firefoxBrowser(){
    	//This is for window, set up the environment based on driver path
    	//geckordriver is firefox driver
    	System.setProperty("webdriver.gecko.driver","C:\\lib\\geckodriver.exe");
    	
    	WebDriver driverFirefox = new FirefoxDriver();
    	
    	//Launch Firefox and direct it to the Base URL
    	driverFirefox.get(baseUrl);

    	String result = "";
    	//Easy test, checking title
    	if(driverFirefox.getTitle().contentEquals(expectedTitle))
    		result = "PASSED";
    	else
    		result = "FAILED";
    	
    	System.out.println("FIREFOX -- " + result);
    	driverFirefox.close();
    	
    	//Need to check, for some reason firefox driver didn't automatic close the browser

    }
    
    public static void chromeBrowser(){
    	System.setProperty("webdriver.chrome.driver", "C:\\lib\\chromedriver.exe");
    	WebDriver driverChrome = new ChromeDriver();
    	
    	driverChrome.get(baseUrl);
    	if(driverChrome.getTitle().contentEquals(expectedTitle))
    		System.out.println("CHROME -- PASSED");
    	else
    		System.out.println("CHROME -- FAILED");
    	
    	driverChrome.close();
    	
    }
}
