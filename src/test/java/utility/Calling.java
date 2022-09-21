package utility;

public class Calling
{

	public static void main(String[]args)
	{
		
		//browserLaunch
		
		Object[] input=new Object[2];
		         input[0]="Chrome";
		         input[1]="D:\\automation suport\\chromedriver.exe";
		      SeleniumOperations.browserLaunch(input);
		
		//openApplication
		
		Object[]input1=new Object[1];
		input1[0]="https://www.flipkart.com/";
		
		SeleniumOperations.openApplication(input1);
		
		//clickOncancel
		Object[]input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
		
		
		//mouseOveraction
		Object[]input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.mouseOverAction(input3);
		
		
		//clickOnElement
		Object[]input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		SeleniumOperations.clickOnElement(input4);
		
		//sendKeys
		Object[]input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]="8329567336";
		SeleniumOperations.sendText(input5);
		
		
		//sendKeys
		Object[]input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]="Aeiou4$#";
		SeleniumOperations.sendText(input6);
		
		
		//clickOnElement
		
		Object[]input7=new Object[1];
		input7[0]="(//*[text()='Login'])[3]";
		SeleniumOperations.clickOnElement(input7);
		
		
		//validation
		
		Object[] input8=new Object[2];
		         input8[0]="//*[text()='sagar kalhapure']";
		         input8[1]="Sagar Kalhapure";
		      SeleniumOperations.validation(input8);
	}
	
	
	
	
	
	
	
	
	

}
