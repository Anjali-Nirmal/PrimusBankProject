package mapping;

import Utility.SeleniumOperations2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	@Given ("^User launch browser with exe as \"(.*)\"$")
	public void browserLaunch(String exe)
	{
	Object input1 []=new Object[2];
	input1[0]="webdriver.chrome.driver";
	input1[1]=exe;
	SeleniumOperations2.browserLaunch(input1);
	}
	
	@Given ("^User provide url as \"(.*)\"$")
	public void openApp(String url)
	{
		Object input2 []=new Object[1];
		input2[0]=url;
		SeleniumOperations2.openApp(input2);
	}
	
	@When ("^user provide \"(.*)\" as username$")
	public void userName(String uname)
	{
		Object input3 []=new Object[2];
		input3[0]="//*[@id='txtuId']";
		input3[1]=uname;
		SeleniumOperations2.sendText(input3);
	}
	
	@When ("^user provide \"(.*)\" as password$")
	public void passWord(String pwd)
	{
	Object input4 []=new Object[2];
	input4[0]="//*[@name='txtPword']";
	input4[1]=pwd;
	SeleniumOperations2.sendText(input4);
	}	
	@When ("^user click on login button$")
	public void login() 
	{
		Object input5 []=new Object[1];
		input5[0]="//*[@id='login']";
		SeleniumOperations2.clickOnElement(input5);
	}
	
	@Then("^application shows user profile to user$")
	public void validation() 
	{
		Object input6 []=new Object[2];
		input6[0]="Admin";
		input6[1]="//*[text()='Admin']";
		SeleniumOperations2.validation(input6);
	}
			
}
