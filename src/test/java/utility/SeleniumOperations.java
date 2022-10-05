package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperations
{
	public static WebDriver driver =null;
	
	public static ConfigReader config;
	
	 public static Hashtable<String,Object> outputParameters=new Hashtable<String, Object>();
	 
//browserLaunch
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
		try{
			
		String bName=(String) inputParameters[0];
		
        	
        if(bName.equalsIgnoreCase("Chrome"))
        {
        	config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());		
		
	     driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
        }
        else if(bName.equalsIgnoreCase("Firefox"))
        	
        {
        	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        	System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());		
		
	     driver=new ChromeDriver();
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);	
        }
        outputParameters.put("STATUS", "pass");
        outputParameters.put("MESSAGE", "Method used:browserLaunch,Input given:" + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			
			outputParameters.put("STATUS", "fail");
	        outputParameters.put("MESSAGE", "Method used:browserLaunch,Input given:" + inputParameters[0].toString());
		}
		return outputParameters;
	}
	//openApplication
	public static Hashtable<String,Object> openApplication()
	{
		try{
			
		
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.get(config.getApplicationUrl());
		outputParameters.put("STATUS", "pass");
        outputParameters.put("MESSAGE", "Method used:openApplication,Input given:" + config.getApplicationUrl().toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "fail");
	        outputParameters.put("MESSAGE", "Method used:openApplication,Input given:" + config.getApplicationUrl().toString());
		}
		return outputParameters;
	}
	//clickOncancel
	public static  Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	{
	try{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
     String locator=(String) inputParameters[0];
		
		driver.findElement(By.xpath(locator)).click();
		outputParameters.put("STATUS", "pass");
        outputParameters.put("MESSAGE", "Method used:clickOnElement,Input given:" + inputParameters[0].toString());
	    }
	catch(Exception e)
	   { 
		outputParameters.put("STATUS", "fail");
        outputParameters.put("MESSAGE", "Method used:clickOnElement,Input given:" + inputParameters[0].toString());
      	}
	return outputParameters;
     	}
	//mouseOveraction
	
	public static Hashtable<String,Object>  mouseOverAction(Object[]inputParameters)
	{  
		try{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		 String locator=(String) inputParameters[0];
	
		 Actions act=new Actions(driver);
		 
		 WebElement mouseover=driver.findElement(By.xpath(locator));
		 act.moveToElement(mouseover).build().perform();
		 outputParameters.put("STATUS", "pass");
	        outputParameters.put("MESSAGE", "Method used:mouseOverAction,Input given:" + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "fail");
	        outputParameters.put("MESSAGE", "Method used:mouseOverAction,Input given:" + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//sendKeysMethod
	public static  Hashtable<String,Object>  sendText(Object[]inputParameters)
	{
		try{
		String locator=(String) inputParameters[0];
		String sendText=(String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.findElement(By.xpath(locator)).sendKeys(sendText);
		outputParameters.put("STATUS", "pass");
        outputParameters.put("MESSAGE", "Method used:sendText,Input given:" + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "fail");
	        outputParameters.put("MESSAGE", "Method used:sendText,Input given:" + inputParameters[0].toString());
		}
		return outputParameters;	
	}
	//validation
	
	
	public static Hashtable<String,Object> validation(Object[]inputParameters)
	{
		try{
		String xpath=(String) inputParameters[0];
		String givenText=(String) inputParameters[1];
		 Thread.sleep(5000);
		String findedText=driver.findElement(By.xpath(xpath)).getText();
		
		if(findedText.equalsIgnoreCase(givenText))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
			
			}
		outputParameters.put("STATUS", "pass");
        outputParameters.put("MESSAGE", "Method used:validation,Input given:" + inputParameters[0].toString());
	}
     catch(Exception e)
		{
    	 outputParameters.put("STATUS", "fail");
	        outputParameters.put("MESSAGE", "Method used:validation,Input given:" + inputParameters[0].toString());
		}
		return outputParameters;	
	}
	public static void click(Object[] input1) {
		// TODO Auto-generated method stub
		
	}
}
	
	
	
	
	
	

