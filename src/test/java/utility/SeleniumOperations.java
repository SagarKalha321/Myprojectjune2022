package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
	public static WebDriver driver =null;
	
	 public static Hashtable<String,Object> outputParameters=new Hashtable<String, Object>();
	 
//browserLaunch
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
		try{
			
		String bName=(String) inputParameters[0];
		
        String WebDriverExePath=(String) inputParameters[1];	
        if(bName.equalsIgnoreCase("Chrome"))
        {
        	
		System.setProperty("webdriver.chrome.driver", WebDriverExePath);		
		
	     driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        else if(bName.equalsIgnoreCase("Firefox"))
        	
        {
        	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        	System.setProperty("webdriver.gecko.driver", WebDriverExePath);		
		
	     driver=new ChromeDriver();
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
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
	public static Hashtable<String,Object> openApplication(Object[]inputParameters)
	{
		try{
			
		String strngUrl=(String) inputParameters[0];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(strngUrl);
		outputParameters.put("STATUS", "pass");
        outputParameters.put("MESSAGE", "Method used:openApplication,Input given:" + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "fail");
	        outputParameters.put("MESSAGE", "Method used:openApplication,Input given:" + inputParameters[0].toString());
		}
		return outputParameters;
	}
	//clickOncancel
	public static  Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	{
	try{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
}
	
	
	
	
	
	

