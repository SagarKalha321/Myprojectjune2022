package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login
{

	@Given ("^User provide browser name as \"(.*)\" and exe location$") 
	public void bLaunch(String bName)
	{	
		Object[]input=new Object[1];
		input[0]=bName;
        
     SeleniumOperations.browserLaunch(input);
	

	}

	@Given ("^user enters url as$") 
	public void openApp()
	{
		
		SeleniumOperations.openApplication();
		
	}


	@Given("^user cancel initial login window$")
	public void click()
	{
		Object[]input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
		
	}


	@When("^user navigate on login tab$")
	public void mouseOverAction()
	{
		Object[]input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object>output3=SeleniumOperations.mouseOverAction(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate on login tab$", output3.get("MESSAGE").toString());
		
	}


	@When("^user click on my profile$")
	public void clickOnElement()
	{
		Object[]input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		Hashtable<String,Object>output4=SeleniumOperations.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on my profile$" , output4.get("MESSAGE").toString());
	}


	@When("^user enter \"([^\"]*)\" as username$")
	public void enterUsername(String username)
	{
		Object[]input5=new Object[2];
	input5[0]="(//*[@type='text'])[2]";
	input5[1]=username;
	Hashtable<String,Object>output5=SeleniumOperations.sendText(input5);
	HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"([^\"]*)\" as username$", output5.get("MESSAGE").toString());
		
	}


	@When("^user enter \"([^\"]*)\" as password$")
	public void enterPassword(String password)
	{Object[]input6=new Object[2];
	input6[0]="//*[@type='password']";
	input6[1]=password;
	Hashtable<String,Object>output6=SeleniumOperations.sendText(input6);
	HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"([^\"]*)\" as password$", output6.get("MESSAGE").toString());
		
	}
	

	@When("^user click on login button$")
	public void logIn()
	{
		Object[]input7=new Object[1];
		input7[0]="(//*[text()='Login'])[3]";
		Hashtable<String,Object>output7=SeleniumOperations.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user click on login button$" , output7.get("MESSAGE").toString());
		
	}


	@Then("^Application shows user profile to user$")
	 public void valid()
	 {
		
		Object[] input8=new Object[2];
    input8[0]="//*[text()='sagar kalhapure']";
    input8[1]="Sagar Kalhapure";
    Hashtable<String,Object>output8=SeleniumOperations.validation(input8);
    HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^Application shows user profile to user$" , output8.get("MESSAGE").toString());	
		
	 }
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

