package utility;

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
	
//browserLaunch
	public static void browserLaunch(Object[]inputParameters)
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
        	
        }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	//openApplication
	public static void openApplication(Object[]inputParameters)
	{
		try{
			
		String strngUrl=(String) inputParameters[0];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(strngUrl);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
       
	}
	//clickOncancel
	public static void clickOnElement(Object[]inputParameters)
	{
	try{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     String locator=(String) inputParameters[0];
		
		driver.findElement(By.xpath(locator)).click();	
	    }
	catch(Exception e)
	   { 
		System.out.println(e);
      	}
     	}
	//mouseOveraction
	
	public static void mouseOverAction(Object[]inputParameters)
	{  
		try{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 String locator=(String) inputParameters[0];
	
		 Actions act=new Actions(driver);
		 
		 WebElement mouseover=driver.findElement(By.xpath(locator));
		 act.moveToElement(mouseover).build().perform();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 
	}
	
	//sendKeysMethod
	public static void sendText(Object[]inputParameters)
	{
		try{
		String locator=(String) inputParameters[0];
		String sendText=(String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(locator)).sendKeys(sendText);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	//validation
	
	
	public static void validation(Object[]inputParameters)
	{
		try{
		String xpath=(String) inputParameters[0];
		String givenText=(String) inputParameters[1];
		String findedText=driver.findElement(By.xpath(xpath)).getText();
		
		if(findedText.equalsIgnoreCase(givenText))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");	
			}
		
	}
     catch(Exception e)
		{
    	 System.out.println(e);
		}
	}
}
	
	
	
	
	
	

