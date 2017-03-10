package org.nanwarin.selenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/***
 * Example code from : http://www.guru99.com/first-webdriver-script.html
 * @author nchantarutai
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	//This is for window, set up the environment based on driver path
    	//geckordriver is firefox driver
    	System.setProperty("webdriver.gecko.driver","C:\\lib\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	String baseUrl = "http://bronco-planner.com/";
    	String expectedTitle = "Bronco-Planner - CPP Student Organizer";
    	String actualTitle = "";
    	
    	//Launch Firefox and direct it to the Base URL
    	driver.get(baseUrl);
    	
    	actualTitle = driver.getTitle();
    	
    	if(actualTitle.contentEquals(expectedTitle))
    		System.out.println("PASSED");
    	else
    		System.out.println("FAILED");
    	
    	driver.close();
    	
    	System.exit(0);
    }
}
