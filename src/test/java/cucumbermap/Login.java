package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login
{

	@Given("^User provide browser name as \"([^\"]*)\" and exe location as \"([^\"]*)\"$")
	public void bLaunch(String name,String location)
	{	
		Object[] input=new Object[2];
        input[0]="name";
        input[1]="location";
     SeleniumOperations.browserLaunch(input);
	

	}

	@Given("^user enters url as \"([^\"]*)\"$")
	public void openApp(String url)
	{
		Object[]input1=new Object[1];
		input1[0]=url;
		
		SeleniumOperations.openApplication(input1);
		
	}


	@Given("^user cancel initial login window$")
	public void openApp()
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
		SeleniumOperations.mouseOverAction(input3);
		
	}


	@When("^user click on my profile$")
	public void clickOnElement()
	{
		Object[]input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		SeleniumOperations.clickOnElement(input4);
		
	}


	@When("^user enter \"([^\"]*)\" as username$")
	public void enterUsername(String username)
	{
		Object[]input5=new Object[2];
	input5[0]="(//*[@type='text'])[2]";
	input5[1]=username;
	SeleniumOperations.sendText(input5);
	
		
	}


	@When("^user enter \"([^\"]*)\" as password$")
	public void enterPassword(String password)
	{Object[]input6=new Object[2];
	input6[0]="//*[@type='password']";
	input6[1]=password;
	SeleniumOperations.sendText(input6);
	
		
	}
	

	@When("^user click on login button$")
	public void logIn()
	{
		Object[]input7=new Object[1];
		input7[0]="(//*[text()='Login'])[3]";
		SeleniumOperations.clickOnElement(input7);
		
		
	}


	@Then("^Application shows user profile to user$")
	 public void valid()
	 {
		
		Object[] input8=new Object[2];
    input8[0]="//*[text()='sagar kalhapure']";
    input8[1]="Sagar Kalhapure";
 SeleniumOperations.validation(input8);
		
		
	 }
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

