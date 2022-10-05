package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageAddress {

	@When("^user click on Manage Address$")
	public void logIn()
	{
		Object[]input8=new Object[1];
		input8[0]="(//*[text()='Login'])[3]";
		Hashtable<String,Object>output8=SeleniumOperations.clickOnElement(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on Manage Address$" , output8.get("MESSAGE").toString());
		
	}
	
	@When("^user click on Add address$")
	public void Addaddres()
	{
		Object[]input9=new Object[1];
		input9[0]="(//*[@class='NS64GK'])[1]";
		Hashtable<String,Object>output9=SeleniumOperations.clickOnElement(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^user click on Add address$" , output9.get("MESSAGE").toString());
	}
	@When("^user enter\"([^\"]*)\" as name$")
	public void enterUsername(String username)
	{
		Object[]input10=new Object[2];
		input10[0]="(//*[@type='text'])[2]";
		input10[1]=username;
		Hashtable<String,Object>output10=SeleniumOperations.sendText(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^user enter\"([^\"]*)\" as name$", output10.get("MESSAGE").toString());
			
	}
	

	@When("^user enter\"([^\"]*)\"as mobile number$")
	public void enterMobilenumber(String mobilenumber)
	{
		Object[]input11=new Object[2];
	input11[0]="(//*[@type='text'])[3]";
	input11[1]=mobilenumber;
	Hashtable<String,Object>output11=SeleniumOperations.sendText(input11);
	HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^user enter\"([^\"]*)\"as mobile number$", output11.get("MESSAGE").toString());
		
	}

	@When("^user enter\"([^\"]*)\"as pincode$")
	public void enterPincode(String pincode)
	{
		Object[]input12=new Object[2];
	input12[0]="(//*[@type='text'])[4]";
	input12[1]=pincode;
	Hashtable<String,Object>output12=SeleniumOperations.sendText(input12);
	HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(), "^user enter\"([^\"]*)\"as pincode$", output12.get("MESSAGE").toString());
		
	}
	
	@When("^user enter\"([^\"]*)\"as locality$")
	public void enterlocality(String locality)
	{
		Object[]input13=new Object[2];
	input13[0]="(//*[@type='text'])[4]";
	input13[1]=locality;
	Hashtable<String,Object>output13=SeleniumOperations.sendText(input13);
	HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(), "^user enter\"([^\"]*)\"as locality$", output13.get("MESSAGE").toString());
		
	}

	@When("^user enter\"([^\"]*)\"as adreess$")
	public void enterAdd(String add)
	{
		Object[]input14=new Object[2];
	input14[0]="//*[@rows='4']";
	input14[1]=add;
	Hashtable<String,Object>output14=SeleniumOperations.sendText(input14);
	HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(), "^user enter\"([^\"]*)\"as adreess$", output14.get("MESSAGE").toString());
		
	}


	
	
	
	
	
	
	
	
	
	
}
