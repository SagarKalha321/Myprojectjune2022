package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{
public static void main(String[]args) throws InterruptedException
{
	
	//FlipkartLogin
	System.setProperty("webdriver.chrome.driver", "D:\\automation suport\\chromedriver.exe");
	
	 
	 ChromeDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.get("https://www.flipkart.com/");
	 
	 //click on cancel
	 driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	 
	 //mouseOverAction
	 Actions act=new Actions(driver);
	 
	 WebElement mouseover=driver.findElementByXPath("//*[@class='_1_3w1N']");
	 
	 act.moveToElement(mouseover).build().perform();
	 
	 //clickOnMyProfile

      driver.findElementByXPath("//*[text()='My Profile']").click();
 
 //enterMobilenumber

  driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("8329567336");
 //enterPassword
   
 driver.findElementByXPath("//*[@type='password']").sendKeys("Aeiou4$#");
 //clickLogin
 
 driver.findElementByXPath("(//*[text()='Login'])[3]").click();
  //ClickOnmanageAddress
 Thread.sleep(5000);
 driver.findElementByXPath("(//*[@class='NS64GK'])[1]").click();
 //clickOnAddaddress

 driver.findElementByXPath("//*[@class='_1QhEVk']").click();
 //enterName

 driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("Sagar");
 
 //enterMobileNumber
 
driver.findElementByXPath("(//*[@type='text'])[3]").sendKeys("9890355946");
 //enterPincoe

driver.findElementByXPath("(//*[@type='text'])[4]").sendKeys("413704");
//enterLocality

driver.findElementByXPath("//*[@tabindex='4']").sendKeys("near ssvmk");
//enterAddress

driver.findElementByXPath("//*[@rows='4']").sendKeys("Khadambe khurd");
//clickonHome

driver.findElementByXPath("//*[@class='_1XFPmK']").click();







}
	
	
	
	
	
	
	
	
	
	
	
	
}
